import 'package:flutter/material.dart';
import 'package:flutter_localizations/flutter_localizations.dart';

import 'RouteGenerator.dart';

void main() {
  runApp(MaterialApp(
    title: 'KorridorApp',
    home: MyApp(),
  ));
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      localizationsDelegates: [
        GlobalMaterialLocalizations.delegate,
        GlobalWidgetsLocalizations.delegate,
        GlobalCupertinoLocalizations.delegate,
      ],
      initialRoute: '/',
      onGenerateRoute: RouteGenerator.generateRoute,
    );
  }
}
