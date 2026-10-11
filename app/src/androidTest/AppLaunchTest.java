package com.fedpromptly.musenumbertwo;

import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class AppLaunchTest {
    @Test public void launchesBundledOfflinePage() {
        try (ActivityScenario<MainActivity> scenario = ActivityScenario.launch(MainActivity.class)) {
            scenario.onActivity(activity -> {
                ViewGroup content = activity.findViewById(android.R.id.content);
                assertTrue(content.getChildCount() > 0);
                assertTrue(content.getChildAt(0) instanceof WebView);
                WebView web = (WebView) content.getChildAt(0);
                assertEquals("file:///android_asset/site/index.html", web.getUrl());

                try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                        activity.getAssets().open("site/index.html"), StandardCharsets.UTF_8))) {
                    StringBuilder html = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) html.append(line);
                    String page = html.toString();
                    assertTrue(page.contains("5F2V31"));
                    assertTrue(page.contains("https://muse.ai/join"));
                    assertTrue(page.contains("promo/promo-hero-blob.gif"));
                } catch (Exception e) {
                    throw new AssertionError("Bundled offline page could not be read", e);
                }
            });
        }
    }
}
