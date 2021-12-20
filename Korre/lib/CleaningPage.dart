import 'package:flutter/material.dart';

import 'Utils.dart';

class CleaningPage extends StatefulWidget {
  @override
  State<StatefulWidget> createState() {
    return _CleaningPageState();
  }
}

class _CleaningPageState extends State<CleaningPage> {
  DateTime selectedDate = DateTime.now();
  String currCleaner = "Max";
  late int weekNumber;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(currCleaner),
      ),
      body: Row(
        children: [
          Center(
            child: ElevatedButton(
              child: const Text('Kolla datum'),
              onPressed: () => _selectDate(context),
            ),
          ),
          Center(
            child: ElevatedButton(
              child: Text('Få veckonummer'),
              onPressed: () {

                ScaffoldMessenger.of(context).showSnackBar(SnackBar(
                  content: Text(weekNumber.toString()),
                ));
              },
            ),
          ),
          Center(
            child: ElevatedButton(
              child: Text('Få städare'),
              onPressed: () {
                String cleaner = getCleanerFromWeekNumber(weekNumber);
                ScaffoldMessenger.of(context).showSnackBar(SnackBar(
                  content: Text(cleaner),
                ));
              },
            ),
          ),
        ],
      ),
    );
  }

  void _selectDate(BuildContext context) async {
    final DateTime? picked = await showDatePicker(
      context: context,
      locale: const Locale('sv'),
      initialDate: DateTime.now(),
      // Refer step 1
      firstDate: DateTime(2020),
      lastDate: DateTime(2025),
    );
    if (picked != null && picked != selectedDate) {
      setState(() {
        selectedDate = picked;
        weekNumber = Utils.weekNumber(selectedDate);
      });
    }
  }
  String getCleanerFromWeekNumber(int weekNumber){
    String name = "ingen";
    if (weekNumber % 1 == 1){ //max
      name = "Max";
    }
    else if (weekNumber % 2 == 1){//fredrik
      name = "Fredrik";
    }

    else if (weekNumber % 3 == 1){//alice
      name = "Alice";
    }

    else if (weekNumber % 4 == 1){//johanna
      name = "Johanna";
    }

    else if (weekNumber % 5 == 1){//eva
      name = "Eva";
    }

    else if (weekNumber % 6 == 1){//ebba
      name = "Ebba";
    }

    else if (weekNumber % 7 == 1){//klara
      name = "Klara";
    }
    return name;
  }
}
