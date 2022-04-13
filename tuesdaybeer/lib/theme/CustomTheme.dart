import 'package:flutter/material.dart';

import 'CustomColors.dart';

class CustomTheme {
  static ThemeData get lightTheme {
    //1
    return ThemeData(
        //2
        primaryColor: Colors.deepOrange,
        scaffoldBackgroundColor: Colors.white,
        fontFamily: 'Regular',
        //3
        appBarTheme: const AppBarTheme(
          titleTextStyle: TextStyle(),
          backgroundColor: Colors.black26,
          foregroundColor: Colors.greenAccent,
        ),
        buttonTheme: ButtonThemeData(
          shape:
              RoundedRectangleBorder(borderRadius: BorderRadius.circular(30)),
          buttonColor: Colors.deepOrange,
        ),
        floatingActionButtonTheme: FloatingActionButtonThemeData(
          backgroundColor: CustomColors.bgColorAccent,
          foregroundColor: CustomColors.lineColorAccent,
        ));
  }

  static ThemeData get darkTheme {
    return ThemeData(
      primaryColor: Colors.green,
      scaffoldBackgroundColor: CustomColors.bgColor,
      fontFamily: 'Regular',
      appBarTheme: AppBarTheme(
        backgroundColor: CustomColors.bgColor,
        elevation: 5,
      ),
      buttonTheme: ButtonThemeData(
        shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(30)),
        buttonColor: Colors.deepOrange,
      ),
      floatingActionButtonTheme: FloatingActionButtonThemeData(
        backgroundColor: CustomColors.bgColor,
        foregroundColor: CustomColors.lineColor,
      ),
    );
  }
}
