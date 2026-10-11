# Muse Number Two — app-first Android wrapper

The Android APK is the product. It wraps an offline Muse referral experience under `app/src/main/assets/site/` and carries the referral code, favicon, and comedic promotional images as app assets.

The bundled page opens from `file:///android_asset/site/index.html`, displays code `5F2V31`, and sends the Muse join link to the system browser. Token Town is downstream promotional/checkout material, not the app itself.

This is an unofficial wrapper and is not affiliated with muse.ai.

## Build

```bash
bash scripts/build.sh
```

A complete build requires Android SDK tooling and Gradle/Android Studio. The GitHub Actions workflow assembles and uploads a debug APK on each push.
