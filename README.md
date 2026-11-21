# Rayan Life RPG — GitHub APK build

This repository is configured to build an Android debug APK with GitHub Actions.

## Create the GitHub repository

1. Sign in at https://github.com and create a new repository (for example, `rayan-life-rpg`).
2. Choose **Public** or **Private**. Either works. Do not initialize it with another README if you plan to upload these files as-is.
3. On the new repository page, choose **Add file → Upload files**.
4. Extract this ZIP on your device/computer, then upload the contents of the extracted folder. The `.github` folder is important; make sure it is included.
5. Commit the files to the `main` branch.

## Build and download the APK

1. Open the repository's **Actions** tab.
2. Select **Build Android APK**.
3. If it has not started automatically after your commit, choose **Run workflow → Run workflow**.
4. Wait for the run to finish with a green check mark.
5. Open that successful run and scroll to **Artifacts**.
6. Download **Rayan-Life-RPG-debug-APK** and extract it. Inside is `app-debug.apk`.
7. Transfer the APK to your Android phone and install it. Android may ask you to allow installation from that browser/file manager; only install APKs you built from your own repository.

## Notes

- This workflow builds a **debug APK**, suitable for testing and sideloading. It is not a Play Store release-signed APK.
- GitHub Actions artifacts are retained for 14 days by this workflow; download your APK before then.
- The app uses local assets and local device storage for its core features. Your browser preview save and installed APK save are separate.
- If the workflow fails, open the failed run and inspect the first red step and its error log.
