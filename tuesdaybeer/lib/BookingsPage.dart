import 'dart:developer';

import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:tuesdaybeer/theme/CustomColors.dart';

import 'Nation.dart';

double fs = 30;
List<Nation> nations = [];

class BookingsPage extends StatefulWidget {
  @override
  State<BookingsPage> createState() => _BookingsPageState();
}

class _BookingsPageState extends State<BookingsPage> {
  @override
  void initState() {
    super.initState();

    nations.add(Nation("Vdala", "18", "01"));
    nations.add(Nation("Uplands", "18", "00"));
    nations.add(Nation("Värmlands", "18", "00"));
    nations.add(Nation("Stocken", "18", "00"));
    nations.add(Nation("Norrlands", "18", "00"));
    nations.add(Nation("Gotlands", "18", "00"));
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text("Bookings"),
        ),
        body: Column(
          children: [
            Row(
              children: [
                const Spacer(),
                Text(
                  "Nations",
                  style: TextStyle(
                    fontSize: fs,
                    color: CustomColors.textColor,
                  ),
                ),
                const Spacer(
                  flex: 2,
                ),
                Text(
                  "Open/Close",
                  style: TextStyle(
                    fontSize: fs,
                    color: CustomColors.textColor,
                  ),
                ),
                const Spacer(),
              ],
            ),
            Expanded(
              child: ListView.builder(
                  itemCount: nations.length,
                  itemBuilder: (BuildContext context, int index) {
                    return ListTile(
                      onTap: () {
                        ScaffoldMessenger.of(context).showSnackBar(
                          SnackBar(
                            action: SnackBarAction(textColor: CustomColors.lineColor,
                              onPressed: () {
                                log("success");
                              },
                              label: 'Confirm',
                            ),
                            content: Text(
                              "Book " + nations[index].name + "?",
                              style: TextStyle(
                                  fontSize: fs - 15,
                                  color: CustomColors.textColor),
                            ),
                          ),
                        );
                      },
                      title: Row(
                        children: [
                          Text(
                            nations[index].name,
                            style: TextStyle(
                              fontSize: fs,
                              color: CustomColors.textColor,
                            ),
                          ),
                          const Spacer(),
                          Text(
                            nations[index].open + " - " + nations[index].close,
                            style: TextStyle(
                              fontSize: fs - 10,
                              color: CustomColors.textColor,
                            ),
                          ),
                          const SizedBox(width: 100)
                        ],
                      ),
                    );
                  }),
            )
          ],
        ));
  }
}
