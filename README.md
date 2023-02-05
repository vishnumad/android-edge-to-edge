![screenshots](https://user-images.githubusercontent.com/3137711/216839261-7721b49f-3dc4-4b2e-8955-4b437a91a507.png)

An Expo native module that lays out Android apps [edge to edge](https://developer.android.com/develop/ui/views/layout/edge-to-edge)


## Installation

```sh
npm i android-edge-to-edge
```

**Note:** For bare React Native projects, add Expo modules support to your app - [Expo Docs](https://docs.expo.dev/bare/installing-expo-modules/)


## Change navigation bar button color

Use the `expo-navigation-bar` package - [Expo Docs](https://docs.expo.dev/versions/latest/sdk/navigation-bar/#navigationbarsetbuttonstyleasyncstyle)

```js
import { setButtonStyleAsync } from "expo-navigation-bar";

setButtonStyleAsync("dark"); // or "light"
```

[See Example](https://github.com/vishnumad/android-edge-to-edge/blob/master/example/App.tsx)

## Handle window insets

Use the `react-native-safe-area-context` package - [Github](https://github.com/th3rdwave/react-native-safe-area-context)
