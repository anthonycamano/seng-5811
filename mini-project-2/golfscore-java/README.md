golfscore-java
==============
GolfScore is a command-line program used to generate reports of golfers' results for a golf tournament.


Requirements
------------
Java 8+ JRE (or JDK) (we only tested this using Java 8, so use newer versions with caution).

### Installing Java 8
#### Ubuntu
On Ubuntu 16.04 and up, to install Java (OpenJDK) run:

    sudo apt update
    sudo apt install openjdk-8-jdk
    
If you'd rather run Oracle Java, run:

    sudo add-apt-repository ppa:webupd8team/java
    sudo apt update
    sudo apt install oracle-java8-installer
    
#### Windows / MacOS
To install Java, download either the JRE or the JDK installer from: 
  http://www.oracle.com/technetwork/java/javase/downloads/index.html

#### Other *NIX Distributions
Please refer to the documentation for your distribution.


Executing
---------
To execute golfscore-java:
   1. Unzip/untar the archive.
   2. On the command line, navigate to the `bin/` directory in the location 
   where you expanded the archive.
   3. Run the following command:
    
      On Windows:
          
          golf <OPTIONS>+ <INPUT_FILE> <OUTPUT_DIRECTORY>
          
      On *NIX (including macOS):
      
          ./golf <OPTIONS>+ <INPUT_FILE> <OUTPUT_DIRECTORY>
          
      
Please refer to the SRS for information on each of the command line parameters. 
