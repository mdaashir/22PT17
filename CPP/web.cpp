#include <cstdlib>
#include <iostream>
#include <string>

using namespace std;

int main()
{
    // Specify the URL to open in the web browser
    string url = "https://www.google.com";

    // Construct a command to open the URL in the default web browser
    string command;
    #ifdef _WIN32
        command = "start " + url;  // For Windows
    #elif __APPLE__
        command = "open " + url;   // For Mac OS X
    #else
        command = "xdg-open " + url;   // For Linux
    #endif

    // Use the system() function to execute the command and open the web browser
    system(command.c_str());

    return 0;
}
