import React from 'react';
import {NavigationContainer} from '@react-navigation/native';
import {createStackNavigator} from '@react-navigation/stack';
import HomeScreen from '../screens/HomeScreen';
import DetailScreen from '../screens/DetailScreen';

const Stack = createStackNavigator();

const RootStackScreen = () => {
  return (
    <NavigationContainer>
      <Stack.Navigator
        initialRouteName="Home"　//最初の画面
        screenOptions={{
            headerStyle: {
                backgroundColor: "#265366",
            },
            headerTintColor: "#fff",
            headerTitleStyle: {
                fontWeight: "bold",
            },
        }}>
        <Stack.Screen name="Home" component={HomeScreen} />
        <Stack.Screen name="Detail" component={DetailScreen} />
      </Stack.Navigator>
    </NavigationContainer>
  );
};

export default RootStackScreen;