import { Button, StyleSheet } from "react-native";
import { StatusBar } from "expo-status-bar";
import { setButtonStyleAsync } from "expo-navigation-bar";
import { useEffect, useState } from "react";
import { LinearGradient } from "expo-linear-gradient";

export default function App() {
  const [darkTheme, setDarkTheme] = useState(false);

  useEffect(() => {
    setButtonStyleAsync(darkTheme ? "light" : "dark");
  }, [darkTheme]);

  const toggleTheme = () => setDarkTheme((prev) => !prev);

  const backgroundGradient = darkTheme
    ? ["#000a82", "#c65f33"]
    : ["#D3EEF4", "#F1EEC8"];

  return (
    <LinearGradient style={styles.container} colors={backgroundGradient}>
      <Button title="Toggle Theme" onPress={toggleTheme} />
      <StatusBar style={darkTheme ? "light" : "dark"} />
    </LinearGradient>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: "center",
    justifyContent: "center",
  },
});
