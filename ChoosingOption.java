/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20226095.nguyenminhtuan.lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ChoosingOption {
    //Nguyễn Minh Tuấn
    //20226095
    //Exercise 6.1
    public static void main(String[] args) {
//        Code ban đầu
//
//        int option;
//        option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
//        
//        JOptionPane.showMessageDialog(null, "You've chosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
//        System.exit(0);

//        Code sửa cho câu hỏi số 2 (cả trường hợp Y/N và I do/I don't)
//
//        Object[] options = {"Yes", "No"};
        Object[] options = {"I do", "I don't"};
        int option = JOptionPane.showOptionDialog(null, "Do you want to change to the first class ticket?", "Choose Option", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
//        String chosenOption = (option == JOptionPane.YES_OPTION) ? "Yes" : "No";
        String chosenOption = (option == JOptionPane.YES_OPTION) ? "I do" : "I don't";
        JOptionPane.showMessageDialog(null, "You've chosen: " + chosenOption);
        System.exit(0);
    }
}