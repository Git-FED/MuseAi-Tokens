# Muse Number Two — app-first Android wrapper

The Android APK is the product. It wraps an offline Muse referral experience under `app/src/main/assets/site/` and carries the referral code, favicon, CSS, JavaScript, and promotional images inside the APK.

The bundled page opens from `file:///android_asset/site/index.html`, displays code `5F2V31`, and sends the Muse join link and Discord invite to the system browser. Token Town is downstream promotional/checkout material, not the product app itself.

This is an unofficial wrapper and is not affiliated with muse.ai.

## Build

```bash
bash scripts/build.sh
```

A complete build requires Android SDK tooling and Gradle/Android Studio. The GitHub Actions workflow assembles and uploads a debug APK on each push.

## Windows desktop app

The `desktop-electron/` folder builds a Windows Electron installer and portable app. The desktop app opens `https://muse.ai/` and requires an internet connection; the Android app uses its bundled offline page.
