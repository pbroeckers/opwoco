/* opwoco - mobile java client for the opwoco.net service
* Copyright (C) 2008  Christofer Wesseling, Chui Fong Mok
*
* This program is free software; you can redistribute it and/or
* modify it under the terms of the GNU General Public License
* as published by the Free Software Foundation
* applicable version is GPL version 2 only.
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* You should have received a copy of the GNU General Public License
* Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*/


package opwoco;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import org.netbeans.microedition.lcdui.LoginScreen;
import org.netbeans.microedition.lcdui.SimpleTableModel;
import org.netbeans.microedition.lcdui.SplashScreen;
import org.netbeans.microedition.lcdui.WaitScreen;
import org.netbeans.microedition.util.SimpleCancellableTask;

/**
 * @author Christofer
 */
public class HelloMIDlet extends MIDlet implements CommandListener {

    private boolean midletPaused = false;
    private String theVersion = "0.2alpha";

    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command exitCommand;
    private Command LoginCommand;
    private Command backCommand;
    private Command UpdateCommand;
    private Command AboutCommand;
    private Command backCommand1;
    private Command backCommand3;
    private Command backCommand2;
    private Form mainForm;
    private StringItem stringItem;
    private SplashScreen splashScreen;
    private LoginScreen loginScreen;
    private WaitScreen waitScreen;
    private Form loginOK;
    private TextField textField;
    private Form UpdateForm;
    private Form About;
    private StringItem stringItem3;
    private StringItem stringItem4;
    private StringItem stringItem1;
    private Image image2;
    private SimpleTableModel tableModel1;
    private SimpleCancellableTask task;
    //</editor-fold>//GEN-END:|fields|0|

    /**
     * The HelloMIDlet constructor.
     */
    public HelloMIDlet() {
    }

