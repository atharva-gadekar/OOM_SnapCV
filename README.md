# SnapCV
*SnapCV© is a computer application which will help students of IIIT Allahabad
in making their CVs/ Resumes quite easily. They will be provided with varieties
of templates and all they would have to do is to provide information for the fields, then they will get a ready Resume/CV.*
***

### Purpose:
- Easing the task of making an organized and structured Resume
- To provide a way for students to structure and design/customize their resumes online according to their requirements
- SnapCV© is aimed to fasten the laborious process of CV making. SnapCV©’s templates provide the use the choice to create a resume that the user needs.

### Technologies Used:
- Java Language
- JavaFX Framework


### Understanding the Code
- Refer to the JavaFx documentation to undersand the concepts of ```Scene```, ```Stage```, ```fxml```
- Firstly, the ```Main.java``` file gets executed. The ```main``` function is executed, which inturn calls the ```start``` function.
- The line ```Parent root = FXMLLoader.load(getClass().getResource("styles/ResumeUI.fxml"));``` loads the ```ResumeUI.fxml``` file into the root variable.
- The ```start``` function then creates a stage and a scene where it loads the ```ResumeUI.fxml``` while setting its title and icon.
- When a button is clicked in the opened window, its associated function in the ```MainController.java``` file is executed. For eg, The ```Personalinfo``` function is executed after the user clicks on **Personal Information**
- Taking the example of ```Personalinfo``` function getting executed, a new scene is created along with a new stage. The ```PersonalInfof.fxml``` file is loaded into the stage.
- When the ```Save``` button is clicked in the opened window, its associated function ```saveButton``` in the ```Personal.java``` file is executed. This function sets the values of the multiple public variables of the ```GenerateResume.java``` file. After setting the values, the window is closed.
- Similarly, all other functions are executed in the same way.
- The ```Browse``` button allows the user to select the destination where is the file (Generated Resume) is supposed to be stored.
- The ```Choose Template``` button allows the user to select among the there templates given. After clicking on it, the ```Choose``` function is executed in the ```MainController.java``` file. It loads the ```Choose.fxml``` and makes a new stage and scene. 
- The ```Choose.java``` file is executed when the user selects on the given templates. The associated functions set the value of the ```Template``` variable of the ```GenerateResume.java``` file to either 1 or 2 or 3, depending upon what option is choosen.
- When the user clicks on ```Generate Resume```, a Resume is generated with the selected template.
- This is done using the HTML to PDF library. We use the values of the variables that we got from the user and insert them in HTML code. We then convert this HTML to PDF. The HTML depends on the value of the ```Template``` variable.
- The ```More Help``` button plays a tutorial video guiding the user how to use this application. This was done using the JavaFX Webview and Webengine libraries. 


### How to setup
1. Clone the repository through the following link.
```
https://github.com/atharva-gadekar/OOM_SnapCV.git
```
2. Download the Intellij Idea IDE using **[this](https://www.jetbrains.com/idea/download/#section=windows)** link.
3. Next, Follow **[this](https://www.jetbrains.com/help/idea/javafx.html)** link for guidance.
4. Open the project in Intellij Idea IDE and trust the project to include itext libraries.
5. Download JavaFx Framework to your project using **[this](https://gluonhq.com/products/javafx/)** link. Make sure that the type you download is SDK.
6. Download the SLF4J Simple Binding version 1.7.25 Library using **[this](https://mvnrepository.com/artifact/org.slf4j/slf4j-simple/1.7.25)** link.
7. Import both the libraries into the project. Follow **[these](https://stackoverflow.com/questions/60507777/how-to-import-library-in-intellij)** steps to do so.
8. Run the Project ( ```Main.java``` file )and Google if there are any errors in the Terminal. This code is error free. The errors that you might get would definitely be because of incorrect library installation.

***
### Contributors
<table>
  <tr>
    <td align="center"><a href="https://github.com/atharva-gadekar"><img src="https://avatars.githubusercontent.com/u/97454406?s=400&u=759abd07b264a0e0a0b0e54febe65684816f2a05&v=4" width="150px;" alt=""/><br /><sub><b>Atharva Gadekar</b></sub></a></td>
    <td align="center"><a href="https://github.com/ananyaa07"><img src="https://avatars.githubusercontent.com/u/97439364?v=4" width="150px;" alt=""/><br /><sub><b>Ananya Goyal</b></sub></a></td>
    <td align="center"><a href="https://github.com/Political-vulture"><img src="https://avatars.githubusercontent.com/u/93772451?v=4" width="150px;" alt=""/><br /><sub><b>Aditya Sharma</b></sub></a></td>
 </tr>
</table>

***
### Snapshots
<p float="left">
  <img src="https://github.com/gudelakshmi/CV-Maker/blob/main/snap%20shots/home%20page.png" height="300px;" alt=""/>
  <img src="https://github.com/gudelakshmi/CV-Maker/blob/main/snap%20shots/education.png" height="300px;" alt=""/>
  <img src="https://github.com/gudelakshmi/CV-Maker/blob/main/snap%20shots/work%20exp.png" height="300px;" alt=""/>
</p>
