import 'package:flutter/material.dart';

import 'StartPage.dart';

class RouteGenerator {
  static Route<dynamic> generateRoute(RouteSettings settings) {
    final args = settings.arguments;

    switch (settings.name) {
      case '/first':
        return MaterialPageRoute(builder: (_) => StartPage());
      default:
        return _errorRoute();
    }
  }

  static Route<dynamic> _errorRoute() {
    return MaterialPageRoute(builder: (_) {
      return Scaffold(
          body: Center(
        child: Column(
          children: [
            ElevatedButton(
                onPressed: () {},
                child: const Text(
                  'Go Back',
                  style: TextStyle(fontSize: 30),
                )),
            const Text(
              'Dont go back this far',
              style: TextStyle(fontSize: 30),
            ),
          ],
        ),
      ));
    });
  }
}
