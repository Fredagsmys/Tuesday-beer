import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/painting.dart';
import 'package:tuesdaybeer/theme/CustomColors.dart';

import 'Guest.dart';

class GuestsPage extends StatefulWidget {
  @override
  State<GuestsPage> createState() => _GuestsPageState();
}

double fs = 30;

class _GuestsPageState extends State<GuestsPage> {
  List<Guest> guestList = [Guest("Max"), Guest("Rasmus")];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text("Bookings"),
        ),
        body: Column(
          children: [
            Expanded(
              child: ListView.builder(
                  itemCount: guestList.length,
                  itemBuilder: (BuildContext context, int index) {
                    return ListTile(
                      title: Text(
                        guestList[index].name,
                        style: TextStyle(
                            fontSize: fs,
                            color: CustomColors.textColor,
                            fontWeight: FontWeight.bold),
                      ),
                    );
                  }),
            ),
            Spacer(),
            ElevatedButton(
              onPressed: () {},
              child: Text('Öl tack!',
                  style: TextStyle(
                      color: CustomColors.textColorAccent, fontSize: fs,)),
              style: ElevatedButton.styleFrom(
                primary: CustomColors.lineColor,
                minimumSize: const Size(350, 50), // NEW
              ),
            )
          ],
        ));
  }
}
