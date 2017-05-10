# example-java-inheritance
Example Java project created via STS as Java Project, showing how to;
- create interfaces (Person, Studying, Teaching), 
- create abstract base class that contain some common attribute and methods of classes that implement an interface (PersonBase),
- create multiple implementation classes of an interface (Professor, Student), 
- a class implementing multiple interfaces (Student, Professor), 
- polymorphism, users of implementations of an interface to view them via interface (MainEntryClass.main),

## Setup dependencies
Make sure on your machine, you have;
- git installed
- a working unix shell (like git bash. If not there install git and use its "git bash")
- working JDK installed (with JAVA_HOME env variable added, and PATH env variable prefixed with %JAVA_HOME%/bin)

## How to use it  (NOTE in below the directory structure and names are suggested)
### Make sure you created the directory structure you want to store example projects in
As example, at bash command line issue;<br>
mkdir -p /c/it114/exampleProjects

### get(clone) the project from github
cd to where you put your example projects.<br>
As example, at bash command line issue;<br>
cd /c/it114/exampleProjects ) <br>
git clone https://github.com/njit-it114/example-java-inheritance.git <br>
or<br>
git clone https://github.com/njit-it114/example-java-inheritance.git  whateverDirectoryNameYouWantStuffToBeClonedInto

## Project directory structure
- README.md this read me file
- src directory of java packages
- design directory of design documents, like class diagram
 