    //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    //</editor-fold>//GEN-END:|methods|0|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initilizes the application.
     * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
    //</editor-fold>//GEN-END:|0-initialize|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getSplashScreen());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
    //</editor-fold>//GEN-END:|3-startMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
    //</editor-fold>//GEN-END:|4-resumeMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
     * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
    //</editor-fold>//GEN-END:|5-switchDisplayable|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a particular displayable.
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == About) {//GEN-BEGIN:|7-commandAction|1|75-preAction
            if (command == backCommand2) {//GEN-END:|7-commandAction|1|75-preAction
                // write pre-action user code here
                switchDisplayable(null, getMainForm());//GEN-LINE:|7-commandAction|2|75-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|3|72-preAction
        } else if (displayable == UpdateForm) {
            if (command == backCommand1) {//GEN-END:|7-commandAction|3|72-preAction
                // write pre-action user code here
                switchDisplayable(null, getMainForm());//GEN-LINE:|7-commandAction|4|72-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|5|78-preAction
        } else if (displayable == loginOK) {
            if (command == backCommand3) {//GEN-END:|7-commandAction|5|78-preAction
                // write pre-action user code here
                switchDisplayable(null, getMainForm());//GEN-LINE:|7-commandAction|6|78-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|7|35-preAction
        } else if (displayable == loginScreen) {
            if (command == LoginScreen.LOGIN_COMMAND) {//GEN-END:|7-commandAction|7|35-preAction
                // write pre-action user code here
                switchDisplayable(null, getWaitScreen());//GEN-LINE:|7-commandAction|8|35-postAction
                // write post-action user code here
            } else if (command == backCommand) {//GEN-LINE:|7-commandAction|9|38-preAction
                // write pre-action user code here
                switchDisplayable(null, getMainForm());//GEN-LINE:|7-commandAction|10|38-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|11|62-preAction
        } else if (displayable == mainForm) {
            if (command == AboutCommand) {//GEN-END:|7-commandAction|11|62-preAction
                // write pre-action user code here
                switchDisplayable(null, getAbout());//GEN-LINE:|7-commandAction|12|62-postAction
                // write post-action user code here
            } else if (command == LoginCommand) {//GEN-LINE:|7-commandAction|13|23-preAction
                // write pre-action user code here
                switchDisplayable(null, getLoginScreen());//GEN-LINE:|7-commandAction|14|23-postAction
                // write post-action user code here
            } else if (command == UpdateCommand) {//GEN-LINE:|7-commandAction|15|58-preAction
                // write pre-action user code here
                switchDisplayable(null, getUpdateForm());//GEN-LINE:|7-commandAction|16|58-postAction
                // write post-action user code here
            } else if (command == exitCommand) {//GEN-LINE:|7-commandAction|17|19-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|18|19-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|19|30-preAction
        } else if (displayable == splashScreen) {
            if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|19|30-preAction
                // write pre-action user code here
                switchDisplayable(null, getMainForm());//GEN-LINE:|7-commandAction|20|30-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|21|48-preAction
        } else if (displayable == waitScreen) {
            if (command == WaitScreen.FAILURE_COMMAND) {//GEN-END:|7-commandAction|21|48-preAction
                // write pre-action user code here
                switchDisplayable(null, getLoginScreen());//GEN-LINE:|7-commandAction|22|48-postAction
                // write post-action user code here
            } else if (command == WaitScreen.SUCCESS_COMMAND) {//GEN-LINE:|7-commandAction|23|47-preAction
                // write pre-action user code here
                switchDisplayable(null, getLoginOK());//GEN-LINE:|7-commandAction|24|47-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|25|7-postCommandAction
        }//GEN-END:|7-commandAction|25|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|26|
    //</editor-fold>//GEN-END:|7-commandAction|26|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initiliazed instance of exitCommand component.
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
            exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
        }//GEN-BEGIN:|18-getter|2|
        return exitCommand;
    }
    //</editor-fold>//GEN-END:|18-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: mainForm ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initiliazed instance of mainForm component.
     * @return the initialized component instance
     */
    public Form getMainForm() {
        if (mainForm == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            mainForm = new Form("Welcome", new Item[] { getStringItem() });//GEN-BEGIN:|14-getter|1|14-postInit
            mainForm.addCommand(getExitCommand());
            mainForm.addCommand(getLoginCommand());
            mainForm.addCommand(getUpdateCommand());
            mainForm.addCommand(getAboutCommand());
            mainForm.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
        }//GEN-BEGIN:|14-getter|2|
        return mainForm;
    }
    //</editor-fold>//GEN-END:|14-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|16-getter|0|16-preInit
    /**
     * Returns an initiliazed instance of stringItem component.
     * @return the initialized component instance
     */
    public StringItem getStringItem() {
        if (stringItem == null) {//GEN-END:|16-getter|0|16-preInit
            // write pre-init user code here
            stringItem = new StringItem("Please use the menu to choose the wished option", "");//GEN-BEGIN:|16-getter|1|16-postInit
            stringItem.setLayout(ImageItem.LAYOUT_CENTER | Item.LAYOUT_TOP | Item.LAYOUT_BOTTOM | Item.LAYOUT_VCENTER | Item.LAYOUT_EXPAND | Item.LAYOUT_VEXPAND | Item.LAYOUT_2);//GEN-END:|16-getter|1|16-postInit
            // write post-init user code here
        }//GEN-BEGIN:|16-getter|2|
        return stringItem;
    }
    //</editor-fold>//GEN-END:|16-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: LoginCommand ">//GEN-BEGIN:|22-getter|0|22-preInit
    /**
     * Returns an initiliazed instance of LoginCommand component.
     * @return the initialized component instance
     */
    public Command getLoginCommand() {
        if (LoginCommand == null) {//GEN-END:|22-getter|0|22-preInit
            // write pre-init user code here
            LoginCommand = new Command("Login", Command.SCREEN, 0);//GEN-LINE:|22-getter|1|22-postInit
            // write post-init user code here
        }//GEN-BEGIN:|22-getter|2|
        return LoginCommand;
    }
    //</editor-fold>//GEN-END:|22-getter|2|







    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: image2 ">//GEN-BEGIN:|27-getter|0|27-preInit
    /**
     * Returns an initiliazed instance of image2 component.
     * @return the initialized component instance
     */
    public Image getImage2() {
        if (image2 == null) {//GEN-END:|27-getter|0|27-preInit
            // write pre-init user code here
            try {//GEN-BEGIN:|27-getter|1|27-@java.io.IOException
                image2 = Image.createImage("/logo.png");
            } catch (java.io.IOException e) {//GEN-END:|27-getter|1|27-@java.io.IOException
                e.printStackTrace();
            }//GEN-LINE:|27-getter|2|27-postInit
            // write post-init user code here
        }//GEN-BEGIN:|27-getter|3|
        return image2;
    }
    //</editor-fold>//GEN-END:|27-getter|3|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: splashScreen ">//GEN-BEGIN:|28-getter|0|28-preInit
    /**
     * Returns an initiliazed instance of splashScreen component.
     * @return the initialized component instance
     */
    public SplashScreen getSplashScreen() {
        if (splashScreen == null) {//GEN-END:|28-getter|0|28-preInit
            // write pre-init user code here
            splashScreen = new SplashScreen(getDisplay());//GEN-BEGIN:|28-getter|1|28-postInit
            splashScreen.setTitle("Open World Code");
            splashScreen.setCommandListener(this);
            splashScreen.setImage(getImage2());
            splashScreen.setText(" ");//GEN-END:|28-getter|1|28-postInit

              splashScreen.setTimeout(1000);
        }//GEN-BEGIN:|28-getter|2|
        return splashScreen;
    }
    //</editor-fold>//GEN-END:|28-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|37-getter|0|37-preInit
    /**
     * Returns an initiliazed instance of backCommand component.
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {//GEN-END:|37-getter|0|37-preInit
            // write pre-init user code here
            backCommand = new Command("Back", Command.BACK, 0);//GEN-LINE:|37-getter|1|37-postInit
            // write post-init user code here
        }//GEN-BEGIN:|37-getter|2|
        return backCommand;
    }
    //</editor-fold>//GEN-END:|37-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: loginScreen ">//GEN-BEGIN:|33-getter|0|33-preInit
    /**
     * Returns an initiliazed instance of loginScreen component.
     * @return the initialized component instance
     */
    public LoginScreen getLoginScreen() {
        if (loginScreen == null) {//GEN-END:|33-getter|0|33-preInit
            // write pre-init user code here
            loginScreen = new LoginScreen(getDisplay());//GEN-BEGIN:|33-getter|1|33-postInit
            loginScreen.setLabelTexts("Username", "Password");
            loginScreen.setTitle("loginScreen");
            loginScreen.addCommand(LoginScreen.LOGIN_COMMAND);
            loginScreen.addCommand(getBackCommand());
            loginScreen.setCommandListener(this);
            loginScreen.setBGColor(-3355444);
            loginScreen.setFGColor(0);
            loginScreen.setUseLoginButton(false);
            loginScreen.setLoginButtonText("Login");//GEN-END:|33-getter|1|33-postInit
            // write post-init user code here
        }//GEN-BEGIN:|33-getter|2|
        return loginScreen;
    }
    //</editor-fold>//GEN-END:|33-getter|2|



    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: tableModel1 ">//GEN-BEGIN:|43-getter|0|43-preInit
    /**
     * Returns an initiliazed instance of tableModel1 component.
     * @return the initialized component instance
     */
    public SimpleTableModel getTableModel1() {
        if (tableModel1 == null) {//GEN-END:|43-getter|0|43-preInit
            // write pre-init user code here
            tableModel1 = new SimpleTableModel(new java.lang.String[][] {//GEN-BEGIN:|43-getter|1|43-postInit
                new java.lang.String[] { "Login" },
                new java.lang.String[] { "Help" },
                new java.lang.String[] { "Search" },
                new java.lang.String[] { "Ecit" }}, null);//GEN-END:|43-getter|1|43-postInit
            // write post-init user code here
        }//GEN-BEGIN:|43-getter|2|
        return tableModel1;
    }
    //</editor-fold>//GEN-END:|43-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: waitScreen ">//GEN-BEGIN:|44-getter|0|44-preInit
    /**
     * Returns an initiliazed instance of waitScreen component.
     * @return the initialized component instance
     */
    public WaitScreen getWaitScreen() {
        if (waitScreen == null) {//GEN-END:|44-getter|0|44-preInit
            // write pre-init user code here
            waitScreen = new WaitScreen(getDisplay());//GEN-BEGIN:|44-getter|1|44-postInit
            waitScreen.setTitle("waitScreen");
            waitScreen.setCommandListener(this);
            waitScreen.setText("OpWoCo is trying to log in....");
            waitScreen.setTask(getTask());//GEN-END:|44-getter|1|44-postInit
            // write post-init user code here
        }//GEN-BEGIN:|44-getter|2|
        return waitScreen;
    }
    //</editor-fold>//GEN-END:|44-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: task ">//GEN-BEGIN:|49-getter|0|49-preInit
    /**
     * Returns an initiliazed instance of task component.
     * @return the initialized component instance
     */
    public SimpleCancellableTask getTask() {
        if (task == null) {//GEN-END:|49-getter|0|49-preInit
            // write pre-init user code here
            task = new SimpleCancellableTask();//GEN-BEGIN:|49-getter|1|49-execute
            task.setExecutable(new org.netbeans.microedition.util.Executable() {
                public void execute() throws Exception {//GEN-END:|49-getter|1|49-execute
                    // write task-execution user code here
                    login();
                }//GEN-BEGIN:|49-getter|2|49-postInit
            });//GEN-END:|49-getter|2|49-postInit
            // write post-init user code here
        }//GEN-BEGIN:|49-getter|3|
        return task;
    }
    //</editor-fold>//GEN-END:|49-getter|3|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: loginOK ">//GEN-BEGIN:|50-getter|0|50-preInit
    /**
     * Returns an initiliazed instance of loginOK component.
     * @return the initialized component instance
     */
    public Form getLoginOK() {
        if (loginOK == null) {//GEN-END:|50-getter|0|50-preInit
            // write pre-init user code here
            loginOK = new Form("OpWoCo - Welcome", new Item[] { getTextField() });//GEN-BEGIN:|50-getter|1|50-postInit
            loginOK.addCommand(getBackCommand3());
            loginOK.setCommandListener(this);//GEN-END:|50-getter|1|50-postInit
            // write post-init user code here
        }//GEN-BEGIN:|50-getter|2|
        return loginOK;
    }
    //</editor-fold>//GEN-END:|50-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|53-getter|0|53-preInit
    /**
     * Returns an initiliazed instance of textField component.
     * @return the initialized component instance
     */
    public TextField getTextField() {
        if (textField == null) {//GEN-END:|53-getter|0|53-preInit
            // write pre-init user code here
            textField = new TextField("Enter product code to bookmark", null, 32, TextField.ANY);//GEN-LINE:|53-getter|1|53-postInit
            // write post-init user code here
        }//GEN-BEGIN:|53-getter|2|
        return textField;
    }
    //</editor-fold>//GEN-END:|53-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: UpdateForm ">//GEN-BEGIN:|56-getter|0|56-preInit
    /**
     * Returns an initiliazed instance of UpdateForm component.
     * @return the initialized component instance
     */
    public Form getUpdateForm() {
        if (UpdateForm == null) {//GEN-END:|56-getter|0|56-preInit
            // write pre-init user code here
            UpdateForm = new Form("OpWoCo Update");//GEN-BEGIN:|56-getter|1|56-postInit
            UpdateForm.addCommand(getBackCommand1());
            UpdateForm.setCommandListener(this);//GEN-END:|56-getter|1|56-postInit
            // write post-init user code here
            check4Update();
        }//GEN-BEGIN:|56-getter|2|
        return UpdateForm;
    }
    //</editor-fold>//GEN-END:|56-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: UpdateCommand ">//GEN-BEGIN:|57-getter|0|57-preInit
    /**
     * Returns an initiliazed instance of UpdateCommand component.
     * @return the initialized component instance
     */
    public Command getUpdateCommand() {
        if (UpdateCommand == null) {//GEN-END:|57-getter|0|57-preInit
            // write pre-init user code here
            UpdateCommand = new Command("Update", Command.SCREEN, 0);//GEN-LINE:|57-getter|1|57-postInit
            // write post-init user code here
        }//GEN-BEGIN:|57-getter|2|
        return UpdateCommand;
    }
    //</editor-fold>//GEN-END:|57-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: AboutCommand ">//GEN-BEGIN:|61-getter|0|61-preInit
    /**
     * Returns an initiliazed instance of AboutCommand component.
     * @return the initialized component instance
     */
    public Command getAboutCommand() {
        if (AboutCommand == null) {//GEN-END:|61-getter|0|61-preInit
            // write pre-init user code here
            AboutCommand = new Command("About", Command.SCREEN, 0);//GEN-LINE:|61-getter|1|61-postInit
            // write post-init user code here
        }//GEN-BEGIN:|61-getter|2|
        return AboutCommand;
    }
    //</editor-fold>//GEN-END:|61-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: About ">//GEN-BEGIN:|60-getter|0|60-preInit
    /**
     * Returns an initiliazed instance of About component.
     * @return the initialized component instance
     */
    public Form getAbout() {
        if (About == null) {//GEN-END:|60-getter|0|60-preInit
            // write pre-init user code here
            About = new Form("About", new Item[] { getStringItem1(), getStringItem3(), getStringItem4() });//GEN-BEGIN:|60-getter|1|60-postInit
            About.addCommand(getBackCommand2());
            About.setCommandListener(this);//GEN-END:|60-getter|1|60-postInit
            
            // write post-init user code here

        }//GEN-BEGIN:|60-getter|2|
        return About;
    }
    //</editor-fold>//GEN-END:|60-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem1 ">//GEN-BEGIN:|66-getter|0|66-preInit
    /**
     * Returns an initiliazed instance of stringItem1 component.
     * @return the initialized component instance
     */
    public StringItem getStringItem1() {
        if (stringItem1 == null) {//GEN-END:|66-getter|0|66-preInit
            // write pre-init user code here
            stringItem1 = new StringItem("Version: ", getVersion());//GEN-LINE:|66-getter|1|66-postInit
            // write post-init user code here
        }//GEN-BEGIN:|66-getter|2|
        return stringItem1;
    }
    //</editor-fold>//GEN-END:|66-getter|2|





    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem3 ">//GEN-BEGIN:|69-getter|0|69-preInit
    /**
     * Returns an initiliazed instance of stringItem3 component.
     * @return the initialized component instance
     */
    public StringItem getStringItem3() {
        if (stringItem3 == null) {//GEN-END:|69-getter|0|69-preInit
            // write pre-init user code here
            stringItem3 = new StringItem("License:", "This Software is published under the GNU license GPL v2");//GEN-LINE:|69-getter|1|69-postInit
            // write post-init user code here
        }//GEN-BEGIN:|69-getter|2|
        return stringItem3;
    }
    //</editor-fold>//GEN-END:|69-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem4 ">//GEN-BEGIN:|70-getter|0|70-preInit
    /**
     * Returns an initiliazed instance of stringItem4 component.
     * @return the initialized component instance
     */
    public StringItem getStringItem4() {
        if (stringItem4 == null) {//GEN-END:|70-getter|0|70-preInit
            // write pre-init user code here
            stringItem4 = new StringItem("Further information: ", "For further information take a look at www.opwoco.net");//GEN-LINE:|70-getter|1|70-postInit
            // write post-init user code here
        }//GEN-BEGIN:|70-getter|2|
        return stringItem4;
    }
    //</editor-fold>//GEN-END:|70-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand1 ">//GEN-BEGIN:|71-getter|0|71-preInit
    /**
     * Returns an initiliazed instance of backCommand1 component.
     * @return the initialized component instance
     */
    public Command getBackCommand1() {
        if (backCommand1 == null) {//GEN-END:|71-getter|0|71-preInit
            // write pre-init user code here
            backCommand1 = new Command("Back", Command.BACK, 0);//GEN-LINE:|71-getter|1|71-postInit
            // write post-init user code here
        }//GEN-BEGIN:|71-getter|2|
        return backCommand1;
    }
    //</editor-fold>//GEN-END:|71-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand2 ">//GEN-BEGIN:|74-getter|0|74-preInit
    /**
     * Returns an initiliazed instance of backCommand2 component.
     * @return the initialized component instance
     */
    public Command getBackCommand2() {
        if (backCommand2 == null) {//GEN-END:|74-getter|0|74-preInit
            // write pre-init user code here
            backCommand2 = new Command("Back", Command.BACK, 0);//GEN-LINE:|74-getter|1|74-postInit
            // write post-init user code here
        }//GEN-BEGIN:|74-getter|2|
        return backCommand2;
    }
    //</editor-fold>//GEN-END:|74-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand3 ">//GEN-BEGIN:|77-getter|0|77-preInit
    /**
     * Returns an initiliazed instance of backCommand3 component.
     * @return the initialized component instance
     */
    public Command getBackCommand3() {
        if (backCommand3 == null) {//GEN-END:|77-getter|0|77-preInit
            // write pre-init user code here
            backCommand3 = new Command("Back", Command.BACK, 0);//GEN-LINE:|77-getter|1|77-postInit
            // write post-init user code here
        }//GEN-BEGIN:|77-getter|2|
        return backCommand3;
    }
    //</editor-fold>//GEN-END:|77-getter|2|





    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay () {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable (null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet ();
        } else {
            initialize ();
            startMIDlet ();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }
    
    
    private void login() throws Exception {
        WebToMobileClient wtmc = new WebToMobileClient();
        MySOAP_Client mySoap = new MySOAP_Client();
        //String myResult = mySoap.checkLogin(loginScreen.getUsername(), tools.MD5.toHex(loginScreen.getPassword().toString().getBytes()).toString() );
         String myResult = mySoap.checkLogin(loginScreen.getUsername(), loginScreen.getPassword() );
       
        if( myResult.compareTo("true") == 0 )
        {
          return; // alles goed :)  
        }
        waitScreen.setText("login failed for User  "+loginScreen.getUsername() );
        Thread.sleep(2*1000); // 1* for 1 second...
        throw new Exception("niet gelukt");
    }

    // geeft de versie van deze software terug
    private String getVersion(){
        return theVersion;
    }
    
    //checks for new updates and puts the result op de update form
    private void check4Update()
    {
        
    }
}
