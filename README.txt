OP Loot Fabric Mod (1.21.5) - Ready-to-build source (with GitHub Actions)
---------------------------------------------------------------------

What this archive contains:
  - A Fabric mod project skeleton for Minecraft 1.21.5.
  - Guaranteed OP loot for all hostile mobs and ultra-OP loot for bats.
  - Loot JSONs include forced enchantment NBT (e.g., Protection IV, Mending, Infinity, Punch II).
  - A GitHub Actions workflow (.github/workflows/build.yml) that builds the mod and uploads the jar as an artifact.

Two easy ways to get a prebuilt .jar file:
1) GitHub (recommended, no local install):
   - Create a new GitHub repository on your account.
   - Upload everything from this folder (preserve .github folder).
   - Push to GitHub (or use the web upload).
   - Go to the repository -> Actions. The workflow 'Build mod' will run automatically.
   - When the workflow finishes, go to Actions -> latest run -> Artifacts -> download the built jar.

2) Build locally (requires Java 17+ and Gradle wrapper):
   - Install Java 17 JDK.
   - Open a terminal in this folder.
   - Make gradlew executable (Linux/Mac): chmod +x gradlew
   - Run: ./gradlew build   (Windows: gradlew.bat build)
   - Find jar in build/libs/

Notes about enchantments:
  - Some enchantment combos (Infinity + Mending) are normally incompatible; this mod forces them via NBT.
  - Armor has Protection IV as requested.

If you want, I can guide you step-by-step to push this to GitHub and download the artifact.
