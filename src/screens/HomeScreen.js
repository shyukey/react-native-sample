import React, { Component } from 'react';
import {NativeModules, StyleSheet, View, Text, Button} from 'react-native';

export default class HomeScreen extends Component<Props> {
  constructor(props) {
    super(props);
    this.state = {batteryLevel:''};
    var DeviceInformation = NativeModules.DeviceInformation;
    DeviceInformation.getOSInfo((os, level) => {
      this.setState({batteryInfo: `${os} ${level}`});
    });
  }
  render() {
    return (
      <View style={styles.container}>
        <Text>HomeScreen</Text>
        <Button
          title="Detail画面に遷移する"
          onPress={() => {
            this.props.navigation.navigate('Detail');
          }}
        />
        <Text>OS:{this.state.batteryInfo}</Text>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
});
