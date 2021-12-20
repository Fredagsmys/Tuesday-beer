import 'package:flutter/material.dart';

import 'CleaningPage.dart';
import 'FirstPage.dart';

class RouteGenerator {
  static Route<dynamic> generateRoute(RouteSettings settings) {
    final args = settings.arguments;

    switch (settings.name) {
      case '/':
        return MaterialPageRoute(builder: (_) => FirstPage());
      case '/städ':
        return MaterialPageRoute(builder: (_) => CleaningPage());

      default:
        return _errorRoute();
    }
  }

  static Route<dynamic> _errorRoute() {
    return MaterialPageRoute(builder: (_) {
      return const Scaffold(
          body: Center(
        child: Text(
          'ERROR',
          style: TextStyle(fontSize: 30),
        ),
      ));
    });
  }
}
