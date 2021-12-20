import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class FirstPage extends StatefulWidget {
  @override
  State<FirstPage> createState() => _FirstPageState();
}

class _FirstPageState extends State<FirstPage> {
  static const double fs = 30;
  static const String font = 'montserrat';

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Center(
          child: Text(
            'Första sidan',
            style: TextStyle(fontSize: 30),
          ),
        ),
      ),
      body: Center(
        child: ListView(
          scrollDirection: Axis.vertical,
          padding: const EdgeInsets.all(20.0),
          children: [
            ListTile(
              title: const Text("Max",
                  style: TextStyle(fontSize: fs, fontFamily: font)),
              onTap: () {
                ScaffoldMessenger.of(context).showSnackBar(const SnackBar(
                  content: Text("Max"),
                ));
              },
            ),
            ListTile(
              title: (const Text("Fredrik",
                  style: TextStyle(fontSize: fs, fontFamily: font))),
              onTap: () {
                ScaffoldMessenger.of(context).showSnackBar(const SnackBar(
                  content: Text("Fredrik"),
                ));
              },
            ),
            ListTile(
              title: (const Text("Alice",
                  style: TextStyle(fontSize: fs, fontFamily: font))),
              onTap: () {
                ScaffoldMessenger.of(context).showSnackBar(const SnackBar(
                  content: Text("Alice"),
                ));
              },
            ),
            ListTile(
              title: (const Text("Johanna",
                  style: TextStyle(fontSize: fs, fontFamily: font))),
              onTap: () {
                ScaffoldMessenger.of(context).showSnackBar(const SnackBar(
                  content: Text("Johanna"),
                ));
              },
            ),
            ListTile(
              title: (const Text("Eva",
                  style: TextStyle(fontSize: fs, fontFamily: font))),
              onTap: () {
                ScaffoldMessenger.of(context).showSnackBar(const SnackBar(
                  content: Text("Eva"),
                ));
              },
            ),
            ListTile(
              title: (const Text("Ebba",
                  style: TextStyle(fontSize: fs, fontFamily: font))),
              onTap: () {
                ScaffoldMessenger.of(context).showSnackBar(const SnackBar(
                  content: Text("Ebba"),
                ));
              },
            ),
            ListTile(
              title: (const Text("Klara",
                  style: TextStyle(fontSize: fs, fontFamily: font))),
              onTap: () {
                ScaffoldMessenger.of(context).showSnackBar(const SnackBar(
                  content: Text("Klara"),
                ));
              },
            ),
          ],
        ),
      ),
      drawer: Drawer(
          child: ListView(
        children: [
          const DrawerHeader(
            child: Center(
              child: Text(
                'Header',
                style: TextStyle(fontFamily: 'permanent', fontSize: fs),
              ),
            ),
          ),
          ListTile(
            title: const Text('Städ'),
            onTap: () {
              Navigator.of(context).pushNamed('/städ');
            },
          )
        ],
      )),
    );
  }
}
