# Platform launch behavior

All three entry points open the same destination: `https://muse.ai/`.

- **Android app:** `MainActivity` loads the URL directly in its WebView.
- **HTML:** `index.html` redirects to the URL and retains a visible fallback link.
- **Windows desktop app:** Electron `main.js` calls `BrowserWindow.loadURL('https://muse.ai/')`.

The desktop app is an unofficial Electron launcher and requires an internet connection to display the remote site.
