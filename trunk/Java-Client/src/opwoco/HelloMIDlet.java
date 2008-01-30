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
import opwoco_webservice.WebToMobileClient;
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
    private String theVersion = "0.3alpha";

    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command exitCommand;
    private Command LoginCommand;
    private Command backCommand;
    private Command UpdateCommand;
    private Command AboutCommand;
    private Command backCommand1;
    private Command backCommand3;
    private Command backCommand2;
    private Command BookmarkCommand;
    private Command PricewatchCommand;
    private Command backCommand4;
    private Form mainForm;
    private StringItem stringItem;
    private SplashScreen splashScreen;
    private LoginScreen loginScreen;
    private WaitScreen waitScreen;
    private Form SearchScreen;
    private TextField txtProductCode;
    private Form UpdateForm;
    private StringItem stringItem2;
    private Form About;
    private StringItem stringItem3;
    private StringItem stringItem4;
    private StringItem stringItem1;
    private WaitScreen saveIT_and_wait_screen;
    private WaitScreen PriceWatch_andWaitScreen;
    private Form ProductDetails;
    private StringItem txtProductDetails_Code;
    private StringItem txtProductDetails_Price;
    private StringItem txtProductDetails_Distributor;
    private StringItem txtProductDetails_Description;
    private Image image2;
    private SimpleTableModel tableModel1;
    private SimpleCancellableTask task;
    private SimpleCancellableTask task1;
    private SimpleCancellableTask task2;
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
            }//GEN-BEGIN:|7-commandAction|3|95-preAction
        } else if (displayable == PriceWatch_andWaitScreen) {
            if (command == WaitScreen.FAILURE_COMMAND) {//GEN-END:|7-commandAction|3|95-preAction
                // write pre-action user code here
                switchDisplayable(null, getSearchScreen());//GEN-LINE:|7-commandAction|4|95-postAction
                // write post-action user code here
            } else if (command == WaitScreen.SUCCESS_COMMAND) {//GEN-LINE:|7-commandAction|5|94-preAction
                // write pre-action user code here
                switchDisplayable(null, getProductDetails());//GEN-LINE:|7-commandAction|6|94-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|7|102-preAction
        } else if (displayable == ProductDetails) {
            if (command == backCommand4) {//GEN-END:|7-commandAction|7|102-preAction
                // write pre-action user code here
                switchDisplayable(null, getSearchScreen());//GEN-LINE:|7-commandAction|8|102-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|9|81-preAction
        } else if (displayable == SearchScreen) {
            if (command == BookmarkCommand) {//GEN-END:|7-commandAction|9|81-preAction
                // write pre-action user code here
                switchDisplayable(null, getSaveIT_and_wait_screen());//GEN-LINE:|7-commandAction|10|81-postAction
                // write post-action user code here
            } else if (command == PricewatchCommand) {//GEN-LINE:|7-commandAction|11|91-preAction
                // write pre-action user code here
                switchDisplayable(null, getPriceWatch_andWaitScreen());//GEN-LINE:|7-commandAction|12|91-postAction
                // write post-action user code here
            } else if (command == backCommand3) {//GEN-LINE:|7-commandAction|13|78-preAction
                // write pre-action user code here
                switchDisplayable(null, getMainForm());//GEN-LINE:|7-commandAction|14|78-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|15|72-preAction
        } else if (displayable == UpdateForm) {
            if (command == backCommand1) {//GEN-END:|7-commandAction|15|72-preAction
                // write pre-action user code here
                switchDisplayable(null, getMainForm());//GEN-LINE:|7-commandAction|16|72-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|17|35-preAction
        } else if (displayable == loginScreen) {
            if (command == LoginScreen.LOGIN_COMMAND) {//GEN-END:|7-commandAction|17|35-preAction
                // write pre-action user code here
                switchDisplayable(null, getWaitScreen());//GEN-LINE:|7-commandAction|18|35-postAction
                // write post-action user code here
            } else if (command == backCommand) {//GEN-LINE:|7-commandAction|19|38-preAction
                // write pre-action user code here
                switchDisplayable(null, getMainForm());//GEN-LINE:|7-commandAction|20|38-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|21|62-preAction
        } else if (displayable == mainForm) {
            if (command == AboutCommand) {//GEN-END:|7-commandAction|21|62-preAction
                // write pre-action user code here
                switchDisplayable(null, getAbout());//GEN-LINE:|7-commandAction|22|62-postAction
                // write post-action user code here
            } else if (command == LoginCommand) {//GEN-LINE:|7-commandAction|23|23-preAction
                // write pre-action user code here
                switchDisplayable(null, getLoginScreen());//GEN-LINE:|7-commandAction|24|23-postAction
                // write post-action user code here
            } else if (command == UpdateCommand) {//GEN-LINE:|7-commandAction|25|58-preAction
                // write pre-action user code here
                switchDisplayable(null, getUpdateForm());//GEN-LINE:|7-commandAction|26|58-postAction
                // write post-action user code here
            } else if (command == exitCommand) {//GEN-LINE:|7-commandAction|27|19-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|28|19-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|29|84-preAction
        } else if (displayable == saveIT_and_wait_screen) {
            if (command == WaitScreen.FAILURE_COMMAND) {//GEN-END:|7-commandAction|29|84-preAction
                // write pre-action user code here
                switchDisplayable(null, getSearchScreen());//GEN-LINE:|7-commandAction|30|84-postAction
                // write post-action user code here
            } else if (command == WaitScreen.SUCCESS_COMMAND) {//GEN-LINE:|7-commandAction|31|83-preAction
                // write pre-action user code here
                switchDisplayable(null, getSearchScreen());//GEN-LINE:|7-commandAction|32|83-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|33|30-preAction
        } else if (displayable == splashScreen) {
            if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|33|30-preAction
                // write pre-action user code here
                switchDisplayable(null, getMainForm());//GEN-LINE:|7-commandAction|34|30-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|35|48-preAction
        } else if (displayable == waitScreen) {
            if (command == WaitScreen.FAILURE_COMMAND) {//GEN-END:|7-commandAction|35|48-preAction
                // write pre-action user code here
                switchDisplayable(null, getLoginScreen());//GEN-LINE:|7-commandAction|36|48-postAction
                // write post-action user code here
            } else if (command == WaitScreen.SUCCESS_COMMAND) {//GEN-LINE:|7-commandAction|37|47-preAction
                // write pre-action user code here
                switchDisplayable(null, getSearchScreen());//GEN-LINE:|7-commandAction|38|47-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|39|7-postCommandAction
        }//GEN-END:|7-commandAction|39|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|40|
    //</editor-fold>//GEN-END:|7-commandAction|40|

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

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: SearchScreen ">//GEN-BEGIN:|50-getter|0|50-preInit
    /**
     * Returns an initiliazed instance of SearchScreen component.
     * @return the initialized component instance
     */
    public Form getSearchScreen() {
        if (SearchScreen == null) {//GEN-END:|50-getter|0|50-preInit
            // write pre-init user code here
            SearchScreen = new Form("OpWoCo - Welcome", new Item[] { getTxtProductCode() });//GEN-BEGIN:|50-getter|1|50-postInit
            SearchScreen.addCommand(getBackCommand3());
            SearchScreen.addCommand(getBookmarkCommand());
            SearchScreen.addCommand(getPricewatchCommand());
            SearchScreen.setCommandListener(this);//GEN-END:|50-getter|1|50-postInit
            // write post-init user code here
        }//GEN-BEGIN:|50-getter|2|
        return SearchScreen;
    }
    //</editor-fold>//GEN-END:|50-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: txtProductCode ">//GEN-BEGIN:|53-getter|0|53-preInit
    /**
     * Returns an initiliazed instance of txtProductCode component.
     * @return the initialized component instance
     */
    public TextField getTxtProductCode() {
        if (txtProductCode == null) {//GEN-END:|53-getter|0|53-preInit
            // write pre-init user code here
            txtProductCode = new TextField("Enter product code:", null, 32, TextField.ANY);//GEN-LINE:|53-getter|1|53-postInit
            // write post-init user code here
        }//GEN-BEGIN:|53-getter|2|
        return txtProductCode;
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
            UpdateForm = new Form("OpWoCo Update", new Item[] { getStringItem2() });//GEN-BEGIN:|56-getter|1|56-postInit
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

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: BookmarkCommand ">//GEN-BEGIN:|80-getter|0|80-preInit
    /**
     * Returns an initiliazed instance of BookmarkCommand component.
     * @return the initialized component instance
     */
    public Command getBookmarkCommand() {
        if (BookmarkCommand == null) {//GEN-END:|80-getter|0|80-preInit
            // write pre-init user code here
            BookmarkCommand = new Command("Bookmark", Command.OK, 0);//GEN-LINE:|80-getter|1|80-postInit
            // write post-init user code here
        }//GEN-BEGIN:|80-getter|2|
        return BookmarkCommand;
    }
    //</editor-fold>//GEN-END:|80-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: saveIT_and_wait_screen ">//GEN-BEGIN:|82-getter|0|82-preInit
    /**
     * Returns an initiliazed instance of saveIT_and_wait_screen component.
     * @return the initialized component instance
     */
    public WaitScreen getSaveIT_and_wait_screen() {
        if (saveIT_and_wait_screen == null) {//GEN-END:|82-getter|0|82-preInit
            // write pre-init user code here
            saveIT_and_wait_screen = new WaitScreen(getDisplay());//GEN-BEGIN:|82-getter|1|82-postInit
            saveIT_and_wait_screen.setTitle("Saving product code");
            saveIT_and_wait_screen.setCommandListener(this);
            saveIT_and_wait_screen.setText("opwoco is saving the product code. You van find it at your personal account at www.opwoco.net");
            saveIT_and_wait_screen.setTask(getTask1());//GEN-END:|82-getter|1|82-postInit
            // write post-init user code here
        }//GEN-BEGIN:|82-getter|2|
        return saveIT_and_wait_screen;
    }
    //</editor-fold>//GEN-END:|82-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: task1 ">//GEN-BEGIN:|85-getter|0|85-preInit
    /**
     * Returns an initiliazed instance of task1 component.
     * @return the initialized component instance
     */
    public SimpleCancellableTask getTask1() {
        if (task1 == null) {//GEN-END:|85-getter|0|85-preInit
            // write pre-init user code here
            task1 = new SimpleCancellableTask();//GEN-BEGIN:|85-getter|1|85-execute
            task1.setExecutable(new org.netbeans.microedition.util.Executable() {
                public void execute() throws Exception {//GEN-END:|85-getter|1|85-execute
                    // write task-execution user code here
                    BookmarkProductCode();
                }//GEN-BEGIN:|85-getter|2|85-postInit
            });//GEN-END:|85-getter|2|85-postInit
            // write post-init user code here
        }//GEN-BEGIN:|85-getter|3|
        return task1;
    }
    //</editor-fold>//GEN-END:|85-getter|3|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: PricewatchCommand ">//GEN-BEGIN:|90-getter|0|90-preInit
    /**
     * Returns an initiliazed instance of PricewatchCommand component.
     * @return the initialized component instance
     */
    public Command getPricewatchCommand() {
        if (PricewatchCommand == null) {//GEN-END:|90-getter|0|90-preInit
            // write pre-init user code here
            PricewatchCommand = new Command("Pricewatch", Command.OK, 0);//GEN-LINE:|90-getter|1|90-postInit
            // write post-init user code here
        }//GEN-BEGIN:|90-getter|2|
        return PricewatchCommand;
    }
    //</editor-fold>//GEN-END:|90-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: PriceWatch_andWaitScreen ">//GEN-BEGIN:|93-getter|0|93-preInit
    /**
     * Returns an initiliazed instance of PriceWatch_andWaitScreen component.
     * @return the initialized component instance
     */
    public WaitScreen getPriceWatch_andWaitScreen() {
        if (PriceWatch_andWaitScreen == null) {//GEN-END:|93-getter|0|93-preInit
            // write pre-init user code here
            PriceWatch_andWaitScreen = new WaitScreen(getDisplay());//GEN-BEGIN:|93-getter|1|93-postInit
            PriceWatch_andWaitScreen.setTitle("Pricewatch");
            PriceWatch_andWaitScreen.setCommandListener(this);
            PriceWatch_andWaitScreen.setText("Looking up for your product...");
            PriceWatch_andWaitScreen.setTask(getTask2());//GEN-END:|93-getter|1|93-postInit
            // write post-init user code here
        }//GEN-BEGIN:|93-getter|2|
        return PriceWatch_andWaitScreen;
    }
    //</editor-fold>//GEN-END:|93-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: task2 ">//GEN-BEGIN:|96-getter|0|96-preInit
    /**
     * Returns an initiliazed instance of task2 component.
     * @return the initialized component instance
     */
    public SimpleCancellableTask getTask2() {
        if (task2 == null) {//GEN-END:|96-getter|0|96-preInit
            // write pre-init user code here
            task2 = new SimpleCancellableTask();//GEN-BEGIN:|96-getter|1|96-execute
            task2.setExecutable(new org.netbeans.microedition.util.Executable() {
                public void execute() throws Exception {//GEN-END:|96-getter|1|96-execute
                    // write task-execution user code here
                    searchForProduct();
                }//GEN-BEGIN:|96-getter|2|96-postInit
            });//GEN-END:|96-getter|2|96-postInit
            // write post-init user code here
        }//GEN-BEGIN:|96-getter|3|
        return task2;
    }
    //</editor-fold>//GEN-END:|96-getter|3|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand4 ">//GEN-BEGIN:|101-getter|0|101-preInit
    /**
     * Returns an initiliazed instance of backCommand4 component.
     * @return the initialized component instance
     */
    public Command getBackCommand4() {
        if (backCommand4 == null) {//GEN-END:|101-getter|0|101-preInit
            // write pre-init user code here
            backCommand4 = new Command("Back", Command.BACK, 0);//GEN-LINE:|101-getter|1|101-postInit
            // write post-init user code here
        }//GEN-BEGIN:|101-getter|2|
        return backCommand4;
    }
    //</editor-fold>//GEN-END:|101-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem2 ">//GEN-BEGIN:|104-getter|0|104-preInit
    /**
     * Returns an initiliazed instance of stringItem2 component.
     * @return the initialized component instance
     */
    public StringItem getStringItem2() {
        if (stringItem2 == null) {//GEN-END:|104-getter|0|104-preInit
            // write pre-init user code here
            stringItem2 = new StringItem("Comming soon", "We are working hard, so the aut-update funtion will be here in a short time. For so far go to www.opwoco.net");//GEN-LINE:|104-getter|1|104-postInit
            // write post-init user code here
        }//GEN-BEGIN:|104-getter|2|
        return stringItem2;
    }
    //</editor-fold>//GEN-END:|104-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: ProductDetails ">//GEN-BEGIN:|98-getter|0|98-preInit
    /**
     * Returns an initiliazed instance of ProductDetails component.
     * @return the initialized component instance
     */
    public Form getProductDetails() {
        if (ProductDetails == null) {//GEN-END:|98-getter|0|98-preInit
            // write pre-init user code here
            ProductDetails = new Form("Product Details", new Item[] { getTxtProductDetails_Code(), getTxtProductDetails_Price(), getTxtProductDetails_Distributor(), getTxtProductDetails_Description() });//GEN-BEGIN:|98-getter|1|98-postInit
            ProductDetails.addCommand(getBackCommand4());
            ProductDetails.setCommandListener(this);//GEN-END:|98-getter|1|98-postInit
            // write post-init user code here
        }//GEN-BEGIN:|98-getter|2|
        return ProductDetails;
    }
    //</editor-fold>//GEN-END:|98-getter|2|









    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: txtProductDetails_Code ">//GEN-BEGIN:|109-getter|0|109-preInit
    /**
     * Returns an initiliazed instance of txtProductDetails_Code component.
     * @return the initialized component instance
     */
    public StringItem getTxtProductDetails_Code() {
        if (txtProductDetails_Code == null) {//GEN-END:|109-getter|0|109-preInit
            // write pre-init user code here
            txtProductDetails_Code = new StringItem("ProductCode", null);//GEN-LINE:|109-getter|1|109-postInit
            // write post-init user code here
        }//GEN-BEGIN:|109-getter|2|
        return txtProductDetails_Code;
    }
    //</editor-fold>//GEN-END:|109-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: txtProductDetails_Price ">//GEN-BEGIN:|110-getter|0|110-preInit
    /**
     * Returns an initiliazed instance of txtProductDetails_Price component.
     * @return the initialized component instance
     */
    public StringItem getTxtProductDetails_Price() {
        if (txtProductDetails_Price == null) {//GEN-END:|110-getter|0|110-preInit
            // write pre-init user code here
            txtProductDetails_Price = new StringItem("Price", null);//GEN-LINE:|110-getter|1|110-postInit
            // write post-init user code here
        }//GEN-BEGIN:|110-getter|2|
        return txtProductDetails_Price;
    }
    //</editor-fold>//GEN-END:|110-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: txtProductDetails_Distributor ">//GEN-BEGIN:|111-getter|0|111-preInit
    /**
     * Returns an initiliazed instance of txtProductDetails_Distributor component.
     * @return the initialized component instance
     */
    public StringItem getTxtProductDetails_Distributor() {
        if (txtProductDetails_Distributor == null) {//GEN-END:|111-getter|0|111-preInit
            // write pre-init user code here
            txtProductDetails_Distributor = new StringItem("Distributor", null);//GEN-LINE:|111-getter|1|111-postInit
            // write post-init user code here
        }//GEN-BEGIN:|111-getter|2|
        return txtProductDetails_Distributor;
    }
    //</editor-fold>//GEN-END:|111-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: txtProductDetails_Description ">//GEN-BEGIN:|112-getter|0|112-preInit
    /**
     * Returns an initiliazed instance of txtProductDetails_Description component.
     * @return the initialized component instance
     */
    public StringItem getTxtProductDetails_Description() {
        if (txtProductDetails_Description == null) {//GEN-END:|112-getter|0|112-preInit
            // write pre-init user code here
            txtProductDetails_Description = new StringItem("Description", null);//GEN-LINE:|112-getter|1|112-postInit
            // write post-init user code here
        }//GEN-BEGIN:|112-getter|2|
        return txtProductDetails_Description;
    }
    //</editor-fold>//GEN-END:|112-getter|2|







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
        WebToMobileClient mySoap = new WebToMobileClient();
        //String myResult = mySoap.checkLogin(loginScreen.getUsername(), tools.MD5.toHex(loginScreen.getPassword().toString().getBytes()).toString() );
         Boolean myLoginResult = mySoap.checkLogin(loginScreen.getUsername(), loginScreen.getPassword() );
       
        if( myLoginResult.booleanValue() )
        {
          return; // alles goed :)  
        }
        waitScreen.setText("login failed for User  "+loginScreen.getUsername() );
        // deze sleep voert die niet uit :( - geen idee waarom....
        // test cf
        Thread.sleep(2*1000); // 1* for 1 second...
        waitScreen.setText("Im trying to log in...");
        throw new Exception("niet gelukt");
        
    }

    // geeft de versie van deze software terug
    private String getVersion(){
        return theVersion;
    }
    
    //checks for new updates and puts the result op de update form
    private void check4Update()
    {
        // comming soon...
    }

    private void BookmarkProductCode() throws Exception {
        WebToMobileClient mySoap = new WebToMobileClient();
        mySoap.bookmarkCode(txtProductCode.getString(), loginScreen.getUsername() );
        saveIT_and_wait_screen.setText("Bookmarking of " + txtProductCode.getString() + " done.");
        Thread.sleep(2*1000); // 1* for 1 second...
        throw new Exception("niet gelukt");
    }
    
    private void searchForProduct() throws Exception {
        WebToMobileClient mySoap = new WebToMobileClient();
        String data = mySoap.getProductInfo(txtProductCode.getString() );
        String mySeperator = ";";
        if( data.toLowerCase().compareTo("noinfo") == 0 ){
            // 0 = equal... dus no info
            PriceWatch_andWaitScreen.setText("Sorry, no product info found :("); 
            Thread.sleep(3*1000); // 1* for 1 second...
            throw new Exception("no product info");
        }

        //Todo: improve these code...
        int take1 = data.indexOf(mySeperator, 0);
        int take2 = data.indexOf(mySeperator, take1+1);
        int take3 = data.indexOf(mySeperator, take2+1);
        getProductDetails();
        txtProductDetails_Code.setText( data.substring(0, take1) );
        txtProductDetails_Price.setText( data.substring(take1+1, take2).toString() );
        txtProductDetails_Distributor.setText( data.substring(take2+1, take3).toString() );
        txtProductDetails_Description.setText( data.substring(take3+1).toString() );
    }
}