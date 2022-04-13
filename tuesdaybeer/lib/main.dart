import 'package:flutter/material.dart';
import 'package:tuesdaybeer/theme/CustomTheme.dart';

import 'RouteGenerator.dart';

void main() {
  runApp(MaterialApp(
    title: 'Odlingino',
    home: MyApp(),
    debugShowCheckedModeBanner: false,
  ));
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        theme: CustomTheme.darkTheme,
        initialRoute: '/first',
        onGenerateRoute: RouteGenerator.generateRoute);
  }
}
