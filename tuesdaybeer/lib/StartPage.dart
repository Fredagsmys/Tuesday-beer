import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:tuesdaybeer/theme/CustomColors.dart';

import 'BookingsPage.dart';
import 'GuestsPage.dart';


class StartPage extends StatefulWidget {
  @override
  State<StartPage> createState() => _StartPageState();
}

class _StartPageState extends State<StartPage> {

  int selectedItem = 0;



  @override
  Widget build(BuildContext context) {
    List<Widget> pages = [BookingsPage(), GuestsPage()];
    return Scaffold(
      body: IndexedStack(
        index: selectedItem,
        children: pages,
      ),

      bottomNavigationBar: BottomNavigationBar(
        items: const [
          BottomNavigationBarItem(icon: Icon(Icons.book), label: "Bookings"),
          BottomNavigationBarItem(icon: Icon(Icons.format_list_numbered_rounded), label: "Guests")
        ],currentIndex: selectedItem,
        onTap: (value){
          setState(() {
            selectedItem = value;
          });

        },
        backgroundColor: CustomColors.bgColor,
        selectedFontSize: 17,
        selectedIconTheme:  IconThemeData(color: CustomColors.lineColor, size: 40),
        selectedItemColor: CustomColors.lineColor,
        selectedLabelStyle: const TextStyle(fontWeight: FontWeight.bold),
        unselectedItemColor: CustomColors.lineColorAccent,
        unselectedFontSize: 13,
      ),
    );

  }
}
