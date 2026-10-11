# Testing

## Emulator install

1. Build with `bash scripts/build.sh`.
2. Install with `adb install -r app/build/outputs/apk/debug/app-debug.apk`.
3. Launch **Muse Number Two** from the app drawer.

## Offline acceptance checklist

- App opens with airplane mode on.
- `index.html` loads from `file:///android_asset/site/`.
- The favicon is present in the bundled site.
- Promo GIFs animate; reduced-motion behavior remains usable.
- Referral code `5F2V31` is visible.
- The Muse join button opens in the system browser.
- Back button goes through WebView history.
- Launcher icon resources exist for all density buckets.
