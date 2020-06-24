import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import java.util.*;

public class FinalCubeSolver {

    public static JPanel panel = new JPanel();
    public static JButton button0 = new JButton("");
    public static JButton button1 = new JButton("");
    public static JButton button2 = new JButton("");
    public static JButton button3 = new JButton("");
    public static JButton button4 = new JButton("");
    public static JButton button5 = new JButton("");
    public static JButton button6 = new JButton("");
    public static JButton button7 = new JButton("");
    public static JButton button8 = new JButton("");

    public static JButton green = new JButton("");
    public static JButton white = new JButton("");
    public static JButton blue = new JButton("");
    public static JButton yellow = new JButton("");
    public static JButton orange = new JButton("");
    public static JButton red = new JButton("");

    public static JButton next = new JButton("Next");
    public static JButton done = new JButton("Done");
    public static JFrame window = new JFrame();
    public static JLabel sideLabel = new JLabel("");
    public static int Side = 0;
    public static int Cube_colors[][] = new int[6][9];

    public static void main(String[] args) {
        // code application logic here

        //<editor-fold defaultstate="collapsed" desc="Window">
        final int WINDOW_WIDTH = 380;
        final int WINDOW_HEIGHT = 208;

        //create a window

        //set the title
        window.setTitle("First Window");

        //set the sizse of the window
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

        //Specify what happens when you close the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //display the window
        window.setVisible(true);

        //make it not resizable
        window.setResizable(false);
        //</editor-fold>

        addStuff();

        //System.out.println("THIS");

        //you have to run the code 6 times one for each side

    }
    public static void addStuff()
    {
        panel.setLayout(null);
        window.add(panel);

        //add the text to tell the user what side is being worked on
        sideLabel.setText("The Side is Green (Orange Top)");

        sideLabel.setLocation(178,20);
        panel.add(sideLabel);
        sideLabel.setSize(180,14);
        //add the buttons and put them in the right place
        //<editor-fold defaultstate="collapsed" desc="comment">
        panel.add(button0);
        button0.setBounds(10,10,46,46);

        panel.add(button3);
        button3.setBounds(10,66,46,46);

        panel.add(button6);
        button6.setBounds(10,122,46,46);

        panel.add(button1);
        button1.setBounds(66,10,46,46);

        panel.add(button4);
        button4.setBounds(66,66,46,46);

        panel.add(button7);
        button7.setBounds(66,122,46,46);

        panel.add(button2);
        button2.setBounds(122,10,46,46);

        panel.add(button5);
        button5.setBounds(122,66,46,46);

        panel.add(button8);
        button8.setBounds(122,122,46,46);

        panel.add(next);
        next.setBounds(178, 98, 100, 30);

        panel.add(done);
        done.setBounds(178,138,100,30);

        panel.add(green);
        green.setBounds(190, 50, 12, 12);
        green.setBackground(Color.GREEN);
        panel.add(white);
        white.setBounds(202, 50, 12, 12);
        white.setBackground(Color.WHITE);
        panel.add(blue);
        blue.setBounds(214, 50, 12, 12);
        blue.setBackground(Color.BLUE);
        panel.add(yellow);
        yellow.setBounds(226, 50, 12, 12);
        yellow.setBackground(Color.YELLOW);
        panel.add(orange);
        orange.setBounds(238, 50, 12, 12);
        orange.setBackground(Color.ORANGE);
        panel.add(red);
        red.setBounds(250, 50, 12, 12);
        red.setBackground(Color.RED);
        //</editor-fold>
        //chaneging the colors of the buttons and stuff
        //<editor-fold defaultstate="collapsed" desc="comment">
        int side[] = {6,6,6,6,6,6,6,6,6};
        button4.setBackground(Color.GREEN);
        button0.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed

                if(side[0] == 6)
                {
                    side[0] = 1;
                    button0.setBackground(Color.GREEN);
                    Cube_colors[Side][0] = 1;
                }
                else if(side[0] == 1)
                {
                    side[0] = 2;
                    button0.setBackground(Color.WHITE);
                    Cube_colors[Side][0] = 2;
                }
                else if(side[0] == 2)
                {
                    side[0] = 3;
                    button0.setBackground(Color.BLUE);
                    Cube_colors[Side][0] = 3;
                }
                else if(side[0] == 3)
                {
                    side[0] = 4;
                    button0.setBackground(Color.YELLOW);
                    Cube_colors[Side][0] = 4;
                }
                else if(side[0] == 4)
                {
                    side[0] = 5;
                    button0.setBackground(Color.ORANGE);
                    Cube_colors[Side][0] = 5;
                }
                else if(side[0] == 5)
                {
                    side[0] = 6;
                    button0.setBackground(Color.RED);
                    Cube_colors[Side][0] = 6;
                }

            }
        });

        button1.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed

                if(side[1] == 6)
                {
                    side[1] = 1;
                    button1.setBackground(Color.GREEN);
                    Cube_colors[Side][1] = 1;
                }
                else if(side[1] == 1)
                {
                    side[1] = 2;
                    button1.setBackground(Color.WHITE);
                    Cube_colors[Side][1] = 2;
                }
                else if(side[1] == 2)
                {
                    side[1] = 3;
                    button1.setBackground(Color.BLUE);
                    Cube_colors[Side][1] = 3;
                }
                else if(side[1] == 3)
                {
                    side[1] = 4;
                    button1.setBackground(Color.YELLOW);
                    Cube_colors[Side][1] = 4;
                }
                else if(side[1] == 4)
                {
                    side[1] = 5;
                    button1.setBackground(Color.ORANGE);
                    Cube_colors[Side][1] = 5;
                }
                else if(side[1] == 5)
                {
                    side[1] = 6;
                    button1.setBackground(Color.RED);
                    Cube_colors[Side][1] = 6;
                }
            }
        });

        button2.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed

                if(side[2] == 6)
                {
                    side[2] = 1;
                    button2.setBackground(Color.GREEN);
                    Cube_colors[Side][2] = 1;
                }
                else if(side[2] == 1)
                {
                    side[2] = 2;
                    button2.setBackground(Color.WHITE);
                    Cube_colors[Side][2] = 2;
                }
                else if(side[2] == 2)
                {
                    side[2] = 3;
                    button2.setBackground(Color.BLUE);
                    Cube_colors[Side][2] = 3;
                }
                else if(side[2] == 3)
                {
                    side[2] = 4;
                    button2.setBackground(Color.YELLOW);
                    Cube_colors[Side][2] = 4;
                }
                else if(side[2] == 4)
                {
                    side[2] = 5;
                    button2.setBackground(Color.ORANGE);
                    Cube_colors[Side][2] = 5;
                }
                else if(side[2] == 5)
                {
                    side[2] = 6;
                    button2.setBackground(Color.RED);
                    Cube_colors[Side][2] = 6;
                }
            }
        });

        button3.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed

                if(side[3] == 6)
                {
                    side[3] = 1;
                    button3.setBackground(Color.GREEN);
                    Cube_colors[Side][3] = 1;
                }
                else if(side[3] == 1)
                {
                    side[3] = 2;
                    button3.setBackground(Color.WHITE);
                    Cube_colors[Side][3] = 2;
                }
                else if(side[3] == 2)
                {
                    side[3] = 3;
                    button3.setBackground(Color.BLUE);
                    Cube_colors[Side][3] = 3;
                }
                else if(side[3] == 3)
                {
                    side[3] = 4;
                    button3.setBackground(Color.YELLOW);
                    Cube_colors[Side][3] = 4;
                }
                else if(side[3] == 4)
                {
                    side[3] = 5;
                    button3.setBackground(Color.ORANGE);
                    Cube_colors[Side][3] = 5;
                }
                else if(side[3] == 5)
                {
                    side[3] = 6;
                    button3.setBackground(Color.RED);
                    Cube_colors[Side][3] = 6;
                }
            }
        });

        button4.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed

                if(side[4] == 6)
                {
                    side[4] = 1;
                    button4.setBackground(Color.GREEN);
                    Cube_colors[Side][4] = 1;
                }
                else if(side[4] == 1)
                {
                    side[4] = 2;
                    button4.setBackground(Color.WHITE);
                    Cube_colors[Side][4] = 2;
                }
                else if(side[4] == 2)
                {
                    side[4] = 3;
                    button4.setBackground(Color.BLUE);
                    Cube_colors[Side][4] = 3;
                }
                else if(side[4] == 3)
                {
                    side[4] = 4;
                    button4.setBackground(Color.YELLOW);
                    Cube_colors[Side][4] = 4;
                }
                else if(side[4] == 4)
                {
                    side[4] = 5;
                    button4.setBackground(Color.ORANGE);
                    Cube_colors[Side][4] = 5;
                }
                else if(side[4] == 5)
                {
                    side[4] = 6;
                    button4.setBackground(Color.RED);
                    Cube_colors[Side][4] = 6;
                }
            }
        });
        button5.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed

                if(side[5] == 6)
                {
                    side[5] = 1;
                    button5.setBackground(Color.GREEN);
                    Cube_colors[Side][5] = 1;
                }
                else if(side[5] == 1)
                {
                    side[5] = 2;
                    button5.setBackground(Color.WHITE);
                    Cube_colors[Side][5] = 2;
                }
                else if(side[5] == 2)
                {
                    side[5] = 3;
                    button5.setBackground(Color.BLUE);
                    Cube_colors[Side][5] = 3;
                }
                else if(side[5] == 3)
                {
                    side[5] = 4;
                    button5.setBackground(Color.YELLOW);
                    Cube_colors[Side][5] = 4;
                }
                else if(side[5] == 4)
                {
                    side[5] = 5;
                    button5.setBackground(Color.ORANGE);
                    Cube_colors[Side][5] = 5;
                }
                else if(side[5] == 5)
                {
                    side[5] = 6;
                    button5.setBackground(Color.RED);
                    Cube_colors[Side][5] = 6;
                }
            }
        });
        button6.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed

                if(side[6] == 6)
                {
                    side[6] = 1;
                    button6.setBackground(Color.GREEN);
                    Cube_colors[Side][6] = 1;
                }
                else if(side[6] == 1)
                {
                    side[6] = 2;
                    button6.setBackground(Color.WHITE);
                    Cube_colors[Side][6] = 2;
                }
                else if(side[6] == 2)
                {
                    side[6] = 3;
                    button6.setBackground(Color.BLUE);
                    Cube_colors[Side][6] = 3;
                }
                else if(side[6] == 3)
                {
                    side[6] = 4;
                    button6.setBackground(Color.YELLOW);
                    Cube_colors[Side][6] = 4;
                }
                else if(side[6] == 4)
                {
                    side[6] = 5;
                    button6.setBackground(Color.ORANGE);
                    Cube_colors[Side][6] = 5;
                }
                else if(side[6] == 5)
                {
                    side[6] = 6;
                    button6.setBackground(Color.RED);
                    Cube_colors[Side][6] = 6;
                }
            }
        });
        button7.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed

                if(side[7] == 6)
                {
                    side[7] = 1;
                    button7.setBackground(Color.GREEN);
                    Cube_colors[Side][7] = 1;
                }
                else if(side[7] == 1)
                {
                    side[7] = 2;
                    button7.setBackground(Color.WHITE);
                    Cube_colors[Side][7] = 2;
                }
                else if(side[7] == 2)
                {
                    side[7] = 3;
                    button7.setBackground(Color.BLUE);
                    Cube_colors[Side][7] = 3;
                }
                else if(side[7] == 3)
                {
                    side[7] = 4;
                    button7.setBackground(Color.YELLOW);
                    Cube_colors[Side][7] = 4;
                }
                else if(side[7] == 4)
                {
                    side[7] = 5;
                    button7.setBackground(Color.ORANGE);
                    Cube_colors[Side][7] = 5;
                }
                else if(side[7] == 5)
                {
                    side[7] = 6;
                    button7.setBackground(Color.RED);
                    Cube_colors[Side][7] = 6;
                }
            }
        });
        button8.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed

                if(side[8] == 6)
                {
                    side[8] = 1;
                    button8.setBackground(Color.GREEN);
                    Cube_colors[Side][8] = 1;
                }
                else if(side[8] == 1)
                {
                    side[8] = 2;
                    button8.setBackground(Color.WHITE);
                    Cube_colors[Side][8] = 2;
                }
                else if(side[8] == 2)
                {
                    side[8] = 3;
                    button8.setBackground(Color.BLUE);
                    Cube_colors[Side][8] = 3;
                }
                else if(side[8] == 3)
                {
                    side[8] = 4;
                    button8.setBackground(Color.YELLOW);
                    Cube_colors[Side][8] = 4;
                }
                else if(side[8] == 4)
                {
                    side[8] = 5;
                    button8.setBackground(Color.ORANGE);
                    Cube_colors[Side][8] = 5;
                }
                else if(side[8] == 5)
                {
                    side[8] = 6;
                    button8.setBackground(Color.RED);
                    Cube_colors[Side][8] = 6;
                }
            }
        });
        //</editor-fold>
        //when next is pressed change the Side number to the next one
        next.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                button0.setBackground(Color.GRAY);
                button1.setBackground(Color.GRAY);
                button2.setBackground(Color.GRAY);
                button3.setBackground(Color.GRAY);
                button5.setBackground(Color.GRAY);
                button6.setBackground(Color.GRAY);
                button7.setBackground(Color.GRAY);
                button8.setBackground(Color.GRAY);

                for(int j=0; j<=8; j++)
                {
                    side[j]=6;
                }

                if(Side == 0)
                {
                    sideLabel.setText("The Side is White (Orange Top)");
                    button4.setBackground(Color.WHITE);
                    Side++;
                }
                else if(Side == 1)
                {
                    sideLabel.setText("The Side is Blue (Orange Top)");
                    button4.setBackground(Color.BLUE);
                    Side++;
                }
                else if(Side == 2)
                {
                    sideLabel.setText("The Side is Yellow (Orange Top)");
                    button4.setBackground(Color.YELLOW);
                    Side++;
                }
                else if(Side == 3)
                {
                    sideLabel.setText("The Side is Orange (Yellow Top)");
                    button4.setBackground(Color.ORANGE);
                    Side++;
                }
                else if(Side == 4)
                {
                    sideLabel.setText("The Side is Red (White Top)");
                    button4.setBackground(Color.RED);
                    Side++;
                }
                else if(Side == 5)
                {
                    Side = 0;
                    sideLabel.setText("The Side is Green (Orange Top)");
                    button4.setBackground(Color.GREEN);
                }

            }
        });
        done.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                System.out.println("START");
                //solve the white side
                for(int i=0; i<=5; i++)
                {
                    for(int j=0; j<=8; j++)
                    {
                        System.out.print(Cube_colors[i][j]);
                    }
                    System.out.println("");
                }
                Cube_colors = whiteSide(Cube_colors);
                Cube_colors = SecondLayer(Cube_colors);
                Cube_colors = OLL(Cube_colors);
                Cube_colors = PLL(Cube_colors);
                System.out.println(" Cube Solved!!");

            }
        });

    }

    public static int[][] whiteSide(int Cube_colors[][])
    {
        //make the cross for the white side
        Cube_colors = whiteCross(Cube_colors);
        //solve the edge pieces for the cube
        Cube_colors = whiteCorner(Cube_colors);
        return Cube_colors;
    }

    public static int[][] whiteCross(int Cube_colors[][])
    {
        //get the green and shite piece into place
        Cube_colors = whiteFirstEdge(Cube_colors);
        //get the orange and white piece into place
        Cube_colors = whiteSecondEdge(Cube_colors);
        //get the bloue and white piece into place
        Cube_colors = whiteThirdEdge(Cube_colors);
        //get the red and white piece into place
        Cube_colors = whiteFourthEdge(Cube_colors);
        System.out.println("Cross Done");

        return Cube_colors;
    }

    public static int[][] whiteFirstEdge(int Cube_colors[][])
    {
        /*
        in this method we are going to take
        the white/green corner piece and put
        it in the right place
         */
        if(Cube_colors[0][1] == 2 && Cube_colors[4][3] == 1)
        {
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(Cube_colors[0][3] == 2 && Cube_colors[3][5] == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(Cube_colors[0][5] == 2 && Cube_colors[1][3] == 1)
        {
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(Cube_colors[0][7] == 2 && Cube_colors[5][3] == 1)
        {
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(Cube_colors[1][1] ==  2 && Cube_colors[4][7] == 1)
        {
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(Cube_colors[1][3] == 2 && Cube_colors[0][5] == 1)
        {
            //this is in the right place so it doesnt need to be moved
        }
        else if(Cube_colors[1][5] == 2 && Cube_colors[2][3] == 1)
        {
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(Cube_colors[1][7] == 2 && Cube_colors[5][1] == 1)
        {
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(Cube_colors[2][1] == 2 && Cube_colors[4][5] == 1)
        {
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(Cube_colors[2][3] == 2 && Cube_colors[1][5] == 1)
        {
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(Cube_colors[2][5] == 2 && Cube_colors[3][3] == 1)
        {
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(Cube_colors[2][7] == 2 && Cube_colors[5][5] == 1)
        {
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(Cube_colors[3][1] == 2 && Cube_colors[4][1] == 1)
        {
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(Cube_colors[3][3] == 2 && Cube_colors[2][5] == 1)
        {
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(Cube_colors[3][5] == 2 && Cube_colors[0][3] == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[3][7] == 2 && Cube_colors[5][7] == 1)
        {
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[4][1] == 2 && Cube_colors[3][1] == 1)
        {
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[4][3] == 2 && Cube_colors[0][1] == 1)
        {
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[4][5] == 2 && Cube_colors[2][1] == 1)
        {
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[4][7] == 2 && Cube_colors[1][1] == 1)
        {
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[5][1] == 2 && Cube_colors[1][7] == 1)
        {
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(Cube_colors[5][3] == 2 && Cube_colors[0][7] == 1)
        {
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(Cube_colors[5][5] == 2 && Cube_colors[2][7] == 1)
        {
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(Cube_colors[5][7] == 2 && Cube_colors[3][7] == 1)
        {
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
        }
        else
            System.out.println("Green Edge No Case");
        return Cube_colors;
    }

    public static int[][] whiteSecondEdge(int Cube_colors[][])
    {
        if(Cube_colors[0][1] == 2 && Cube_colors[4][3] == 5)
        {
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(Cube_colors[0][3] == 2 && Cube_colors[3][5] == 5)
        {
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
        }

        else if(Cube_colors[0][7] == 2 && Cube_colors[5][3] == 5)
        {
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[1][1] == 2 && Cube_colors[4][7] == 5)
        {
            //this piece is in the right place
        }

        else if(Cube_colors[1][5] == 2 && Cube_colors[2][3] == 5)
        {
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);

        }
        else if(Cube_colors[1][7] == 2 && Cube_colors[5][1] == 5)
        {
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[2][1] == 2 && Cube_colors[4][5] == 5)
        {
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[2][3] == 2 && Cube_colors[1][5] == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[2][5] == 2 && Cube_colors[3][3] == 5)
        {
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[2][7] == 2 && Cube_colors[5][5] == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[3][1] == 2 && Cube_colors[4][1] == 5)
        {
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[3][3] == 2 && Cube_colors[2][5] == 5)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[3][5] == 2 && Cube_colors[0][3] == 5)
        {
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[3][7] == 2 && Cube_colors[5][7] == 5)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[4][1] == 2 && Cube_colors[3][1] == 5)
        {
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[4][3] == 2 && Cube_colors[0][1] == 5)
        {
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[4][5] == 2 && Cube_colors[2][1] == 5)
        {
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[4][7] == 2 && Cube_colors[1][1] == 5)
        {
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(Cube_colors[5][1] == 2 && Cube_colors[1][7] == 5)
        {
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(Cube_colors[5][3] == 2 && Cube_colors[0][7] == 5)
        {
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(Cube_colors[5][5] == 2 && Cube_colors[2][7] == 5)
        {
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(Cube_colors[5][7] == 2 && Cube_colors[3][7] == 5)
        {
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else
            System.out.println("Orange Edge No Case");
        return Cube_colors;
    }

    public static int[][] whiteThirdEdge(int Cube_colors[][])
    {
        if(Cube_colors[0][1] == 2 && Cube_colors[4][3] == 3)
        {
            Cube_colors = WhiteCCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(Cube_colors[0][3] == 2 && Cube_colors[3][5] == 3)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(Cube_colors[0][7] == 2 && Cube_colors[5][3] == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
        }

        else if(Cube_colors[1][5] == 2 && Cube_colors[2][3] == 3)
        {
            /*
            if it is here then it is in the right place
             */
        }
        else if(Cube_colors[1][7] == 2 && Cube_colors[5][1] == 3)
        {
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(Cube_colors[2][1] == 2 && Cube_colors[4][5] == 3)
        {
            Cube_colors = WhiteCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(Cube_colors[2][3] == 2 && Cube_colors[1][5] == 3)
        {
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(Cube_colors[2][5] == 2 && Cube_colors[3][3] == 3)
        {
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(Cube_colors[2][7] == 2 && Cube_colors[5][5] == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(Cube_colors[3][1] == 2 && Cube_colors[4][1] == 3)
        {
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(Cube_colors[3][3] == 2 && Cube_colors[2][5] == 3)
        {
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(Cube_colors[3][5] == 2 && Cube_colors[0][3] == 3)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(Cube_colors[3][7] == 2 && Cube_colors[5][7] == 3)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(Cube_colors[4][1] == 2 && Cube_colors[3][1] == 3)
        {
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(Cube_colors[4][3] == 2 && Cube_colors[0][1] == 3)
        {
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(Cube_colors[4][5] == 2 && Cube_colors[2][1] == 3)
        {
            Cube_colors = BlueCCW(Cube_colors);
        }

        else if(Cube_colors[5][1] == 2 && Cube_colors[1][7] == 3)
        {
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(Cube_colors[5][3] == 2 && Cube_colors[0][7] == 3)
        {
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(Cube_colors[5][5] == 2 && Cube_colors[2][7] == 3)
        {
            Cube_colors = RedCW(Cube_colors);
        }
        else if(Cube_colors[5][7] == 2 && Cube_colors[3][7] == 3)
        {
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
        }
        else
            System.out.println("Blue Edge No Case");
        return Cube_colors;
    }

    public static int[][] whiteFourthEdge(int Cube_colors[][])
    {
        if(Cube_colors[0][1] == 2 && Cube_colors[4][3] == 6)
        {
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(Cube_colors[0][3] == 2 && Cube_colors[3][5] == 6)
        {
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }

        else if(Cube_colors[0][7] == 2 && Cube_colors[5][3] == 6)
        {
            Cube_colors = RedCW(Cube_colors);
        }

        else if(Cube_colors[1][7] == 2 && Cube_colors[5][1] == 6)
        {
            //if it is here then it is in the right place
        }
        else if(Cube_colors[2][1] == 2 && Cube_colors[4][5] == 6)
        {
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
        }

        else if(Cube_colors[2][5] == 2 && Cube_colors[3][3] == 6)
        {
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(Cube_colors[2][7] == 2 && Cube_colors[5][5] == 6)
        {
            Cube_colors = RedCCW(Cube_colors);
        }
        else if(Cube_colors[3][1] == 2 && Cube_colors[4][1] == 6)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
        }
        else if(Cube_colors[3][3] == 2 && Cube_colors[2][5] == 6)
        {
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
        }
        else if(Cube_colors[3][5] == 2 && Cube_colors[0][3] == 6)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
        }
        else if(Cube_colors[3][7] == 2 && Cube_colors[5][7] == 6)
        {
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
        }
        else if(Cube_colors[4][1] == 2 && Cube_colors[3][1] == 6)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[4][3] == 2 && Cube_colors[0][1] == 6)
        {
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(Cube_colors[4][5] == 2 && Cube_colors[2][1] == 6)
        {
            Cube_colors = WhiteCCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
        }

        else if(Cube_colors[5][1] == 2 && Cube_colors[1][7] == 6)
        {
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(Cube_colors[5][3] == 2 && Cube_colors[0][7] == 6)
        {
            Cube_colors = WhiteCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
        }
        else if(Cube_colors[5][5] == 2 && Cube_colors[2][7] == 6)
        {
            Cube_colors = WhiteCCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(Cube_colors[5][7] == 2 && Cube_colors[3][7] == 6)
        {
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
        }
        else
            System.out.println("Red No Case");
        return Cube_colors;
    }

    //<editor-fold defaultstate="collapsed" desc="The white corners">
    public static int[][] whiteCorner(int Cube_colors[][])
    {
        //get the green, orange, and white piece into place
        Cube_colors = whiteFirstCorner(Cube_colors);
        System.out.println("Corner 1 inserted");
        //get the green, red, and white piece into place
        Cube_colors = whiteSecondCorner(Cube_colors);
        System.out.println("Corner 2 inserted");
        //get the blue, orange, and white piece into place
        Cube_colors = whiteThirdCorner(Cube_colors);
        System.out.println("Corner 3 inserted");
        //get the red, blue, and white piecie into place
        Cube_colors = whiteFourthCorner(Cube_colors);
        System.out.println("Corner 4 inserted");

        return Cube_colors;
    }

    public static int[][] whiteFirstCorner(int Cube_colors[][])
    {
        if(Cube_colors[0][0] == 2 && Cube_colors[4][0] == 5 && Cube_colors[3][2] == 1)
        {
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[0][2] == 2 && Cube_colors[1][0] == 5 && Cube_colors[4][6] == 1)
        {
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[0][6] == 2 && Cube_colors[3][8] == 5 && Cube_colors[5][6] == 1)
        {
            Cube_colors = WhiteCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(Cube_colors[0][8] == 2 && Cube_colors[5][0] == 5 && Cube_colors[1][6] == 1)
        {
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = WhiteCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = WhiteCW(Cube_colors);
        }
        else if(Cube_colors[1][0] == 2 && Cube_colors[4][6] == 5 && Cube_colors[0][2] == 1)
        {
            //nothing
        }
        else if(Cube_colors[1][2] == 2 && Cube_colors[2][0] == 5 && Cube_colors[4][8] == 1)
        {
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[1][6] == 2 && Cube_colors[0][8] == 5 && Cube_colors[5][0] == 1)
        {
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[1][8] == 2 && Cube_colors[5][2] == 5 && Cube_colors[2][6] == 1)
        {
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(Cube_colors[2][0] == 2 && Cube_colors[4][8] == 5 && Cube_colors[1][2] == 1)
        {
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(Cube_colors[2][2] == 2 && Cube_colors[3][0] == 5 && Cube_colors[4][2] == 1)
        {
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[2][6] == 2 && Cube_colors[1][8] == 5 && Cube_colors[5][2] == 1)
        {
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[2][8] == 2 && Cube_colors[5][8] == 5 && Cube_colors[3][6] == 1)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[3][0] == 2 && Cube_colors[4][2] == 5 && Cube_colors[2][2] == 1)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[3][2] == 2 && Cube_colors[0][0] == 5 && Cube_colors[4][0] == 1)
        {
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[3][6] == 2 && Cube_colors[2][8] == 5 && Cube_colors[5][8] == 1)
        {
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[3][8] == 2 && Cube_colors[5][6] == 5 && Cube_colors[0][6] == 1)
        {
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[4][0] == 2 && Cube_colors[3][2] == 5 && Cube_colors[0][0] == 1)
        {
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(Cube_colors[4][2] == 2 && Cube_colors[2][2] == 5 && Cube_colors[3][0] == 1)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[4][6] == 2 && Cube_colors[0][2] == 5 && Cube_colors[1][0] == 1)
        {
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[4][8] == 2 && Cube_colors[1][2] == 5 && Cube_colors[2][0] == 1)
        {
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[5][0] == 2 && Cube_colors[1][6] == 5 && Cube_colors[0][8] == 1)
        {
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else if(Cube_colors[5][2] == 2 && Cube_colors[2][6] == 5 && Cube_colors[1][8] == 1)
        {
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(Cube_colors[5][6] == 2 && Cube_colors[0][6] == 5 && Cube_colors[3][8] == 1)
        {
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
        }
        else if(Cube_colors[5][8] == 2 && Cube_colors[3][6] == 5 && Cube_colors[2][8] == 1)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
        }
        else
            System.out.println("Green-Orange No Case");
        return Cube_colors;
    }

    public static int[][] whiteSecondCorner(int Cube_colors[][])
    {
        if(Cube_colors[0][0] == 2 && Cube_colors[4][0] == 1 && Cube_colors[3][2] == 6)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
        }
        // 02 is where the white orange green is

        else if(Cube_colors[0][6] == 2 && Cube_colors[3][8] == 1 && Cube_colors[5][6] == 6)
        {
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
        }
        else if(Cube_colors[0][8] == 2 && Cube_colors[5][0] == 1 && Cube_colors[1][6] == 6)
        {
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(Cube_colors[1][2] == 2 && Cube_colors[2][0] == 1 && Cube_colors[4][8] == 6)
        {
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(Cube_colors[1][6] == 2 && Cube_colors[0][8] == 1 && Cube_colors[5][0] == 6)
        {
            //this is the place it should be in so its fine
        }
        else if(Cube_colors[1][8] == 2 && Cube_colors[5][2] == 1 && Cube_colors[2][6] == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
        }
        else if(Cube_colors[2][0] == 2 && Cube_colors[4][8] == 1 && Cube_colors[1][2] == 6)
        {
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
        }
        else if(Cube_colors[2][2] == 2 && Cube_colors[3][0] == 1 && Cube_colors[4][2] == 6)
        {
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
        }
        else if(Cube_colors[2][6] == 2 && Cube_colors[1][8] == 1 && Cube_colors[5][2] == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
        }
        else if(Cube_colors[2][8] == 2 && Cube_colors[5][8] == 1 && Cube_colors[3][6] == 6)
        {
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(Cube_colors[3][0] == 2 && Cube_colors[4][2] == 1 && Cube_colors[2][2] == 6)
        {
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
        }
        else if(Cube_colors[3][2] == 2 && Cube_colors[0][0] == 1 && Cube_colors[4][0] == 6)
        {
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
        }
        else if(Cube_colors[3][6] == 2 && Cube_colors[2][8] == 1 && Cube_colors[5][8] == 6)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
        }
        else if(Cube_colors[3][8] == 2 && Cube_colors[5][6] == 1 && Cube_colors[0][6] == 6)
        {
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
        }
        //for 46 there is already something there
        else if(Cube_colors[4][0] == 2 && Cube_colors[3][2] == 1 && Cube_colors[0][0] == 6)
        {
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
        }
        else if(Cube_colors[4][2] == 2 && Cube_colors[2][2] == 1 && Cube_colors[3][0] == 6)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
        }
        else if(Cube_colors[4][8] == 2 && Cube_colors[1][2] == 1 && Cube_colors[2][0] == 6)
        {
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
        }
        else if(Cube_colors[5][0] == 2 && Cube_colors[1][6] == 1 && Cube_colors[0][8] == 6)
        {
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
        }
        else if(Cube_colors[5][2] == 2 && Cube_colors[2][6] == 1 && Cube_colors[1][8] == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
        }
        else if(Cube_colors[5][6] == 2 && Cube_colors[0][6] == 1 && Cube_colors[3][8] == 6)
        {
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
        }
        else if(Cube_colors[5][8] == 2 && Cube_colors[3][6] == 1 && Cube_colors[2][8] == 6)
        {
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = GreenCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = GreenCCW(Cube_colors);
        }
        else
            System.out.println("Green-Red No Case");
        return Cube_colors;
    }

    public static int[][] whiteThirdCorner(int Cube_colors[][])
    {
        if(Cube_colors[0][0] == 2 && Cube_colors[4][0] == 3 && Cube_colors[3][2] == 5)
        {
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
        }
        //wont be here because it is already taken
        else if(Cube_colors[0][6] == 2 && Cube_colors[5][6] == 5 && Cube_colors[3][8] == 3)
        {
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        //wont be here because 08 is already take
        // wint be here because 10 is already taken
        else if(Cube_colors[1][2] == 2 && Cube_colors[4][8] == 5 && Cube_colors[2][0] == 3)
        {
            //this is the place it should be in so its fine
        }
        //wont be here because 16 is already taken
        else if(Cube_colors[1][8] == 2 && Cube_colors[2][6] == 5 && Cube_colors[5][2] == 3)
        {
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[2][0] == 2 && Cube_colors[1][2] == 5 && Cube_colors[4][8] == 3)
        {
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[2][2] == 2 && Cube_colors[4][2] == 5 && Cube_colors[3][0] == 3)
        {
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(Cube_colors[2][6] == 2 && Cube_colors[5][2] == 5 && Cube_colors[1][8] == 3)
        {
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[2][8] == 2 && Cube_colors[3][6] == 5 && Cube_colors[5][8] == 3)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[3][0] == 2 && Cube_colors[2][2] == 5 && Cube_colors[4][2] == 3)
        {
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[3][2] == 2 && Cube_colors[4][0] == 5 && Cube_colors[0][0] == 3)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[3][6] == 2 && Cube_colors[5][8] == 5 && Cube_colors[2][8] == 3)
        {
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[3][8] == 2 && Cube_colors[0][6] == 5 && Cube_colors[5][6] == 3)
        {
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[4][0] == 2 && Cube_colors[0][0] == 5 && Cube_colors[3][2] == 3)
        {
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
        }
        else if(Cube_colors[4][2] == 2 && Cube_colors[3][0] == 5 && Cube_colors[2][2] == 3)
        {
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[4][8] == 2 && Cube_colors[2][0] == 5 && Cube_colors[1][2] == 3)
        {
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[5][2] == 2 && Cube_colors[1][8] == 5 && Cube_colors[2][6] == 3)
        {
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[5][6] == 2 && Cube_colors[3][8] == 5 && Cube_colors[0][6] == 3)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else if(Cube_colors[5][8] == 2 && Cube_colors[2][8] == 5 && Cube_colors[3][6] == 3)
        {
            Cube_colors = OrangeCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = OrangeCW(Cube_colors);
        }
        else
            System.out.println("Blue-Orange No Case");
        return Cube_colors;
    }

    public static int[][] whiteFourthCorner(int Cube_colors[][])
    {
        if(Cube_colors[0][0] == 2 && Cube_colors[3][2] == 3 && Cube_colors[4][0] == 6)
        {
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
        }
        //it wont be at 02 because there is already a picec there
        else if(Cube_colors[0][6] == 2 && Cube_colors[5][6] == 3 && Cube_colors[3][8] == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
        }
        //it wouldnt be at 08 becuase there is already a piece there
        //10 piece already there
        //12 piece alrady there
        //16 piece already there
        else if(Cube_colors[1][8] == 2 && Cube_colors[2][6] == 3 && Cube_colors[5][2] == 6)
        {
            //this is the place it should be in so its fine
        }
        //20 cant becuase there is a piece already there
        else if(Cube_colors[2][2] == 2 && Cube_colors[4][2] == 3 && Cube_colors[3][0] == 6)
        {
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
        }
        else if(Cube_colors[2][6] == 2 && Cube_colors[5][2] == 3 && Cube_colors[1][8] == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(Cube_colors[2][8] == 2 && Cube_colors[3][6] == 3 && Cube_colors[5][8] == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(Cube_colors[3][0] == 2 && Cube_colors[2][2] == 3 && Cube_colors[4][2] == 6)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(Cube_colors[3][2] == 2 && Cube_colors[4][0] == 3 && Cube_colors[0][0] == 6)
        {
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(Cube_colors[3][6] == 2 && Cube_colors[5][8] == 3 && Cube_colors[2][8] == 6)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(Cube_colors[3][8] == 2 && Cube_colors[0][6] == 3 && Cube_colors[5][6] == 6)
        {
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(Cube_colors[4][0] == 2 && Cube_colors[0][0] == 3 && Cube_colors[3][2] == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(Cube_colors[4][2] == 2 && Cube_colors[2][2] == 6 && Cube_colors[3][0] == 3)
        {
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
        }
        //50 is already taken by another poiece
        else if(Cube_colors[5][2] == 2 && Cube_colors[1][8] == 3 && Cube_colors[2][6] == 6)
        {
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
        }
        else if(Cube_colors[5][6] == 2 && Cube_colors[3][8] == 3 && Cube_colors[0][6] == 6)
        {
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = BlueCCW(Cube_colors);
            Cube_colors = YellowCCW(Cube_colors);
            Cube_colors = BlueCW(Cube_colors);
        }
        else if(Cube_colors[5][8] == 2 && Cube_colors[2][8] == 3 && Cube_colors[3][6] == 6)
        {
            Cube_colors = RedCW(Cube_colors);
            Cube_colors = YellowCW(Cube_colors);
            Cube_colors = RedCCW(Cube_colors);
        }
        else
            System.out.println("Blue-Red No Case");
        return Cube_colors;
    }

    public static int[][] SecondLayer(int Cube_colors[][])
    {
        Cube_colors=Orange_Green(Cube_colors);
        System.out.println("Edge 1 inserted");

        Cube_colors=Orange_Blue(Cube_colors);
        System.out.println("Edge 2 inserted");

        Cube_colors=Red_Blue(Cube_colors);
        System.out.println("Edge 3 inserted");

        Cube_colors=Red_Green(Cube_colors);
        System.out.println("Edge 4 inserted");

        return Cube_colors;
    }

    public static int[][] Orange_Green(int Cube_colors[][])
    {
        if(Cube_colors[0][1] == 1 && Cube_colors[4][3] == 5)
        {
            //nothing
        }

        else if(Cube_colors[0][3] == 1 && Cube_colors[3][5] == 5)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
        }

        else if(Cube_colors[0][7] == 1 && Cube_colors[5][3] == 5)
        {
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
        }

        else if(Cube_colors[2][1] == 1 && Cube_colors[4][5] == 5)
        {
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
        }

        else if(Cube_colors[2][5] == 1 && Cube_colors[3][3] == 5)
        {
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
        }

        else if(Cube_colors[2][7] == 1 && Cube_colors[5][5] == 5)
        {
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);

            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
        }

        else if(Cube_colors[3][1] == 1 && Cube_colors[4][1] == 5)
        {
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
        }

        else if(Cube_colors[3][3] == 1 && Cube_colors[2][5] == 5)
        {
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
        }

        else if(Cube_colors[3][5] == 1 && Cube_colors[0][3] == 5)
        {
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
        }

        else if(Cube_colors[3][7] == 1 && Cube_colors[5][7] == 5)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
        }

        else if(Cube_colors[4][1] == 1 && Cube_colors[3][1] == 5)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
        }

        else if(Cube_colors[4][3] == 1 && Cube_colors[0][1] == 5)
        {
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
        }

        else if(Cube_colors[4][5] == 1 && Cube_colors[2][1] == 5)
        {
            Cube_colors=WhiteCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
            Cube_colors=WhiteCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
        }

        else if(Cube_colors[5][3] == 1 && Cube_colors[0][7] == 5)
        {
            Cube_colors=WhiteCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=WhiteCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
        }

        else if(Cube_colors[5][5] == 1 && Cube_colors[2][7] == 5)
        {
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=WhiteCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=WhiteCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
        }

        else if(Cube_colors[5][7] == 1 && Cube_colors[3][7] == 5)
        {
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
        }
        return Cube_colors;
    }

    public static int[][] Orange_Blue(int Cube_colors[][])
    {

        if(Cube_colors[0][3] == 3 && Cube_colors[3][5] == 5)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
        }

        else if(Cube_colors[0][7] == 3 && Cube_colors[5][3] == 5)
        {
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);

            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
        }

        else if(Cube_colors[2][1] == 3 && Cube_colors[4][5] == 5)
        {
            //nothing
        }

        else if(Cube_colors[2][5] == 3 && Cube_colors[3][3] == 5)
        {
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
        }

        else if(Cube_colors[2][7] == 3 && Cube_colors[5][5] == 5)
        {
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
        }

        else if(Cube_colors[3][1] == 3 && Cube_colors[4][1] == 5)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
        }

        else if(Cube_colors[3][3] == 3 && Cube_colors[2][5] == 5)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
        }

        else if(Cube_colors[3][5] == 3 && Cube_colors[0][3] == 5)
        {
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
        }

        else if(Cube_colors[3][7] == 3 && Cube_colors[5][7] == 5)
        {
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
        }

        else if(Cube_colors[4][1] == 3 && Cube_colors[3][1] == 5)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
        }

        else if(Cube_colors[4][5] == 3 && Cube_colors[2][1] == 5)
        {
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
        }

        else if(Cube_colors[5][3] == 3 && Cube_colors[0][7] == 5)
        {
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);

            Cube_colors=WhiteCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=WhiteCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
        }

        else if(Cube_colors[5][5] == 3 && Cube_colors[2][7] == 5)
        {
            Cube_colors=WhiteCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=WhiteCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
        }

        else if(Cube_colors[5][7] == 3 && Cube_colors[3][7] == 5)
        {
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
        }
        return Cube_colors;
    }

    public static int[][] Red_Blue(int Cube_colors[][])
    {

        if(Cube_colors[0][3] == 3 && Cube_colors[3][5] == 6)
        {
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
        }

        else if(Cube_colors[0][7] == 3 && Cube_colors[5][3] == 6)
        {
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
        }

        else if(Cube_colors[2][5] == 3 && Cube_colors[3][3] == 6)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
        }

        else if(Cube_colors[2][7] == 3 && Cube_colors[5][5] == 6)
        {
            //nothing
        }

        else if(Cube_colors[3][1] == 3 && Cube_colors[4][1] == 6)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
        }

        else if(Cube_colors[3][3] == 3 && Cube_colors[2][5] == 6)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
        }

        else if(Cube_colors[3][5] == 3 && Cube_colors[0][3] == 6)
        {
            Cube_colors=BlueCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
        }

        else if(Cube_colors[3][7] == 3 && Cube_colors[5][7] == 6)
        {
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
        }

        else if(Cube_colors[4][1] == 3 && Cube_colors[3][1] == 6)
        {
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
        }

        else if(Cube_colors[5][3] == 3 && Cube_colors[0][7] == 6)
        {
            Cube_colors=WhiteCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=WhiteCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
        }

        else if(Cube_colors[5][5] == 3 && Cube_colors[2][7] == 6)
        {
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
        }

        else if(Cube_colors[5][7] == 3 && Cube_colors[3][7] == 6)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
        }
        return Cube_colors;
    }

    public static int[][] Red_Green(int Cube_colors[][])
    {

        if(Cube_colors[0][3] == 1 && Cube_colors[3][5] == 6)
        {
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
        }

        else if(Cube_colors[0][7] == 1 && Cube_colors[5][3] == 6)
        {
            //nothing
        }

        else if(Cube_colors[2][5] == 1 && Cube_colors[3][3] == 6)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
        }

        else if(Cube_colors[3][1] == 1 && Cube_colors[4][1] == 6)
        {
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
        }

        else if(Cube_colors[3][3] == 1 && Cube_colors[2][5] == 6)
        {
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
        }

        else if(Cube_colors[3][5] == 1 && Cube_colors[0][3] == 6)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
        }

        else if(Cube_colors[3][7] == 1 && Cube_colors[5][7] == 6)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
        }

        else if(Cube_colors[4][1] == 1 && Cube_colors[3][1] == 6)
        {
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
        }

        else if(Cube_colors[5][3] == 1 && Cube_colors[0][7] == 6)
        {
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
        }

        else if(Cube_colors[5][7] == 1 && Cube_colors[3][7] == 6)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
        }
        return Cube_colors;
    }

    public static int[][] OLL(int Cube_colors[][])
    {
        Cube_colors=Look1(Cube_colors);
        System.out.println("Edges oriented");

        Cube_colors=Look2(Cube_colors);
        System.out.println("Corners also oriented");

        return Cube_colors;
    }

    public static int[][] Look1(int Cube_colors[][])
    {
        if(Cube_colors[3][1] == 4 && Cube_colors[3][3] == 4 && Cube_colors[3][5] == 4 && Cube_colors[3][7] == 4)
        {
            //nothing
        }

        else if(Cube_colors[3][7] == 4 && Cube_colors[3][3] == 4)
        {
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
        }

        else if(Cube_colors[3][3] == 4 && Cube_colors[3][1] == 4)
        {
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
        }

        else if(Cube_colors[3][1] == 4 && Cube_colors[3][5] == 4)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
        }

        else if(Cube_colors[3][5] == 4 && Cube_colors[3][7] == 4)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
        }

        else if(Cube_colors[3][7] == 4 && Cube_colors[3][1] == 4)
        {
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
        }

        else if(Cube_colors[3][3] == 4 && Cube_colors[3][5] == 4)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
        }

        else
        {
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
        }
        return Cube_colors;
    }

    public static int[][] Look2(int Cube_colors[][])
    {
        if(Cube_colors[0][0] == 4 && Cube_colors[4][2] == 4 && Cube_colors[2][8] == 4)
        {
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
        }

        else if(Cube_colors[4][2] == 4 && Cube_colors[2][8] == 4 && Cube_colors[5][6] == 4)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
        }

        else if(Cube_colors[2][8] == 4 && Cube_colors[5][6] == 4 && Cube_colors[0][0] == 4)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
        }

        else if(Cube_colors[5][6] == 4 && Cube_colors[0][0] == 4 && Cube_colors[4][2] == 4)
        {
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
        }

        else if(Cube_colors[0][6] == 4 && Cube_colors[4][0] == 4 && Cube_colors[2][2] == 4)
        {
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
        }

        else if(Cube_colors[4][0] == 4 && Cube_colors[2][2] == 4 && Cube_colors[5][8] == 4)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
        }

        else if(Cube_colors[2][2] == 4 && Cube_colors[5][8] == 4 && Cube_colors[0][6] == 4)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
        }

        else if(Cube_colors[5][8] == 4 && Cube_colors[0][6] == 4 && Cube_colors[4][0] == 4)
        {
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
        }

        else if(Cube_colors[0][0] == 4 && Cube_colors[2][2] == 4 && Cube_colors[5][8] == 4 && Cube_colors[5][6] == 4)
        {
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
        }

        else if(Cube_colors[4][2] == 4 && Cube_colors[5][8] == 4 && Cube_colors[0][6] == 4 && Cube_colors[0][0] == 4)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
        }

        else if(Cube_colors[2][8] == 4 && Cube_colors[0][6] == 4 && Cube_colors[4][0] == 4 && Cube_colors[4][2] == 4)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
        }

        else if(Cube_colors[5][6] == 4 && Cube_colors[4][0] == 4 && Cube_colors[2][2] == 4 && Cube_colors[2][8] == 4)
        {
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
        }

        else if(Cube_colors[4][0] == 4 && Cube_colors[4][2] == 4 && Cube_colors[5][8] == 4 && Cube_colors[5][6] == 4)
        {
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
        }

        else if(Cube_colors[0][6] == 4 && Cube_colors[0][0] == 4 && Cube_colors[2][2] == 4 && Cube_colors[2][8] == 4)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
        }

        else if(Cube_colors[0][0] == 4 && Cube_colors[2][2] == 4)
        {
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
        }

        else if(Cube_colors[4][2] == 4 && Cube_colors[5][8] == 4)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
        }

        else if(Cube_colors[2][8] == 4 && Cube_colors[0][6] == 4)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
        }

        else if(Cube_colors[5][6] == 4 && Cube_colors[4][0] == 4)
        {
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=RedCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=RedCCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
        }

        else if(Cube_colors[0][6] == 4 && Cube_colors[4][2] == 4)
        {
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
        }

        else if(Cube_colors[4][0] == 4 && Cube_colors[2][8] == 4)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
        }

        else if(Cube_colors[2][2] == 4 && Cube_colors[5][6] == 4)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
        }

        else if(Cube_colors[5][8] == 4 && Cube_colors[0][0] == 4)
        {
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=GreenCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=BlueCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=GreenCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=BlueCW(Cube_colors);
        }

        else if(Cube_colors[0][6] == 4 && Cube_colors[0][0] == 4)
        {
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=WhiteCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=WhiteCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
        }

        else if(Cube_colors[4][0] == 4 && Cube_colors[4][2] == 4)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=WhiteCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=WhiteCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
        }

        else if(Cube_colors[2][2] == 4 && Cube_colors[2][8] == 4)
        {
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=WhiteCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=WhiteCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
        }

        else if(Cube_colors[5][8] == 4 && Cube_colors[5][6] == 4)
        {
            Cube_colors=YellowCCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=WhiteCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCW(Cube_colors);
            Cube_colors=WhiteCCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=YellowCW(Cube_colors);
            Cube_colors=OrangeCCW(Cube_colors);
        }
        return Cube_colors;
    }

    public static int[][] PLL(int Cube_colors[][])
    {
        //GA
        if(Cube_colors[5][6]  == 3 && Cube_colors[5][7] == 5 && Cube_colors[5][8] == 3 && Cube_colors[2][5] == 6 && Cube_colors[4][2] == 6 && Cube_colors[4][1] == 3)
        {
            System.out.print("R R D B' U B' U' B D' R R F' U F");
        }
        else if(Cube_colors[0][0]  == 3 && Cube_colors[0][3] == 5 && Cube_colors[0][6] == 3 && Cube_colors[5][7] == 6 && Cube_colors[2][8] == 6 && Cube_colors[2][5] == 3)
        {
            System.out.print("U R R D B' U B' U' B D' R R F' U F");
        }
        else if(Cube_colors[4][2]  == 3 && Cube_colors[4][1] == 5 && Cube_colors[4][0] == 3 && Cube_colors[0][3] == 6 && Cube_colors[5][6] == 6 && Cube_colors[5][7] == 3)
        {
            System.out.print("U U R R D B' U B' U' B D' R R F' U F");
        }
        else if(Cube_colors[2][8]  == 3 && Cube_colors[2][5] == 5 && Cube_colors[2][2] == 3 && Cube_colors[4][1] == 6 && Cube_colors[0][0] == 6 && Cube_colors[0][3] == 3)
        {
            System.out.print("U' R R D B' U B' U' B D' R R F' U F");
        }//*********************************************************************************************************************************************************************

        else if(Cube_colors[5][6]  == 6 && Cube_colors[5][7] == 3 && Cube_colors[5][8] == 6 && Cube_colors[2][5] == 1 && Cube_colors[4][2] == 1 && Cube_colors[4][1] == 6)
        {
            System.out.print("R R D B' U B' U' B D' R R F' U F U'");
        }
        else if(Cube_colors[0][0]  == 6 && Cube_colors[0][3] == 3 && Cube_colors[0][6] == 6 && Cube_colors[5][7] == 1 && Cube_colors[2][8] == 1 && Cube_colors[2][5] == 6)
        {
            System.out.print("U R R D B' U B' U' B D' R R F' U F U'");
        }
        else if(Cube_colors[4][2]  == 6 && Cube_colors[4][1] == 3 && Cube_colors[4][0] == 6 && Cube_colors[0][3] == 1 && Cube_colors[5][6] == 1 && Cube_colors[5][7] == 6)
        {
            System.out.print("U U R R D B' U B' U' B D' R R F' U F U'");
        }
        else if(Cube_colors[2][8]  == 6 && Cube_colors[2][5] == 3 && Cube_colors[2][2] == 6 && Cube_colors[4][1] == 1 && Cube_colors[0][0] == 1 && Cube_colors[0][3] == 6)
        {
            System.out.print("U' R R D B' U B' U' B D' R R F' U F U'");
        }//*********************************************************************************************************************************************************************

        else if(Cube_colors[5][6]  == 1 && Cube_colors[5][7] == 6 && Cube_colors[5][8] == 1 && Cube_colors[2][5] == 5 && Cube_colors[4][2] == 5 && Cube_colors[4][1] == 1)
        {
            System.out.print("R R D B' U B' U' B D' R R F' U F U U");
        }
        else if(Cube_colors[0][0]  == 1 && Cube_colors[0][3] == 6 && Cube_colors[0][6] == 1 && Cube_colors[5][7] == 5 && Cube_colors[2][8] == 5 && Cube_colors[2][5] == 1)
        {
            System.out.print("U R R D B' U B' U' B D' R R F' U F U U");
        }
        else if(Cube_colors[4][2]  == 1 && Cube_colors[4][1] == 6 && Cube_colors[4][0] == 1 && Cube_colors[0][3] == 5 && Cube_colors[5][6] == 5 && Cube_colors[5][7] == 1)
        {
            System.out.print("U U R R D B' U B' U' B D' R R F' U F U U");
        }
        else if(Cube_colors[2][8]  == 1 && Cube_colors[2][5] == 6 && Cube_colors[2][2] == 1 && Cube_colors[4][1] == 5 && Cube_colors[0][0] == 5 && Cube_colors[0][3] == 1)
        {
            System.out.print("U' R R D B' U B' U' B D' R R F' U F U U");
        }//*********************************************************************************************************************************************************************

        else if(Cube_colors[5][6]  == 5 && Cube_colors[5][7] == 1 && Cube_colors[5][8] == 5 && Cube_colors[2][5] == 3 && Cube_colors[4][2] == 3 && Cube_colors[4][1] == 5)
        {
            System.out.print("R R D B' U B' U' B D' R R F' U F U");
        }
        else if(Cube_colors[0][0]  == 5 && Cube_colors[0][3] == 1 && Cube_colors[0][6] == 5 && Cube_colors[5][7] == 3 && Cube_colors[2][8] == 3 && Cube_colors[2][5] == 6)
        {
            System.out.print("U R R D B' U B' U' B D' R R F' U F U");
        }
        else if(Cube_colors[4][2]  == 5 && Cube_colors[4][1] == 1 && Cube_colors[4][0] == 5 && Cube_colors[0][3] == 3 && Cube_colors[5][6] == 3 && Cube_colors[5][7] == 5)
        {
            System.out.print("U U R R D B' U B' U' B D' R R F' U F U");
        }
        else if(Cube_colors[2][8]  == 5 && Cube_colors[2][5] == 1 && Cube_colors[2][2] == 5 && Cube_colors[4][1] == 3 && Cube_colors[0][0] == 3 && Cube_colors[0][3] == 5)
        {
            System.out.print("U' R R D B' U B' U' B D' R R F' U F U");
        }//*********************************************************************************************************************************************************************

        //GD
        else if(Cube_colors[0][3] == 3 && Cube_colors[5][6] == 3 && Cube_colors[5][7] == 1 && Cube_colors[5][8] == 3 && Cube_colors[2][5] == 6 && Cube_colors[2][2] == 1)
        {
            System.out.print("R U R' F F D' L U' L' U L' D F F");
        }
        else if(Cube_colors[4][1] == 3 && Cube_colors[0][0] == 3 && Cube_colors[0][3] == 1 && Cube_colors[0][6] == 3 && Cube_colors[5][7] == 6 && Cube_colors[5][8] == 1)
        {
            System.out.print("U R U R' F F D' L U' L' U L' D F F");
        }
        else if(Cube_colors[2][5] == 3 && Cube_colors[4][2] == 3 && Cube_colors[4][1] == 1 && Cube_colors[4][0] == 3 && Cube_colors[0][3] == 6 && Cube_colors[0][6] == 1)
        {
            System.out.print("U U R U R' F F D' L U' L' U L' D F F");
        }
        else if(Cube_colors[5][7] == 3 && Cube_colors[2][8] == 3 && Cube_colors[2][5] == 1 && Cube_colors[2][2] == 3 && Cube_colors[4][1] == 6 && Cube_colors[4][0] == 1)
        {
            System.out.print("U' R U R' F F D' L U' L' U L' D F F");
        }//********************************************************************************************************************************************************************

        else if(Cube_colors[0][3] == 6 && Cube_colors[5][6] == 6 && Cube_colors[5][7] == 5 && Cube_colors[5][8] == 6 && Cube_colors[2][5] == 1 && Cube_colors[2][2] == 5)
        {
            System.out.print("R U R' F F D' L U' L' U L' D F F U'");
        }
        else if(Cube_colors[4][1] == 6 && Cube_colors[0][0] == 6 && Cube_colors[0][3] == 5 && Cube_colors[0][6] == 6 && Cube_colors[5][7] == 1 && Cube_colors[5][8] == 5)
        {
            System.out.print("U R U R' F F D' L U' L' U L' D F F U'");
        }
        else if(Cube_colors[2][5] == 6 && Cube_colors[4][2] == 6 && Cube_colors[4][1] == 5 && Cube_colors[4][0] == 6 && Cube_colors[0][3] == 1 && Cube_colors[0][6] == 5)
        {
            System.out.print("U U R U R' F F D' L U' L' U L' D F F U'");
        }
        else if(Cube_colors[5][7] == 6 && Cube_colors[2][8] == 6 && Cube_colors[2][5] == 5 && Cube_colors[2][2] == 6 && Cube_colors[4][1] == 1 && Cube_colors[4][0] == 5)
        {
            System.out.print("U' R U R' F F D' L U' L' U L' D F F U'");
        }//********************************************************************************************************************************************************************

        else if(Cube_colors[0][3] == 1 && Cube_colors[5][6] == 1 && Cube_colors[5][7] == 3 && Cube_colors[5][8] == 1 && Cube_colors[2][5] == 5 && Cube_colors[2][2] == 3)
        {
            System.out.print("R U R' F F D' L U' L' U L' D F F U U");
        }
        else if(Cube_colors[4][1] == 1 && Cube_colors[0][0] == 1 && Cube_colors[0][3] == 3 && Cube_colors[0][6] == 1 && Cube_colors[5][7] == 5 && Cube_colors[5][8] == 3)
        {
            System.out.print("U R U R' F F D' L U' L' U L' D F F U U");
        }
        else if(Cube_colors[2][5] == 1 && Cube_colors[4][2] == 1 && Cube_colors[4][1] == 3 && Cube_colors[4][0] == 1 && Cube_colors[0][3] == 5 && Cube_colors[0][6] == 3)
        {
            System.out.print("U U R U R' F F D' L U' L' U L' D F F U U");
        }
        else if(Cube_colors[5][7] == 1 && Cube_colors[2][8] == 1 && Cube_colors[2][5] == 3 && Cube_colors[2][2] == 1 && Cube_colors[4][1] == 5 && Cube_colors[4][0] == 3)
        {
            System.out.print("U' R U R' F F D' L U' L' U L' D F F U U");
        }//********************************************************************************************************************************************************************

        else if(Cube_colors[0][3] == 5 && Cube_colors[5][6] == 5 && Cube_colors[5][7] == 6 && Cube_colors[5][8] == 5 && Cube_colors[2][5] == 3 && Cube_colors[2][2] == 6)
        {
            System.out.print("R U R' F F D' L U' L' U L' D F F U");
        }
        else if(Cube_colors[4][1] == 5 && Cube_colors[0][0] == 5 && Cube_colors[0][3] == 6 && Cube_colors[0][6] == 5 && Cube_colors[5][7] == 3 && Cube_colors[5][8] == 6)
        {
            System.out.print("U R U R' F F D' L U' L' U L' D F F U");
        }
        else if(Cube_colors[2][5] == 5 && Cube_colors[4][2] == 5 && Cube_colors[4][1] == 6 && Cube_colors[4][0] == 5 && Cube_colors[0][3] == 3 && Cube_colors[0][6] == 6)
        {
            System.out.print("U U R U R' F F D' L U' L' U L' D F F U");
        }
        else if(Cube_colors[5][7] == 5 && Cube_colors[2][8] == 5 && Cube_colors[2][5] == 6 && Cube_colors[2][2] == 5 && Cube_colors[4][1] == 3 && Cube_colors[4][0] == 6)
        {
            System.out.print("U' R U R' F F D' L U' L' U L' D F F U");
        }//********************************************************************************************************************************************************************

        //GC
        else if(Cube_colors[4][1] == 1 && Cube_colors[4][0] == 6 && Cube_colors[0][3] == 6 && Cube_colors[5][6] == 1 && Cube_colors[5][7] == 5 && Cube_colors[5][8] == 1)
        {
            System.out.print("R R D' F U' F U F' D R R B U' B'");
        }
        else if(Cube_colors[2][5] == 1 && Cube_colors[2][2] == 6 && Cube_colors[4][1] == 6 && Cube_colors[0][0] == 1 && Cube_colors[0][3] == 5 && Cube_colors[0][6] == 1)
        {
            System.out.print("U R R D' F U' F U F' D R R B U' B'");
        }
        else if(Cube_colors[5][7] == 1 && Cube_colors[5][8] == 6 && Cube_colors[2][5] == 6 && Cube_colors[4][2] == 1 && Cube_colors[4][1] == 5 && Cube_colors[4][0] == 1)
        {
            System.out.print("U U R R D' F U' F U F' D R R B U' B'");
        }
        else if(Cube_colors[0][3] == 1 && Cube_colors[0][6] == 6 && Cube_colors[5][7] == 6 && Cube_colors[2][8] == 1 && Cube_colors[2][5] == 5 && Cube_colors[2][2] == 1)
        {
            System.out.print("U' R R D' F U' F U F' D R R B U' B'");
        }//*******************************************************************************************************************************************************************

        else if(Cube_colors[4][1] == 5 && Cube_colors[4][0] == 1 && Cube_colors[0][3] == 1 && Cube_colors[5][6] == 5 && Cube_colors[5][7] == 3 && Cube_colors[5][8] == 5)
        {
            System.out.print("R R D' F U' F U F' D R R B U' B' U'");
        }
        else if(Cube_colors[2][5] == 5 && Cube_colors[2][2] == 1 && Cube_colors[4][1] == 1 && Cube_colors[0][0] == 5 && Cube_colors[0][3] == 3 && Cube_colors[0][6] == 5)
        {
            System.out.print("U R R D' F U' F U F' D R R B U' B' U'");
        }
        else if(Cube_colors[5][7] == 5 && Cube_colors[5][8] == 1 && Cube_colors[2][5] == 1 && Cube_colors[4][2] == 5 && Cube_colors[4][1] == 3 && Cube_colors[4][0] == 5)
        {
            System.out.print("U U R R D' F U' F U F' D R R B U' B' U'");
        }
        else if(Cube_colors[0][3] == 5 && Cube_colors[0][6] == 1 && Cube_colors[5][7] == 1 && Cube_colors[2][8] == 5 && Cube_colors[2][5] == 3 && Cube_colors[2][2] == 5)
        {
            System.out.print("U' R R D' F U' F U F' D R R B U' B' U'");
        }//*******************************************************************************************************************************************************************

        else if(Cube_colors[4][1] == 3 && Cube_colors[4][0] == 5 && Cube_colors[0][3] == 5 && Cube_colors[5][6] == 3 && Cube_colors[5][7] == 6 && Cube_colors[5][8] == 3)
        {
            System.out.print("R R D' F U' F U F' D R R B U' B' U U");
        }
        else if(Cube_colors[2][5] == 3 && Cube_colors[2][2] == 5 && Cube_colors[4][1] == 5 && Cube_colors[0][0] == 3 && Cube_colors[0][3] == 6 && Cube_colors[0][6] == 3)
        {
            System.out.print("U R R D' F U' F U F' D R R B U' B' U U");
        }
        else if(Cube_colors[5][7] == 3 && Cube_colors[5][8] == 5 && Cube_colors[2][5] == 5 && Cube_colors[4][2] == 3 && Cube_colors[4][1] == 6 && Cube_colors[4][0] == 3)
        {
            System.out.print("U U R R D' F U' F U F' D R R B U' B' U U");
        }
        else if(Cube_colors[0][3] == 3 && Cube_colors[0][6] == 5 && Cube_colors[5][7] == 5 && Cube_colors[2][8] == 3 && Cube_colors[2][5] == 6 && Cube_colors[2][2] == 3)
        {
            System.out.print("U' R R D' F U' F U F' D R R B U' B' U U");
        }//*******************************************************************************************************************************************************************

        else if(Cube_colors[4][1] == 6 && Cube_colors[4][0] == 3 && Cube_colors[0][3] == 3 && Cube_colors[5][6] == 6 && Cube_colors[5][7] == 1 && Cube_colors[5][8] == 6)
        {
            System.out.print("R R D' F U' F U F' D R R B U' B' U");
        }
        else if(Cube_colors[2][5] == 6 && Cube_colors[2][2] == 3 && Cube_colors[4][1] == 3 && Cube_colors[0][0] == 6 && Cube_colors[0][3] == 1 && Cube_colors[0][6] == 6)
        {
            System.out.print("U R R D' F U' F U F' D R R B U' B' U");
        }
        else if(Cube_colors[5][7] == 6 && Cube_colors[5][8] == 3 && Cube_colors[2][5] == 3 && Cube_colors[4][2] == 6 && Cube_colors[4][1] == 1 && Cube_colors[4][0] == 6)
        {
            System.out.print("U U R R D' F U' F U F' D R R B U' B' U");
        }
        else if(Cube_colors[0][3] == 6 && Cube_colors[0][6] == 3 && Cube_colors[5][7] == 3 && Cube_colors[2][8] == 6 && Cube_colors[2][5] == 1 && Cube_colors[2][2] == 6)
        {
            System.out.print("U' R R D' F U' F U F' D R R B U' B' U");
        }//*******************************************************************************************************************************************************************

        //GB
        else if(Cube_colors[0][0] == 3 && Cube_colors[0][3] == 6 && Cube_colors[5][6] == 1 && Cube_colors[5][7] == 3 && Cube_colors[5][8] == 1 && Cube_colors[2][5] == 1)
        {
            System.out.print("R' U' R U D' R R U R' U R U' R U' R R D U'");
        }
        else if(Cube_colors[4][2] == 3 && Cube_colors[4][1] == 6 && Cube_colors[0][0] == 1 && Cube_colors[0][3] == 3 && Cube_colors[0][6] == 1 && Cube_colors[5][7] == 1)
        {
            System.out.print("U R' U' R U D' R R U R' U R U' R U' R R D U'");
        }
        else if(Cube_colors[2][8] == 3 && Cube_colors[2][5] == 6 && Cube_colors[4][2] == 1 && Cube_colors[4][1] == 3 && Cube_colors[4][0] == 1 && Cube_colors[0][3] == 1)
        {
            System.out.print("U U R' U' R U D' R R U R' U R U' R U' R R D U'");
        }
        else if(Cube_colors[5][6] == 3 && Cube_colors[5][7] == 6 && Cube_colors[2][8] == 1 && Cube_colors[2][5] == 3 && Cube_colors[2][2] == 1 && Cube_colors[4][1] == 1)
        {
            System.out.print("U' R' U' R U D' R R U R' U R U' R U' R R D U'");
        }//********************************************************************************************************************************************************************

        else if(Cube_colors[0][0] == 6 && Cube_colors[0][3] == 1 && Cube_colors[5][6] == 5 && Cube_colors[5][7] == 6 && Cube_colors[5][8] == 5 && Cube_colors[2][5] == 5)
        {
            System.out.print("R' U' R U D' R R U R' U R U' R U' R R D U' U'");
        }
        else if(Cube_colors[4][2] == 6 && Cube_colors[4][1] == 1 && Cube_colors[0][0] == 5 && Cube_colors[0][3] == 6 && Cube_colors[0][6] == 5 && Cube_colors[5][7] == 5)
        {
            System.out.print("U R' U' R U D' R R U R' U R U' R U' R R D U' U'");
        }
        else if(Cube_colors[2][8] == 6 && Cube_colors[2][5] == 1 && Cube_colors[4][2] == 5 && Cube_colors[4][1] == 6 && Cube_colors[4][0] == 5 && Cube_colors[0][3] == 5)
        {
            System.out.print("U U R' U' R U D' R R U R' U R U' R U' R R D U' U'");
        }
        else if(Cube_colors[5][6] == 6 && Cube_colors[5][7] == 1 && Cube_colors[2][8] == 5 && Cube_colors[2][5] == 6 && Cube_colors[2][2] == 5 && Cube_colors[4][1] == 5)
        {
            System.out.print("U' R' U' R U D' R R U R' U R U' R U' R R D U' U'");
        }//********************************************************************************************************************************************************************

        else if(Cube_colors[0][0] == 1 && Cube_colors[0][3] == 5 && Cube_colors[5][6] == 3 && Cube_colors[5][7] == 1 && Cube_colors[5][8] == 3 && Cube_colors[2][5] == 3)
        {
            System.out.print("R' U' R U D' R R U R' U R U' R U' R R D U");
        }
        else if(Cube_colors[4][2] == 1 && Cube_colors[4][1] == 5 && Cube_colors[0][0] == 3 && Cube_colors[0][3] == 1 && Cube_colors[0][6] == 3 && Cube_colors[5][7] == 3)
        {
            System.out.print("U R' U' R U D' R R U R' U R U' R U' R R D U");
        }
        else if(Cube_colors[2][8] == 1 && Cube_colors[2][5] == 5 && Cube_colors[4][2] == 3 && Cube_colors[4][1] == 1 && Cube_colors[4][0] == 3 && Cube_colors[0][3] == 3)
        {
            System.out.print("U U R' U' R U D' R R U R' U R U' R U' R R D U");
        }
        else if(Cube_colors[5][6] == 1 && Cube_colors[5][7] == 5 && Cube_colors[2][8] == 3 && Cube_colors[2][5] == 1 && Cube_colors[2][2] == 3 && Cube_colors[4][1] == 3)
        {
            System.out.print("U' R' U' R U D' R R U R' U R U' R U' R R D U");
        }//********************************************************************************************************************************************************************

        else if(Cube_colors[0][0] == 5 && Cube_colors[0][3] == 3 && Cube_colors[5][6] == 6 && Cube_colors[5][7] == 5 && Cube_colors[5][8] == 6 && Cube_colors[2][5] == 6)
        {
            System.out.print("R' U' R U D' R R U R' U R U' R U' R R D");
        }
        else if(Cube_colors[4][2] == 5 && Cube_colors[4][1] == 3 && Cube_colors[0][0] == 6 && Cube_colors[0][3] == 5 && Cube_colors[0][6] == 6 && Cube_colors[5][7] == 6)
        {
            System.out.print("U R' U' R U D' R R U R' U R U' R U' R R D");
        }
        else if(Cube_colors[2][8] == 5 && Cube_colors[2][5] == 3 && Cube_colors[4][2] == 6 && Cube_colors[4][1] == 5 && Cube_colors[4][0] == 6 && Cube_colors[0][3] == 6)
        {
            System.out.print("U U R' U' R U D' R R U R' U R U' R U' R R D");
        }
        else if(Cube_colors[5][6] == 5 && Cube_colors[5][7] == 3 && Cube_colors[2][8] == 6 && Cube_colors[2][5] == 5 && Cube_colors[2][2] == 6 && Cube_colors[4][1] == 6)
        {
            System.out.print("U' R' U' R U D' R R U R' U R U' R U' R R D");
        }//********************************************************************************************************************************************************************

        //UB
        else if(Cube_colors[5][7] == 5 && Cube_colors[0][3] == 6 && Cube_colors[4][1] == 1 && Cube_colors[2][2] == 3 && Cube_colors[2][5] == 3 && Cube_colors[2][8] == 3)
        {
            System.out.print("R R U R U R' U' R' U' R' U R'");
        }
        else if(Cube_colors[0][3] == 5 && Cube_colors[4][1] == 6 && Cube_colors[2][5] == 1 && Cube_colors[5][8] == 3 && Cube_colors[5][7] == 3 && Cube_colors[5][6] == 3)
        {
            System.out.print("U R R U R U R' U' R' U' R' U R'");
        }
        else if(Cube_colors[4][1] == 5 && Cube_colors[2][5] == 6 && Cube_colors[5][7] == 1 && Cube_colors[0][6] == 3 && Cube_colors[0][3] == 3 && Cube_colors[0][0] == 3)
        {
            System.out.print("U U R R U R U R' U' R' U' R' U R'");
        }
        else if(Cube_colors[2][5] == 5 && Cube_colors[5][7] == 6 && Cube_colors[0][3] == 1 && Cube_colors[4][0] == 3 && Cube_colors[4][1] == 3 && Cube_colors[4][2] == 3)
        {
            System.out.print("U' R R U R U R' U' R' U' R' U R'");
        }//*********************************************************************************************************

        else if(Cube_colors[5][7] == 3 && Cube_colors[0][3] == 1 && Cube_colors[4][1] == 5 && Cube_colors[2][2] == 6 && Cube_colors[2][5] == 6 && Cube_colors[2][8] == 6)
        {
            System.out.print("R R U R U R' U' R' U' R' U R' U'");
        }
        else if(Cube_colors[0][3] == 3 && Cube_colors[4][1] == 1 && Cube_colors[2][5] == 5 && Cube_colors[5][8] == 6 && Cube_colors[5][7] == 6 && Cube_colors[5][6] == 6)
        {
            System.out.print("U R R U R U R' U' R' U' R' U R' U'");
        }
        else if(Cube_colors[4][1] == 3 && Cube_colors[2][5] == 1 && Cube_colors[5][7] == 5 && Cube_colors[0][6] == 6 && Cube_colors[0][3] == 6 && Cube_colors[0][0] == 6)
        {
            System.out.print("U U R R U R U R' U' R' U' R' U R' U'");
        }
        else if(Cube_colors[2][5] == 3 && Cube_colors[5][7] == 1 && Cube_colors[0][3] == 5 && Cube_colors[4][0] == 6 && Cube_colors[4][1] == 6 && Cube_colors[4][2] == 6)
        {
            System.out.print("U' R R U R U R' U' R' U' R' U R' U'");
        }//***************************************************************************************************************

        else if(Cube_colors[5][7] == 6 && Cube_colors[0][3] == 5 && Cube_colors[4][1] == 3 && Cube_colors[2][2] == 1 && Cube_colors[2][5] == 1 && Cube_colors[2][8] == 1)
        {
            System.out.print("R R U R U R' U' R' U' R' U R' U U");
        }
        else if(Cube_colors[0][3] == 6 && Cube_colors[4][1] == 5 && Cube_colors[2][5] == 3 && Cube_colors[5][8] == 1 && Cube_colors[5][7] == 1 && Cube_colors[5][6] == 1)
        {
            System.out.print("U R R U R U R' U' R' U' R' U R' U U");
        }
        else if(Cube_colors[4][1] == 6 && Cube_colors[2][5] == 5 && Cube_colors[5][7] == 3 && Cube_colors[0][6] == 1 && Cube_colors[0][3] == 1 && Cube_colors[0][0] == 1)
        {
            System.out.print("U U R R U R U R' U' R' U' R' U R' U U");
        }
        else if(Cube_colors[2][5] == 6 && Cube_colors[5][7] == 5 && Cube_colors[0][3] == 3 && Cube_colors[4][0] == 1 && Cube_colors[4][1] == 1 && Cube_colors[4][2] == 1)
        {
            System.out.print("U' R R U R U R' U' R' U' R' U R' U U");
        }//******************************************************************************************************************

        else if(Cube_colors[5][7] == 1 && Cube_colors[0][3] == 3 && Cube_colors[4][1] == 6 && Cube_colors[2][2] == 5 && Cube_colors[2][5] == 5 && Cube_colors[2][8] == 5)
        {
            System.out.print("R R U R U R' U' R' U' R' U R' U");
        }
        else if(Cube_colors[0][3] == 1 && Cube_colors[4][1] == 3 && Cube_colors[2][5] == 6 && Cube_colors[5][8] == 5 && Cube_colors[5][7] == 5 && Cube_colors[5][6] == 5)
        {
            System.out.print("U R R U R U R' U' R' U' R' U R' U");
        }
        else if(Cube_colors[4][1] == 1 && Cube_colors[2][5] == 3 && Cube_colors[5][7] == 6 && Cube_colors[0][6] == 5 && Cube_colors[0][3] == 5 && Cube_colors[0][0] == 5)
        {
            System.out.print("U U R R U R U R' U' R' U' R' U R' U");
        }
        else if(Cube_colors[2][5] == 1 && Cube_colors[5][7] == 3 && Cube_colors[0][3] == 6 && Cube_colors[4][0] == 5 && Cube_colors[4][1] == 5 && Cube_colors[4][2] == 5)
        {
            System.out.print("U' R R U R U R' U' R' U' R' U R' U");
        }//***********************************************************************************************************

        //UA
        else if(Cube_colors[5][7] == 1 && Cube_colors[0][3] == 5 && Cube_colors[4][1] == 6 && Cube_colors[2][2] == 3 && Cube_colors[2][5] == 3 && Cube_colors[2][8] == 3)
        {
            System.out.print("R U' R U R U R U' R' U' R R");
        }
        else if(Cube_colors[0][3] == 1 && Cube_colors[4][1] == 5 && Cube_colors[2][5] == 6 && Cube_colors[5][8] == 3 && Cube_colors[5][7] == 3 && Cube_colors[5][6] == 3)
        {
            System.out.print("U R U' R U R U R U' R' U' R R");
        }
        else if(Cube_colors[4][1] == 1 && Cube_colors[2][5] == 5 && Cube_colors[5][7] == 6 && Cube_colors[0][6] == 3 && Cube_colors[0][3] == 3 && Cube_colors[0][0] == 3)
        {
            System.out.print("U U R U' R U R U R U' R' U' R R");
        }
        else if(Cube_colors[2][5] == 1 && Cube_colors[5][7] == 5 && Cube_colors[0][3] == 6 && Cube_colors[4][0] == 3 && Cube_colors[4][1] == 3 && Cube_colors[4][2] == 3)
        {
            System.out.print("U' R U' R U R U R U' R' U' R R");
        }//*******************************************************************************************************

        else if(Cube_colors[5][7] == 5 && Cube_colors[0][3] == 3 && Cube_colors[4][1] == 1 && Cube_colors[2][2] == 6 && Cube_colors[2][5] == 6 && Cube_colors[2][8] == 6)
        {
            System.out.print("R U' R U R U R U' R' U' R R U'");
        }
        else if(Cube_colors[0][3] == 5 && Cube_colors[4][1] == 3 && Cube_colors[2][5] == 1 && Cube_colors[5][8] == 6 && Cube_colors[5][7] == 6 && Cube_colors[5][6] == 6)
        {
            System.out.print("U R U' R U R U R U' R' U' R R U'");
        }
        else if(Cube_colors[4][1] == 5 && Cube_colors[2][5] == 3 && Cube_colors[5][7] == 1 && Cube_colors[0][6] == 6 && Cube_colors[0][3] == 6 && Cube_colors[0][0] == 6)
        {
            System.out.print("U U R U' R U R U R U' R' U' R R U'");
        }
        else if(Cube_colors[2][5] == 5 && Cube_colors[5][7] == 3 && Cube_colors[0][3] == 1 && Cube_colors[4][0] == 6 && Cube_colors[4][1] == 6 && Cube_colors[4][2] == 6)
        {
            System.out.print("U' R U' R U R U R U' R' U' R R U'");
        }//*******************************************************************************************************

        else if(Cube_colors[5][7] == 3 && Cube_colors[0][3] == 6 && Cube_colors[4][1] == 5 && Cube_colors[2][2] == 1 && Cube_colors[2][5] == 1 && Cube_colors[2][8] == 1)
        {
            System.out.print("R U' R U R U R U' R' U' R R U U");
        }
        else if(Cube_colors[0][3] == 3 && Cube_colors[4][1] == 6 && Cube_colors[2][5] == 5 && Cube_colors[5][8] == 1 && Cube_colors[5][7] == 1 && Cube_colors[5][6] == 1)
        {
            System.out.print("U R U' R U R U R U' R' U' R R U U");
        }
        else if(Cube_colors[4][1] == 3 && Cube_colors[2][5] == 6 && Cube_colors[5][7] == 5 && Cube_colors[0][6] == 1 && Cube_colors[0][3] == 1 && Cube_colors[0][0] == 1)
        {
            System.out.print("U U R U' R U R U R U' R' U' R R U U");
        }
        else if(Cube_colors[2][5] == 3 && Cube_colors[5][7] == 6 && Cube_colors[0][3] == 5 && Cube_colors[4][0] == 1 && Cube_colors[4][1] == 1 && Cube_colors[4][2] == 1)
        {
            System.out.print("U' R U' R U R U R U' R' U' R R U U");
        }//*******************************************************************************************************

        else if(Cube_colors[5][7] == 6 && Cube_colors[0][3] == 1 && Cube_colors[4][1] == 3 && Cube_colors[2][2] == 5 && Cube_colors[2][5] == 5 && Cube_colors[2][8] == 5)
        {
            System.out.print("R U' R U R U R U' R' U' R R U");
        }
        else if(Cube_colors[0][3] == 6 && Cube_colors[4][1] == 1 && Cube_colors[2][5] == 3 && Cube_colors[5][8] == 5 && Cube_colors[5][7] == 5 && Cube_colors[5][6] == 5)
        {
            System.out.print("U R U' R U R U R U' R' U' R R U");
        }
        else if(Cube_colors[4][1] == 6 && Cube_colors[2][5] == 1 && Cube_colors[5][7] == 3 && Cube_colors[0][6] == 5 && Cube_colors[0][3] == 5 && Cube_colors[0][0] == 5)
        {
            System.out.print("U U R U' R U R U R U' R' U' R R U");
        }
        else if(Cube_colors[2][5] == 6 && Cube_colors[5][7] == 1 && Cube_colors[0][3] == 3 && Cube_colors[4][0] == 5 && Cube_colors[4][1] == 5 && Cube_colors[4][2] == 5)
        {
            System.out.print("U' R U' R U R U R U' R' U' R R U");
        }//*******************************************************************************************************

        //Z
        else if(Cube_colors[0][3] == 6 && Cube_colors[5][7] == 1 && Cube_colors[4][1] == 3 && Cube_colors[2][5] == 5 && Cube_colors[0][0] == 1 && Cube_colors[4][2] == 5 && Cube_colors[2][8] == 3 && Cube_colors[5][6] == 6)
        {
            System.out.print("R' U' R U' R U R U' R' U R U R R U' R' U U");
        }
        else if(Cube_colors[0][3] == 1 && Cube_colors[5][7] == 5 && Cube_colors[4][1] == 6 && Cube_colors[2][5] == 3 && Cube_colors[4][2] == 1 && Cube_colors[2][8] == 5 && Cube_colors[5][6] == 3 && Cube_colors[0][0] == 6)
        {
            System.out.print("U R' U' R U' R U R U' R' U R U R R U' R' U U");
        }
        else if(Cube_colors[0][3] == 5 && Cube_colors[5][7] == 3 && Cube_colors[4][1] == 1 && Cube_colors[2][5] == 6 && Cube_colors[2][8] == 1 && Cube_colors[5][6] == 5 && Cube_colors[0][0] == 3 && Cube_colors[4][2] == 6)
        {
            System.out.print("U U R' U' R U' R U R U' R' U R U R R U' R' U U");
        }
        else if(Cube_colors[0][3] == 3 && Cube_colors[5][7] == 6 && Cube_colors[4][1] == 5 && Cube_colors[2][5] == 1 && Cube_colors[5][6] == 1 && Cube_colors[0][0] == 5 && Cube_colors[4][2] == 3 && Cube_colors[2][8] == 6)
        {
            System.out.print("U' R' U' R U' R U R U' R' U R U R R U' R' U U");
        }//********************************************************************************************************************

        else if(Cube_colors[0][3] == 1 && Cube_colors[5][7] == 5 && Cube_colors[4][1] == 6 && Cube_colors[2][5] == 3 && Cube_colors[0][0] == 5 && Cube_colors[4][2] == 3 && Cube_colors[2][8] == 6 && Cube_colors[5][6] == 1)
        {
            System.out.print("R' U' R U' R U R U' R' U R U R R U' R' U");
        }
        else if(Cube_colors[0][3] == 5 && Cube_colors[5][7] == 3 && Cube_colors[4][1] == 1 && Cube_colors[2][5] == 6 && Cube_colors[4][2] == 5 && Cube_colors[2][8] == 3 && Cube_colors[5][6] == 6 && Cube_colors[0][0] == 1)
        {
            System.out.print("U R' U' R U' R U R U' R' U R U R R U' R' U");
        }
        else if(Cube_colors[0][3] == 3 && Cube_colors[5][7] == 6 && Cube_colors[4][1] == 5 && Cube_colors[2][5] == 1 && Cube_colors[2][8] == 5 && Cube_colors[5][6] == 3 && Cube_colors[0][0] == 6 && Cube_colors[4][2] == 1)
        {
            System.out.print("U U R' U' R U' R U R U' R' U R U R R U' R' U");
        }
        else if(Cube_colors[0][3] == 6 && Cube_colors[5][7] == 1 && Cube_colors[4][1] == 3 && Cube_colors[2][5] == 5 && Cube_colors[5][6] == 5 && Cube_colors[0][0] == 3 && Cube_colors[4][2] == 6 && Cube_colors[2][8] == 1)
        {
            System.out.print("U' R' U' R U' R U R U' R' U R U R R U' R' U");
        }//********************************************************************************************************************

        //H
        else if(Cube_colors[0][3] == 3 && Cube_colors[2][5] == 1 && Cube_colors[4][1] == 6 && Cube_colors[5][7] == 5 && Cube_colors[0][0] == 1)
        {
            System.out.print("R R L L D R R L L D D R R L L D R R L L U U D D");
        }
        else if(Cube_colors[0][3] == 5 && Cube_colors[2][5] == 6 && Cube_colors[4][1] == 3 && Cube_colors[5][7] == 1 && Cube_colors[0][0] == 6)
        {
            System.out.print("U R R L L D R R L L D D R R L L D R R L L U U D D");
        }
        else if(Cube_colors[0][3] == 1 && Cube_colors[2][5] == 3 && Cube_colors[4][1] == 5 && Cube_colors[5][7] == 6 && Cube_colors[0][0] == 3)
        {
            System.out.print("R R L L D R R L L D D R R L L D R R L L D D");
        }
        else if(Cube_colors[0][3] == 6 && Cube_colors[2][5] == 5 && Cube_colors[4][1] == 1 && Cube_colors[5][7] == 3 && Cube_colors[0][0] == 5)
        {
            System.out.print("U' R R L L D R R L L D D R R L L D R R L L U U D D");
        }//**********************************************************************************************************************

        //AA
        else if(Cube_colors[0][0] == 3 && Cube_colors[4][0] == 6 && Cube_colors[4][2] == 1 && Cube_colors[2][2] == 5 && Cube_colors[2][8] == 5 && Cube_colors[5][8] ==3 && Cube_colors[5][7] == 6 && Cube_colors[5][6] == 6 && Cube_colors[0][6] == 1 && Cube_colors[0][3] == 1)
        {
            System.out.print("R' F R' B B R F' R' B B R R");
        }
        else if(Cube_colors[4][2] == 3 && Cube_colors[2][2] == 6 && Cube_colors[2][8] == 1 && Cube_colors[5][8] == 5 && Cube_colors[5][6] == 5 && Cube_colors[0][6] ==3 && Cube_colors[0][3] == 6 && Cube_colors[0][0] == 6 && Cube_colors[4][0] == 1 && Cube_colors[4][1] == 1)
        {
            System.out.print("U R' F R' B B R F' R' B B R R");
        }
        else if(Cube_colors[2][8] == 3 && Cube_colors[5][8] == 6 && Cube_colors[5][6] == 1 && Cube_colors[0][6] == 5 && Cube_colors[0][0] == 5 && Cube_colors[4][0] ==3 && Cube_colors[4][1] == 6 && Cube_colors[4][2] == 6 && Cube_colors[2][2] == 1 && Cube_colors[2][5] == 1)
        {
            System.out.print("U U R' F R' B B R F' R' B B R R");
        }
        else if(Cube_colors[5][6] == 3 && Cube_colors[0][6] == 6 && Cube_colors[0][0] == 1 && Cube_colors[4][0] == 5 && Cube_colors[4][2] == 5 && Cube_colors[2][2] ==3 && Cube_colors[2][5] == 6 && Cube_colors[2][8] == 6 && Cube_colors[5][8] == 1 && Cube_colors[5][7] == 1)
        {
            System.out.print("U' R' F R' B B R F' R' B B R R");
        }//******************************************************************************************************************************************************************

        else if(Cube_colors[0][0] == 6 && Cube_colors[4][0] == 1 && Cube_colors[4][2] == 5 && Cube_colors[2][2] == 3 && Cube_colors[2][8] == 3 && Cube_colors[5][8] ==6 && Cube_colors[5][7] == 1 && Cube_colors[5][6] == 1 && Cube_colors[0][6] == 5 && Cube_colors[0][3] == 5)
        {
            System.out.print("R' F R' B B R F' R' B B R R U'");
        }
        else if(Cube_colors[4][2] == 6 && Cube_colors[2][2] == 1 && Cube_colors[2][8] == 5 && Cube_colors[5][8] == 3 && Cube_colors[5][6] == 3 && Cube_colors[0][6] ==6 && Cube_colors[0][3] == 1 && Cube_colors[0][0] == 1 && Cube_colors[4][0] == 5 && Cube_colors[4][1] == 5)
        {
            System.out.print("U R' F R' B B R F' R' B B R R U'");
        }
        else if(Cube_colors[2][8] == 6 && Cube_colors[5][8] == 1 && Cube_colors[5][6] == 5 && Cube_colors[0][6] == 3 && Cube_colors[0][0] == 3 && Cube_colors[4][0] ==6 && Cube_colors[4][1] == 1 && Cube_colors[4][2] == 1 && Cube_colors[2][2] == 5 && Cube_colors[2][5] == 5)
        {
            System.out.print("U U R' F R' B B R F' R' B B R R U'");
        }
        else if(Cube_colors[5][6] == 6 && Cube_colors[0][6] == 1 && Cube_colors[0][0] == 5 && Cube_colors[4][0] == 3 && Cube_colors[4][2] == 3 && Cube_colors[2][2] ==6 && Cube_colors[2][5] == 1 && Cube_colors[2][8] == 1 && Cube_colors[5][8] == 5 && Cube_colors[5][7] == 5)
        {
            System.out.print("U' R' F R' B B R F' R' B B R R U'");
        }//******************************************************************************************************************************************************************

        else if(Cube_colors[0][0] == 1 && Cube_colors[4][0] == 5 && Cube_colors[4][2] == 3 && Cube_colors[2][2] == 6 && Cube_colors[2][8] == 6 && Cube_colors[5][8] ==1 && Cube_colors[5][7] == 5 && Cube_colors[5][6] == 5 && Cube_colors[0][6] == 3 && Cube_colors[0][3] == 3)
        {
            System.out.print("R' F R' B B R F' R' B B R R U U");
        }
        else if(Cube_colors[4][2] == 1 && Cube_colors[2][2] == 5 && Cube_colors[2][8] == 3 && Cube_colors[5][8] == 6 && Cube_colors[5][6] == 6 && Cube_colors[0][6] ==1 && Cube_colors[0][3] == 5 && Cube_colors[0][0] == 5 && Cube_colors[4][0] == 3 && Cube_colors[4][1] == 3)
        {
            System.out.print("U R' F R' B B R F' R' B B R R U U");
        }
        else if(Cube_colors[2][8] == 1 && Cube_colors[5][8] == 5 && Cube_colors[5][6] == 3 && Cube_colors[0][6] == 6 && Cube_colors[0][0] == 6 && Cube_colors[4][0] ==1 && Cube_colors[4][1] == 5 && Cube_colors[4][2] == 5 && Cube_colors[2][2] == 3 && Cube_colors[2][5] == 3)
        {
            System.out.print("U U R' F R' B B R F' R' B B R R U U");
        }
        else if(Cube_colors[5][6] == 1 && Cube_colors[0][6] == 5 && Cube_colors[0][0] == 3 && Cube_colors[4][0] == 6 && Cube_colors[4][2] == 6 && Cube_colors[2][2] ==1 && Cube_colors[2][5] == 5 && Cube_colors[2][8] == 5 && Cube_colors[5][8] == 3 && Cube_colors[5][7] == 3)
        {
            System.out.print("U' R' F R' B B R F' R' B B R R U U");
        }//******************************************************************************************************************************************************************

        else if(Cube_colors[0][0] == 5 && Cube_colors[4][0] == 3 && Cube_colors[4][2] == 6 && Cube_colors[2][2] == 1 && Cube_colors[2][8] == 1 && Cube_colors[5][8] ==5 && Cube_colors[5][7] == 3 && Cube_colors[5][6] == 3 && Cube_colors[0][6] == 6 && Cube_colors[0][3] == 6)
        {
            System.out.print("R' F R' B B R F' R' B B R R U");
        }
        else if(Cube_colors[4][2] == 5 && Cube_colors[2][2] == 3 && Cube_colors[2][8] == 6 && Cube_colors[5][8] == 1 && Cube_colors[5][6] == 1 && Cube_colors[0][6] ==5 && Cube_colors[0][3] == 3 && Cube_colors[0][0] == 3 && Cube_colors[4][0] == 6 && Cube_colors[4][1] == 6)
        {
            System.out.print("U R' F R' B B R F' R' B B R R U");
        }
        else if(Cube_colors[2][8] == 5 && Cube_colors[5][8] == 3 && Cube_colors[5][6] == 6 && Cube_colors[0][6] == 1 && Cube_colors[0][0] == 1 && Cube_colors[4][0] ==5 && Cube_colors[4][1] == 3 && Cube_colors[4][2] == 3 && Cube_colors[2][2] == 6 && Cube_colors[2][5] == 6)
        {
            System.out.print("U U R' F R' B B R F' R' B B R R U");
        }
        else if(Cube_colors[5][6] == 5 && Cube_colors[0][6] == 3 && Cube_colors[0][0] == 6 && Cube_colors[4][0] == 1 && Cube_colors[4][2] == 1 && Cube_colors[2][2] ==5 && Cube_colors[2][5] == 3 && Cube_colors[2][8] == 3 && Cube_colors[5][8] == 6 && Cube_colors[5][7] == 6)
        {
            System.out.print("U' R' F R' B B R F' R' B B R R U");
        }//******************************************************************************************************************************************************************

        //AB
        else if(Cube_colors[0][0] == 5 && Cube_colors[4][0] == 3 && Cube_colors[4][2] == 3 && Cube_colors[2][2] == 6 && Cube_colors[2][8] == 1 && Cube_colors[5][8] ==5 && Cube_colors[5][7] == 6 && Cube_colors[5][6] == 6 && Cube_colors[0][6] == 1 && Cube_colors[0][3] == 1)
        {
            System.out.print("R' R' B B R F R' B B R F' R");
        }
        else if(Cube_colors[4][2] == 5 && Cube_colors[2][2] == 3 && Cube_colors[2][8] == 3 && Cube_colors[5][8] == 6 && Cube_colors[5][6] == 1 && Cube_colors[0][6] ==5 && Cube_colors[0][3] == 6 && Cube_colors[0][0] == 6 && Cube_colors[4][0] == 1 && Cube_colors[4][1] == 1)
        {
            System.out.print("U R' R' B B R F R' B B R F' R");
        }
        else if(Cube_colors[2][8] == 5 && Cube_colors[5][8] == 3 && Cube_colors[5][6] == 3 && Cube_colors[0][6] == 6 && Cube_colors[0][0] == 1 && Cube_colors[4][0] ==5 && Cube_colors[4][1] == 6 && Cube_colors[4][2] == 6 && Cube_colors[2][2] == 1 && Cube_colors[2][5] == 1)
        {
            System.out.print("U U R' R' B B R F R' B B R F' R");
        }
        else if(Cube_colors[5][6] == 5 && Cube_colors[0][6] == 3 && Cube_colors[0][0] == 3 && Cube_colors[4][0] == 6 && Cube_colors[4][2] == 1 && Cube_colors[2][2] ==5 && Cube_colors[2][5] == 6 && Cube_colors[2][8] == 6 && Cube_colors[5][8] == 1 && Cube_colors[5][7] == 1)
        {
            System.out.print("U' R' R' B B R F R' B B R F' R");
        }//******************************************************************************************************************************************************************

        else if(Cube_colors[0][0] == 3 && Cube_colors[4][0] == 6 && Cube_colors[4][2] == 6 && Cube_colors[2][2] == 1 && Cube_colors[2][8] == 5 && Cube_colors[5][8] ==3 && Cube_colors[5][7] == 1 && Cube_colors[5][6] == 1 && Cube_colors[0][6] == 5 && Cube_colors[0][3] == 5)
        {
            System.out.print("R' R' B B R F R' B B R F' R U'");
        }
        else if(Cube_colors[4][2] == 3 && Cube_colors[2][2] == 6 && Cube_colors[2][8] == 6 && Cube_colors[5][8] == 1 && Cube_colors[5][6] == 5 && Cube_colors[0][6] ==3 && Cube_colors[0][3] == 1 && Cube_colors[0][0] == 1 && Cube_colors[4][0] == 5 && Cube_colors[4][1] == 5)
        {
            System.out.print("U R' R' B B R F R' B B R F' R U'");
        }
        else if(Cube_colors[2][8] == 3 && Cube_colors[5][8] == 6 && Cube_colors[5][6] == 6 && Cube_colors[0][6] == 1 && Cube_colors[0][0] == 5 && Cube_colors[4][0] ==3 && Cube_colors[4][1] == 1 && Cube_colors[4][2] == 1 && Cube_colors[2][2] == 5 && Cube_colors[2][5] == 5)
        {
            System.out.print("U U R' R' B B R F R' B B R F' R U'");
        }
        else if(Cube_colors[5][6] == 3 && Cube_colors[0][6] == 6 && Cube_colors[0][0] == 6 && Cube_colors[4][0] == 1 && Cube_colors[4][2] == 5 && Cube_colors[2][2] ==3 && Cube_colors[2][5] == 1 && Cube_colors[2][8] == 1 && Cube_colors[5][8] == 5 && Cube_colors[5][7] == 5)
        {
            System.out.print("U' R' R' B B R F R' B B R F' R U'");
        }//******************************************************************************************************************************************************************

        else if(Cube_colors[0][0] == 6 && Cube_colors[4][0] == 1 && Cube_colors[4][2] == 1 && Cube_colors[2][2] == 5 && Cube_colors[2][8] == 3 && Cube_colors[5][8] ==6 && Cube_colors[5][7] == 5 && Cube_colors[5][6] == 5 && Cube_colors[0][6] == 3 && Cube_colors[0][3] == 3)
        {
            System.out.print("R' R' B B R F R' B B R F' R U U");
        }
        else if(Cube_colors[4][2] == 6 && Cube_colors[2][2] == 1 && Cube_colors[2][8] == 1 && Cube_colors[5][8] == 5 && Cube_colors[5][6] == 3 && Cube_colors[0][6] ==6 && Cube_colors[0][3] == 5 && Cube_colors[0][0] == 5 && Cube_colors[4][0] == 3 && Cube_colors[4][1] == 3)
        {
            System.out.print("U R' R' B B R F R' B B R F' R U U");
        }
        else if(Cube_colors[2][8] == 6 && Cube_colors[5][8] == 1 && Cube_colors[5][6] == 1 && Cube_colors[0][6] == 5 && Cube_colors[0][0] == 3 && Cube_colors[4][0] ==6 && Cube_colors[4][1] == 5 && Cube_colors[4][2] == 5 && Cube_colors[2][2] == 3 && Cube_colors[2][5] == 3)
        {
            System.out.print("U U R' R' B B R F R' B B R F' R U U");
        }
        else if(Cube_colors[5][6] == 6 && Cube_colors[0][6] == 1 && Cube_colors[0][0] == 1 && Cube_colors[4][0] == 5 && Cube_colors[4][2] == 3 && Cube_colors[2][2] ==6 && Cube_colors[2][5] == 5 && Cube_colors[2][8] == 5 && Cube_colors[5][8] == 3 && Cube_colors[5][7] == 3)
        {
            System.out.print("U' R' R' B B R F R' B B R F' R U U");
        }//******************************************************************************************************************************************************************

        else if(Cube_colors[0][0] == 1 && Cube_colors[4][0] == 5 && Cube_colors[4][2] == 5 && Cube_colors[2][2] == 3 && Cube_colors[2][8] == 6 && Cube_colors[5][8] ==1 && Cube_colors[5][7] == 3 && Cube_colors[5][6] == 3 && Cube_colors[0][6] == 6 && Cube_colors[0][3] == 6)
        {
            System.out.print("R' R' B B R F R' B B R F' R U");
        }
        else if(Cube_colors[4][2] == 1 && Cube_colors[2][2] == 5 && Cube_colors[2][8] == 5 && Cube_colors[5][8] == 3 && Cube_colors[5][6] == 6 && Cube_colors[0][6] ==1 && Cube_colors[0][3] == 3 && Cube_colors[0][0] == 3 && Cube_colors[4][0] == 6 && Cube_colors[4][1] == 6)
        {
            System.out.print("U R' R' B B R F R' B B R F' R U");
        }
        else if(Cube_colors[2][8] == 1 && Cube_colors[5][8] == 5 && Cube_colors[5][6] == 5 && Cube_colors[0][6] == 3 && Cube_colors[0][0] == 6 && Cube_colors[4][0] ==1 && Cube_colors[4][1] == 3 && Cube_colors[4][2] == 3 && Cube_colors[2][2] == 6 && Cube_colors[2][5] == 6)
        {
            System.out.print("U U R' R' B B R F R' B B R F' R U");
        }
        else if(Cube_colors[5][6] == 1 && Cube_colors[0][6] == 5 && Cube_colors[0][0] == 5 && Cube_colors[4][0] == 3 && Cube_colors[4][2] == 6 && Cube_colors[2][2] ==1 && Cube_colors[2][5] == 3 && Cube_colors[2][8] == 3 && Cube_colors[5][8] == 6 && Cube_colors[5][7] == 6)
        {
            System.out.print("U' R' R' B B R F R' B B R F' R U ");
        }//******************************************************************************************************************************************************************

        //E
        else if(Cube_colors[0][0] == 5 && Cube_colors[4][0] == 3 && Cube_colors[4][2] == 1 && Cube_colors[2][2] == 5 && Cube_colors[2][8] == 6 && Cube_colors[5][8] == 1 && Cube_colors[5][6] == 3 && Cube_colors[0][6] == 6 && Cube_colors[0][3] == 1 && Cube_colors[4][1] == 5 && Cube_colors[2][5] == 3 && Cube_colors[5][7] == 6)
        {
            System.out.print("R B' R' F R B R' F' R B R' F R B' R' F'");
        }
        else if(Cube_colors[0][0] == 3 && Cube_colors[4][0] == 6 && Cube_colors[4][2] == 5 && Cube_colors[2][2] == 3 && Cube_colors[2][8] == 1 && Cube_colors[5][8] == 5 && Cube_colors[5][6] == 6 && Cube_colors[0][6] == 1 && Cube_colors[0][3] == 6 && Cube_colors[4][1] == 1 && Cube_colors[2][5] == 5 && Cube_colors[5][7] == 3)
        {
            System.out.print("U R B' R' F R B R' F' R B R' F R B' R' F'");
        }
        else if(Cube_colors[0][0] == 6 && Cube_colors[4][0] == 1 && Cube_colors[4][2] == 3 && Cube_colors[2][2] == 6 && Cube_colors[2][8] == 5 && Cube_colors[5][8] == 3 && Cube_colors[5][6] == 1 && Cube_colors[0][6] == 5 && Cube_colors[0][3] == 3 && Cube_colors[4][1] == 6 && Cube_colors[2][5] == 1 && Cube_colors[5][7] == 5)
        {
            System.out.print("U U R B' R' F R B R' F' R B R' F R B' R' F'");
        }
        else if(Cube_colors[0][0] == 1 && Cube_colors[4][0] == 5 && Cube_colors[4][2] == 6 && Cube_colors[2][2] == 1 && Cube_colors[2][8] == 3 && Cube_colors[5][8] == 6 && Cube_colors[5][6] == 5 && Cube_colors[0][6] == 3 && Cube_colors[0][3] == 5 && Cube_colors[4][1] == 3 && Cube_colors[2][5] == 6 && Cube_colors[5][7] == 1)
        {
            System.out.print("U' R B' R' F R B R' F' R B R' F R B' R' F'");
        }//******************************************************************************************************************************************************************************************************************************

        else if(Cube_colors[0][0] == 6 && Cube_colors[4][0] == 1 && Cube_colors[4][2] == 3 && Cube_colors[2][2] == 6 && Cube_colors[2][8] == 5 && Cube_colors[5][8] == 3 && Cube_colors[5][6] == 1 && Cube_colors[0][6] == 5 && Cube_colors[0][3] == 1 && Cube_colors[4][1] == 5 && Cube_colors[2][5] == 3 && Cube_colors[5][7] == 6)
        {
            System.out.print("U R B' R' F R B R' F' R B R' F R B' R' F' U'");
        }
        else if(Cube_colors[0][0] == 1 && Cube_colors[4][0] == 5 && Cube_colors[4][2] == 6 && Cube_colors[2][2] == 1 && Cube_colors[2][8] == 3 && Cube_colors[5][8] == 6 && Cube_colors[5][6] == 5 && Cube_colors[0][6] == 3 && Cube_colors[0][3] == 6 && Cube_colors[4][1] == 1 && Cube_colors[2][5] == 5 && Cube_colors[5][7] == 3)
        {
            System.out.print("U U R B' R' F R B R' F' R B R' F R B' R' F' U'");
        }
        else if(Cube_colors[0][0] == 5 && Cube_colors[4][0] == 3 && Cube_colors[4][2] == 1 && Cube_colors[2][2] == 5 && Cube_colors[2][8] == 6 && Cube_colors[5][8] == 1 && Cube_colors[5][6] == 3 && Cube_colors[0][6] == 6 && Cube_colors[0][3] == 3 && Cube_colors[4][1] == 6 && Cube_colors[2][5] == 1 && Cube_colors[5][7] == 5)
        {
            System.out.print("U' R B' R' F R B R' F' R B R' F R B' R' F' U'");
        }
        else if(Cube_colors[0][0] == 3 && Cube_colors[4][0] == 6 && Cube_colors[4][2] == 5 && Cube_colors[2][2] == 3 && Cube_colors[2][8] == 1 && Cube_colors[5][8] == 5 && Cube_colors[5][6] == 6 && Cube_colors[0][6] == 1 && Cube_colors[0][3] == 5 && Cube_colors[4][1] == 3 && Cube_colors[2][5] == 6 && Cube_colors[5][7] == 1)
        {
            System.out.print("R B' R' F R B R' F' R B R' F R B' R' F' U'");
        }//******************************************************************************************************************************************************************************************************************************

        //RA
        else if(Cube_colors[0][3] == 6 && Cube_colors[5][7] == 1 && Cube_colors[5][8] == 3 && Cube_colors[4][2] == 3 && Cube_colors[4][0] == 5 && Cube_colors[4][1] == 5)
        {
            System.out.print("L U' U' L' U U L F' L' U' L U L F L L U");
        }
        else if(Cube_colors[4][1] == 6 && Cube_colors[0][3] == 1 && Cube_colors[0][6] == 3 && Cube_colors[2][8] == 3 && Cube_colors[2][2] == 5 && Cube_colors[2][5] == 5)
        {
            System.out.print("U L U' U' L' U U L F' L' U' L U L F L L U");
        }
        else if(Cube_colors[2][5] == 6 && Cube_colors[4][1] == 1 && Cube_colors[4][0] == 3 && Cube_colors[5][6] == 3 && Cube_colors[5][8] == 5 && Cube_colors[5][7] == 5)
        {
            System.out.print("U U L U' U' L' U U L F' L' U' L U L F L L U");
        }
        else if(Cube_colors[5][7] == 6 && Cube_colors[2][5] == 1 && Cube_colors[2][2] == 3 && Cube_colors[0][0] == 3 && Cube_colors[0][6] == 5 && Cube_colors[0][3] == 5)
        {
            System.out.print("U' L U' U' L' U U L F' L' U' L U L F L L U");
        }//********************************************************************************************************************************

        else if(Cube_colors[0][3] == 1 && Cube_colors[5][7] == 5 && Cube_colors[5][8] == 6 && Cube_colors[4][2] == 6 && Cube_colors[4][0] == 3 && Cube_colors[4][1] == 3)
        {
            System.out.print("L U' U' L' U U L F' L' U' L U L F L L");
        }
        else if(Cube_colors[4][1] == 1 && Cube_colors[0][3] == 5 && Cube_colors[0][6] == 6 && Cube_colors[2][8] == 6 && Cube_colors[2][2] == 3 && Cube_colors[2][5] == 3)
        {
            System.out.print("U L U' U' L' U U L F' L' U' L U L F L L");
        }
        else if(Cube_colors[2][5] == 1 && Cube_colors[4][1] == 5 && Cube_colors[4][0] == 6 && Cube_colors[5][6] == 6 && Cube_colors[5][8] == 3 && Cube_colors[5][7] == 3)
        {
            System.out.print("U U L U' U' L' U U L F' L' U' L U L F L L");
        }
        else if(Cube_colors[5][7] == 1 && Cube_colors[2][5] == 5 && Cube_colors[2][2] == 6 && Cube_colors[0][0] == 6 && Cube_colors[0][6] == 3 && Cube_colors[0][3] == 3)
        {
            System.out.print("U' L U' U' L' U U L F' L' U' L U L F L L");
        }//********************************************************************************************************************************

        else if(Cube_colors[0][3] == 5 && Cube_colors[5][7] == 3 && Cube_colors[5][8] == 1 && Cube_colors[4][2] == 1 && Cube_colors[4][0] == 6 && Cube_colors[4][1] == 6)
        {
            System.out.print("L U' U' L' U U L F' L' U' L U L F L L U'");
        }
        else if(Cube_colors[4][1] == 5 && Cube_colors[0][3] == 3 && Cube_colors[0][6] == 1 && Cube_colors[2][8] == 1 && Cube_colors[2][2] == 6 && Cube_colors[2][5] == 6)
        {
            System.out.print("U L U' U' L' U U L F' L' U' L U L F L L U'");
        }
        else if(Cube_colors[2][5] == 5 && Cube_colors[4][1] == 3 && Cube_colors[4][0] == 1 && Cube_colors[5][6] == 1 && Cube_colors[5][8] == 6 && Cube_colors[5][7] == 6)
        {
            System.out.print("U U L U' U' L' U U L F' L' U' L U L F L L U'");
        }
        else if(Cube_colors[5][7] == 5 && Cube_colors[2][5] == 3 && Cube_colors[2][2] == 1 && Cube_colors[0][0] == 1 && Cube_colors[0][6] == 6 && Cube_colors[0][3] == 6)
        {
            System.out.print("U' L U' U' L' U U L F' L' U' L U L F L L U'");
        }//********************************************************************************************************************************

        else if(Cube_colors[0][3] == 3 && Cube_colors[5][7] == 6 && Cube_colors[5][8] == 5 && Cube_colors[4][2] == 5 && Cube_colors[4][0] == 1 && Cube_colors[4][1] == 1)
        {
            System.out.print("L U' U' L' U U L F' L' U' L U L F L L U U");
        }
        else if(Cube_colors[4][1] == 3 && Cube_colors[0][3] == 6 && Cube_colors[0][6] == 5 && Cube_colors[2][8] == 5 && Cube_colors[2][2] == 1 && Cube_colors[2][5] == 1)
        {
            System.out.print("U L U' U' L' U U L F' L' U' L U L F L L U U");
        }
        else if(Cube_colors[2][5] == 3 && Cube_colors[4][1] == 6 && Cube_colors[4][0] == 5 && Cube_colors[5][6] == 5 && Cube_colors[5][8] == 6 && Cube_colors[5][7] == 6)
        {
            System.out.print("U U L U' U' L' U U L F' L' U' L U L F L L U U");
        }
        else if(Cube_colors[5][7] == 3 && Cube_colors[2][5] == 6 && Cube_colors[2][2] == 5 && Cube_colors[0][0] == 5 && Cube_colors[0][6] == 6 && Cube_colors[0][3] == 6)
        {
            System.out.print("U' L U' U' L' U U L F' L' U' L U L F L L U U");
        }//********************************************************************************************************************************

        //RB
        else if(Cube_colors[0][3] == 5 && Cube_colors[4][1] == 1 && Cube_colors[5][8] == 3 && Cube_colors[4][2] == 3 && Cube_colors[5][7] == 6 && Cube_colors[5][6] == 6)
        {
            System.out.print("R' U U R U' U' R' F R U R' U' R' F' R R U'");
        }
        else if(Cube_colors[4][1] == 5 && Cube_colors[2][5] == 1 && Cube_colors[0][6] == 3 && Cube_colors[2][8] == 3 && Cube_colors[0][3] == 6 && Cube_colors[0][0] == 6)
        {
            System.out.print("U R' U U R U' U' R' F R U R' U' R' F' R R U'");
        }
        else if(Cube_colors[2][5] == 5 && Cube_colors[5][7] == 1 && Cube_colors[4][0] == 3 && Cube_colors[5][6] == 3 && Cube_colors[4][1] == 6 && Cube_colors[4][2] == 6)
        {
            System.out.print("U U R' U U R U' U' R' F R U R' U' R' F' R R U'");
        }
        else if(Cube_colors[5][7] == 5 && Cube_colors[0][3] == 1 && Cube_colors[2][2] == 3 && Cube_colors[0][0] == 3 && Cube_colors[2][5] == 6 && Cube_colors[2][8] == 6)
        {
            System.out.print("U' R' U U R U' U' R' F R U R' U' R' F' R R U'");
        }//********************************************************************************************************************************

        else if(Cube_colors[0][3] == 3 && Cube_colors[4][1] == 5 && Cube_colors[5][8] == 6 && Cube_colors[4][2] == 6 && Cube_colors[5][7] == 1 && Cube_colors[5][6] == 1)
        {
            System.out.print("R' U U R U' U' R' F R U R' U' R' F' R R U' U'");
        }
        else if(Cube_colors[4][1] == 3 && Cube_colors[2][5] == 5 && Cube_colors[0][6] == 6 && Cube_colors[2][8] == 6 && Cube_colors[0][3] == 1 && Cube_colors[0][0] == 1)
        {
            System.out.print("U R' U U R U' U' R' F R U R' U' R' F' R R U' U'");
        }
        else if(Cube_colors[2][5] == 3 && Cube_colors[5][7] == 5 && Cube_colors[4][0] == 6 && Cube_colors[5][6] == 6 && Cube_colors[4][1] == 1 && Cube_colors[4][2] == 1)
        {
            System.out.print("U U R' U U R U' U' R' F R U R' U' R' F' R R U' U'");
        }
        else if(Cube_colors[5][7] == 3 && Cube_colors[0][3] == 5 && Cube_colors[2][2] == 6 && Cube_colors[0][0] == 6 && Cube_colors[2][5] == 1 && Cube_colors[2][8] == 1)
        {
            System.out.print("U' R' U U R U' U' R' F R U R' U' R' F' R R U' U'");
        }//********************************************************************************************************************************

        else if(Cube_colors[0][3] == 6 && Cube_colors[4][1] == 3 && Cube_colors[5][8] == 1 && Cube_colors[4][2] == 1 && Cube_colors[5][7] == 5 && Cube_colors[5][6] == 5)
        {
            System.out.print("R' U U R U' U' R' F R U R' U' R' F' R R U");
        }
        else if(Cube_colors[4][1] == 6 && Cube_colors[2][5] == 3 && Cube_colors[0][6] == 1 && Cube_colors[2][8] == 1 && Cube_colors[0][3] == 5 && Cube_colors[0][0] == 5)
        {
            System.out.print("U R' U U R U' U' R' F R U R' U' R' F' R R U");
        }
        else if(Cube_colors[2][5] == 6 && Cube_colors[5][7] == 3 && Cube_colors[4][0] == 1 && Cube_colors[5][6] == 1 && Cube_colors[4][1] == 5 && Cube_colors[4][2] == 5)
        {
            System.out.print("U U R' U U R U' U' R' F R U R' U' R' F' R R U");
        }
        else if(Cube_colors[5][7] == 6 && Cube_colors[0][3] == 3 && Cube_colors[2][2] == 1 && Cube_colors[0][0] == 1 && Cube_colors[2][5] == 5 && Cube_colors[2][8] == 5)
        {
            System.out.print("U' R' U U R U' U' R' F R U R' U' R' F' R R U");
        }//********************************************************************************************************************************

        else if(Cube_colors[0][3] == 1 && Cube_colors[4][1] == 6 && Cube_colors[5][8] == 5 && Cube_colors[4][2] == 5 && Cube_colors[5][7] == 3 && Cube_colors[5][6] == 3)
        {
            System.out.print("R' U U R U' U' R' F R U R' U' R' F' R R");
        }
        else if(Cube_colors[4][1] == 1 && Cube_colors[2][5] == 6 && Cube_colors[0][6] == 5 && Cube_colors[2][8] == 5 && Cube_colors[0][3] == 3 && Cube_colors[0][0] == 3)
        {
            System.out.print("U R' U U R U' U' R' F R U R' U' R' F' R R");
        }
        else if(Cube_colors[2][5] == 1 && Cube_colors[5][7] == 6 && Cube_colors[4][0] == 5 && Cube_colors[5][6] == 5 && Cube_colors[4][1] == 3 && Cube_colors[4][2] == 3)
        {
            System.out.print("U U R' U U R U' U' R' F R U R' U' R' F' R R");
        }
        else if(Cube_colors[5][7] == 1 && Cube_colors[0][3] == 6 && Cube_colors[2][2] == 5 && Cube_colors[0][0] == 5 && Cube_colors[2][5] == 3 && Cube_colors[2][8] == 3)
        {
            System.out.print("U' R' U U R U' U' R' F R U R' U' R' F' R R");
        }//********************************************************************************************************************************

        //JA
        else if(Cube_colors[5][7] == 3 && Cube_colors[5][8] == 3 && Cube_colors[2][5] == 6 && Cube_colors[2][2] == 6 && Cube_colors[0][3] == 1 && Cube_colors[4][1] == 5)
        {
            System.out.print("R' U L' U U R U' R' U U R L U'");
        }
        else if(Cube_colors[0][3] == 3 && Cube_colors[0][6] == 3 && Cube_colors[5][7] == 6 && Cube_colors[5][8] == 6 && Cube_colors[4][1] == 1 && Cube_colors[2][5] == 5)
        {
            System.out.print("U R' U L' U U R U' R' U U R L U'");
        }
        else if(Cube_colors[4][1] == 3 && Cube_colors[4][0] == 3 && Cube_colors[0][3] == 6 && Cube_colors[0][6] == 6 && Cube_colors[2][5] == 1 && Cube_colors[5][7] == 5)
        {
            System.out.print("U U R' U L' U U R U' R' U U R L U'");
        }
        else if(Cube_colors[2][5] == 3 && Cube_colors[2][2] == 3 && Cube_colors[4][1] == 6 && Cube_colors[4][0] == 6 && Cube_colors[5][7] == 1 && Cube_colors[0][3] == 5)
        {
            System.out.print("U' R' U L' U U R U' R' U U R L U'");
        }//*********************************************************************************************************************************

        else if(Cube_colors[5][7] == 6 && Cube_colors[5][8] == 6 && Cube_colors[2][5] == 1 && Cube_colors[2][2] == 1 && Cube_colors[0][3] == 5 && Cube_colors[4][1] == 3)
        {
            System.out.print("R' U L' U U R U' R' U U R L U' U'");
        }
        else if(Cube_colors[0][3] == 6 && Cube_colors[0][6] == 6 && Cube_colors[5][7] == 1 && Cube_colors[5][8] == 1 && Cube_colors[4][1] == 5 && Cube_colors[2][5] == 3)
        {
            System.out.print("U R' U L' U U R U' R' U U R L U' U'");
        }
        else if(Cube_colors[4][1] == 6 && Cube_colors[4][0] == 6 && Cube_colors[0][3] == 1 && Cube_colors[0][6] == 1 && Cube_colors[2][5] == 5 && Cube_colors[5][7] == 3)
        {
            System.out.print("U U R' U L' U U R U' R' U U R L U' U'");
        }
        else if(Cube_colors[2][5] == 6 && Cube_colors[2][2] == 6 && Cube_colors[4][1] == 1 && Cube_colors[4][0] == 1 && Cube_colors[5][7] == 5 && Cube_colors[0][3] == 3)
        {
            System.out.print("U' R' U L' U U R U' R' U U R L U' U'");
        }//*********************************************************************************************************************************

        else if(Cube_colors[5][7] == 1 && Cube_colors[5][8] == 1 && Cube_colors[2][5] == 5 && Cube_colors[2][2] == 5 && Cube_colors[0][3] == 3 && Cube_colors[4][1] == 6)
        {
            System.out.print("R' U L' U U R U' R' U U R L U");
        }
        else if(Cube_colors[0][3] == 1 && Cube_colors[0][6] == 1 && Cube_colors[5][7] == 5 && Cube_colors[5][8] == 5 && Cube_colors[4][1] == 3 && Cube_colors[2][5] == 6)
        {
            System.out.print("U R' U L' U U R U' R' U U R L U");
        }
        else if(Cube_colors[4][1] == 1 && Cube_colors[4][0] == 1 && Cube_colors[0][3] == 5 && Cube_colors[0][6] == 5 && Cube_colors[2][5] == 3 && Cube_colors[5][7] == 6)
        {
            System.out.print("U U R' U L' U U R U' R' U U R L U");
        }
        else if(Cube_colors[2][5] == 1 && Cube_colors[2][2] == 1 && Cube_colors[4][1] == 5 && Cube_colors[4][0] == 5 && Cube_colors[5][7] == 3 && Cube_colors[0][3] == 6)
        {
            System.out.print("U' R' U L' U U R U' R' U U R L U");
        }//*********************************************************************************************************************************

        else if(Cube_colors[5][7] == 5 && Cube_colors[5][8] == 5 && Cube_colors[2][5] == 3 && Cube_colors[2][2] == 3 && Cube_colors[0][3] == 6 && Cube_colors[4][1] == 1)
        {
            System.out.print("R' U L' U U R U' R' U U R L");
        }
        else if(Cube_colors[0][3] == 5 && Cube_colors[0][6] == 5 && Cube_colors[5][7] == 3 && Cube_colors[5][8] == 3 && Cube_colors[4][1] == 6 && Cube_colors[2][5] == 1)
        {
            System.out.print("U R' U L' U U R U' R' U U R L");
        }
        else if(Cube_colors[4][1] == 5 && Cube_colors[4][0] == 5 && Cube_colors[0][3] == 3 && Cube_colors[0][6] == 3 && Cube_colors[2][5] == 6 && Cube_colors[5][7] == 1)
        {
            System.out.print("U U R' U L' U U R U' R' U U R L");
        }
        else if(Cube_colors[2][5] == 5 && Cube_colors[2][2] == 5 && Cube_colors[4][1] == 3 && Cube_colors[4][0] == 3 && Cube_colors[5][7] == 6 && Cube_colors[0][3] == 1)
        {
            System.out.print("U' R' U L' U U R U' R' U U R L");
        }//*********************************************************************************************************************************

        //JB
        else if(Cube_colors[0][3] == 5 && Cube_colors[0][0] == 5 && Cube_colors[4][1] == 1 && Cube_colors[4][2] == 1 && Cube_colors[2][5] == 3 && Cube_colors[5][7] == 6)
        {
            System.out.print("R U R' F' R U R' U' R' F R R U' R' U'");
        }
        else if(Cube_colors[4][1] == 5 && Cube_colors[4][2] == 5 && Cube_colors[2][5] == 1 && Cube_colors[2][8] == 1 && Cube_colors[5][7] == 3 && Cube_colors[0][3] == 6)
        {
            System.out.print("U R U R' F' R U R' U' R' F R R U' R' U'");
        }
        else if(Cube_colors[2][5] == 5 && Cube_colors[2][8] == 5 && Cube_colors[5][7] == 1 && Cube_colors[5][6] == 1 && Cube_colors[0][3] == 3 && Cube_colors[4][1] == 6)
        {
            System.out.print("U U R U R' F' R U R' U' R' F R R U' R' U'");
        }
        else if(Cube_colors[5][7] == 5 && Cube_colors[5][6] == 5 && Cube_colors[0][3] == 1 && Cube_colors[0][0] == 1 && Cube_colors[4][1] == 3 && Cube_colors[2][5] == 6)
        {
            System.out.print("U' R U R' F' R U R' U' R' F R R U' R' U'");
        }//**********************************************************************************************************************************

        else if(Cube_colors[0][3] == 3 && Cube_colors[0][0] == 3 && Cube_colors[4][1] == 5 && Cube_colors[4][2] == 5 && Cube_colors[2][5] == 6 && Cube_colors[5][7] == 1)
        {
            System.out.print("R U R' F' R U R' U' R' F R R U' R' U' U'");
        }
        else if(Cube_colors[4][1] == 3 && Cube_colors[4][2] == 3 && Cube_colors[2][5] == 5 && Cube_colors[2][8] == 5 && Cube_colors[5][7] == 6 && Cube_colors[0][3] == 1)
        {
            System.out.print("U R U R' F' R U R' U' R' F R R U' R' U' U'");
        }
        else if(Cube_colors[2][5] == 3 && Cube_colors[2][8] == 3 && Cube_colors[5][7] == 5 && Cube_colors[5][6] == 5 && Cube_colors[0][3] == 6 && Cube_colors[4][1] == 1)
        {
            System.out.print("U U R U R' F' R U R' U' R' F R R U' R' U' U'");
        }
        else if(Cube_colors[5][7] == 3 && Cube_colors[5][6] == 3 && Cube_colors[0][3] == 5 && Cube_colors[0][0] == 5 && Cube_colors[4][1] == 6 && Cube_colors[2][5] == 1)
        {
            System.out.print("U' R U R' F' R U R' U' R' F R R U' R' U' U'");
        }//**********************************************************************************************************************************

        else if(Cube_colors[0][3] == 6 && Cube_colors[0][0] == 6 && Cube_colors[4][1] == 3 && Cube_colors[4][2] == 3 && Cube_colors[2][5] == 1 && Cube_colors[5][7] == 5)
        {
            System.out.print("R U R' F' R U R' U' R' F R R U' R' U");
        }
        else if(Cube_colors[4][1] == 6 && Cube_colors[4][2] == 6 && Cube_colors[2][5] == 3 && Cube_colors[2][8] == 3 && Cube_colors[5][7] == 1 && Cube_colors[0][3] == 5)
        {
            System.out.print("U R U R' F' R U R' U' R' F R R U' R' U");
        }
        else if(Cube_colors[2][5] == 6 && Cube_colors[2][8] == 6 && Cube_colors[5][7] == 3 && Cube_colors[5][6] == 3 && Cube_colors[0][3] == 1 && Cube_colors[4][1] == 5)
        {
            System.out.print("U U R U R' F' R U R' U' R' F R R U' R' U");
        }
        else if(Cube_colors[5][7] == 6 && Cube_colors[5][6] == 6 && Cube_colors[0][3] == 3 && Cube_colors[0][0] == 3 && Cube_colors[4][1] == 1 && Cube_colors[2][5] == 5)
        {
            System.out.print("U' R U R' F' R U R' U' R' F R R U' R' U");
        }//**********************************************************************************************************************************

        else if(Cube_colors[0][3] == 1 && Cube_colors[0][0] == 1 && Cube_colors[4][1] == 6 && Cube_colors[4][2] == 6 && Cube_colors[2][5] == 5 && Cube_colors[5][7] == 3)
        {
            System.out.print("R U R' F' R U R' U' R' F R R U' R'");
        }
        else if(Cube_colors[4][1] == 1 && Cube_colors[4][2] == 1 && Cube_colors[2][5] == 6 && Cube_colors[2][8] == 6 && Cube_colors[5][7] == 5 && Cube_colors[0][3] == 3)
        {
            System.out.print("U R U R' F' R U R' U' R' F R R U' R'");
        }
        else if(Cube_colors[2][5] == 1 && Cube_colors[2][8] == 1 && Cube_colors[5][7] == 6 && Cube_colors[5][6] == 6 && Cube_colors[0][3] == 5 && Cube_colors[4][1] == 3)
        {
            System.out.print("U U R U R' F' R U R' U' R' F R R U' R'");
        }
        else if(Cube_colors[5][7] == 1 && Cube_colors[5][6] == 1 && Cube_colors[0][3] == 6 && Cube_colors[0][0] == 6 && Cube_colors[4][1] == 5 && Cube_colors[2][5] == 3)
        {
            System.out.print("U' R U R' F' R U R' U' R' F R R U' R'");
        }//**********************************************************************************************************************************

        //T
        else if(Cube_colors[0][0] == 5  && Cube_colors[2][2] == 5 && Cube_colors[4][1] == 6 && Cube_colors[5][7] == 5 && Cube_colors[0][3] == 1 && Cube_colors[2][2] == 3)
        {
            System.out.print("R U R' U' R' F R R U' R' U' R U R' F'");
        }
        else if(Cube_colors[4][2] == 5  && Cube_colors[5][8] == 5 && Cube_colors[2][5] == 6 && Cube_colors[0][3] == 5 && Cube_colors[4][1] == 1 && Cube_colors[5][7] == 3)
        {
            System.out.print("U R U R' U' R' F R R U' R' U' R U R' F'");
        }
        else if(Cube_colors[2][8] == 5  && Cube_colors[0][6] == 5 && Cube_colors[5][7] == 6 && Cube_colors[4][1] == 5 && Cube_colors[2][2] == 1 && Cube_colors[0][3] == 3)
        {
            System.out.print("U U R U R' U' R' F R R U' R' U' R U R' F'");
        }
        else if(Cube_colors[5][6] == 5  && Cube_colors[4][0] == 5 && Cube_colors[0][3] == 6 && Cube_colors[2][5] == 5 && Cube_colors[5][7] == 1 && Cube_colors[4][1] == 3)
        {
            System.out.print("U' R U R' U' R' F R R U' R' U' R U R' F'");
        }//*********************************************************************************************************************************

        else if(Cube_colors[0][0] == 3  && Cube_colors[2][2] == 3 && Cube_colors[4][1] == 1 && Cube_colors[5][7] == 3 && Cube_colors[0][3] == 5 && Cube_colors[2][2] == 6)
        {
            System.out.print("R U R' U' R' F R R U' R' U' R U R' F' U'");
        }
        else if(Cube_colors[4][2] == 3  && Cube_colors[5][8] == 3 && Cube_colors[2][5] == 1 && Cube_colors[0][3] == 3 && Cube_colors[4][1] == 5 && Cube_colors[5][7] == 6)
        {
            System.out.print("U R U R' U' R' F R R U' R' U' R U R' F' U'");
        }
        else if(Cube_colors[2][8] == 3  && Cube_colors[0][6] == 3 && Cube_colors[5][7] == 1 && Cube_colors[4][1] == 3 && Cube_colors[2][2] == 5 && Cube_colors[0][3] == 6)
        {
            System.out.print("U U R U R' U' R' F R R U' R' U' R U R' F' U'");
        }
        else if(Cube_colors[5][6] == 3  && Cube_colors[4][0] == 3 && Cube_colors[0][3] == 1 && Cube_colors[2][5] == 3 && Cube_colors[5][7] == 5 && Cube_colors[4][1] == 6)
        {
            System.out.print("U' R U R' U' R' F R R U' R' U' R U R' F' U'");
        }//*********************************************************************************************************************************

        else if(Cube_colors[0][0] == 6  && Cube_colors[2][2] == 6 && Cube_colors[4][1] == 5 && Cube_colors[5][7] == 6 && Cube_colors[0][3] == 3 && Cube_colors[2][2] == 1)
        {
            System.out.print("R U R' U' R' F R R U' R' U' R U R' F' U U");
        }
        else if(Cube_colors[4][2] == 6  && Cube_colors[5][8] == 6 && Cube_colors[2][5] == 5 && Cube_colors[0][3] == 6 && Cube_colors[4][1] == 3 && Cube_colors[5][7] == 1)
        {
            System.out.print("U R U R' U' R' F R R U' R' U' R U R' F' U U");
        }
        else if(Cube_colors[2][8] == 6  && Cube_colors[0][6] == 6 && Cube_colors[5][7] == 5 && Cube_colors[4][1] == 6 && Cube_colors[2][2] == 3 && Cube_colors[0][3] == 1)
        {
            System.out.print("U U R U R' U' R' F R R U' R' U' R U R' F' U U");
        }
        else if(Cube_colors[5][6] == 6  && Cube_colors[4][0] == 6 && Cube_colors[0][3] == 5 && Cube_colors[2][5] == 6 && Cube_colors[5][7] == 3 && Cube_colors[4][1] == 1)
        {
            System.out.print("U' R U R' U' R' F R R U' R' U' R U R' F' U U");
        }//*********************************************************************************************************************************

        else if(Cube_colors[0][0] == 1  && Cube_colors[2][2] == 1 && Cube_colors[4][1] == 3 && Cube_colors[5][7] == 1 && Cube_colors[0][3] == 6 && Cube_colors[2][2] == 5)
        {
            System.out.print("R U R' U' R' F R R U' R' U' R U R' F' U");
        }
        else if(Cube_colors[4][2] == 1  && Cube_colors[5][8] == 1 && Cube_colors[2][5] == 3 && Cube_colors[0][3] == 1 && Cube_colors[4][1] == 6 && Cube_colors[5][7] == 5)
        {
            System.out.print("U R U R' U' R' F R R U' R' U' R U R' F' U");
        }
        else if(Cube_colors[2][8] == 1  && Cube_colors[0][6] == 1 && Cube_colors[5][7] == 3 && Cube_colors[4][1] == 1 && Cube_colors[2][2] == 6 && Cube_colors[0][3] == 5)
        {
            System.out.print("U U R U R' U' R' F R R U' R' U' R U R' F' U");
        }
        else if(Cube_colors[5][6] == 1  && Cube_colors[4][0] == 1 && Cube_colors[0][3] == 3 && Cube_colors[2][5] == 1 && Cube_colors[5][7] == 6 && Cube_colors[4][1] == 5)
        {
            System.out.print("U' R U R' U' R' F R R U' R' U' R U R' F' U");
        }//*********************************************************************************************************************************

        //F
        else if(Cube_colors[0][3] == 3 && Cube_colors[0][0] == 5 && Cube_colors[2][2] == 5 && Cube_colors[2][5] == 1 && Cube_colors[5][8] == 6 && Cube_colors[5][7] == 6 && Cube_colors[5][6] == 6)
        {
            System.out.print("R' U' F' R U R' U' R' F R R U' R' U' R U R' U R");
        }
        else if(Cube_colors[4][1] == 3 && Cube_colors[4][2] == 5 && Cube_colors[5][8] == 5 && Cube_colors[5][7] == 1 && Cube_colors[0][6] == 6 && Cube_colors[0][3] == 6 && Cube_colors[0][0] == 6)
        {
            System.out.print("U R' U' F' R U R' U' R' F R R U' R' U' R U R' U R");
        }
        else if(Cube_colors[2][5] == 3 && Cube_colors[2][8] == 5 && Cube_colors[0][6] == 5 && Cube_colors[0][3] == 1 && Cube_colors[4][0] == 6 && Cube_colors[4][1] == 6 && Cube_colors[4][2] == 6)
        {
            System.out.print("U U R' U' F' R U R' U' R' F R R U' R' U' R U R' U R");
        }
        else if(Cube_colors[5][7] == 3 && Cube_colors[5][6] == 5 && Cube_colors[4][0] == 5 && Cube_colors[4][1] == 1 && Cube_colors[2][2] == 6 && Cube_colors[2][5] == 6 && Cube_colors[2][8] == 6)
        {
            System.out.print("U' R' U' F' R U R' U' R' F R R U' R' U' R U R' U R");
        }//*********************************************************************************************************************************

        else if(Cube_colors[0][3] == 6 && Cube_colors[0][0] == 3 && Cube_colors[2][2] == 3 && Cube_colors[2][5] == 5 && Cube_colors[5][8] == 1 && Cube_colors[5][7] == 1 && Cube_colors[5][6] == 1)
        {
            System.out.print("R' U' F' R U R' U' R' F R R U' R' U' R U R' U R U'");
        }
        else if(Cube_colors[4][1] == 6 && Cube_colors[4][2] == 3 && Cube_colors[5][8] == 3 && Cube_colors[5][7] == 5 && Cube_colors[0][6] == 1 && Cube_colors[0][3] == 1 && Cube_colors[0][0] == 1)
        {
            System.out.print("U R' U' F' R U R' U' R' F R R U' R' U' R U R' U R U'");
        }
        else if(Cube_colors[2][5] == 6 && Cube_colors[2][8] == 3 && Cube_colors[0][6] == 3 && Cube_colors[0][3] == 5 && Cube_colors[4][0] == 1 && Cube_colors[4][1] == 1 && Cube_colors[4][2] == 1)
        {
            System.out.print("U U R' U' F' R U R' U' R' F R R U' R' U' R U R' U R U'");
        }
        else if(Cube_colors[5][7] == 6 && Cube_colors[5][6] == 3 && Cube_colors[4][0] == 3 && Cube_colors[4][1] == 5 && Cube_colors[2][2] == 1 && Cube_colors[2][5] == 1 && Cube_colors[2][8] == 1)
        {
            System.out.print("U' R' U' F' R U R' U' R' F R R U' R' U' R U R' U R U'");
        }//*********************************************************************************************************************************

        else if(Cube_colors[0][3] == 1 && Cube_colors[0][0] == 6 && Cube_colors[2][2] == 6 && Cube_colors[2][5] == 3 && Cube_colors[5][8] == 5 && Cube_colors[5][7] == 5 && Cube_colors[5][6] == 5)
        {
            System.out.print("R' U' F' R U R' U' R' F R R U' R' U' R U R' U R U U");
        }
        else if(Cube_colors[4][1] == 1 && Cube_colors[4][2] == 6 && Cube_colors[5][8] == 6 && Cube_colors[5][7] == 3 && Cube_colors[0][6] == 5 && Cube_colors[0][3] == 5 && Cube_colors[0][0] == 5)
        {
            System.out.print("U R' U' F' R U R' U' R' F R R U' R' U' R U R' U R U U");
        }
        else if(Cube_colors[2][5] == 1 && Cube_colors[2][8] == 6 && Cube_colors[0][6] == 6 && Cube_colors[0][3] == 3 && Cube_colors[4][0] == 5 && Cube_colors[4][1] == 5 && Cube_colors[4][2] == 5)
        {
            System.out.print("U U R' U' F' R U R' U' R' F R R U' R' U' R U R' U R U U");
        }
        else if(Cube_colors[5][7] == 1 && Cube_colors[5][6] == 6 && Cube_colors[4][0] == 6 && Cube_colors[4][1] == 3 && Cube_colors[2][2] == 5 && Cube_colors[2][5] == 5 && Cube_colors[2][8] == 5)
        {
            System.out.print("U' R' U' F' R U R' U' R' F R R U' R' U' R U R' U R U U");
        }//*********************************************************************************************************************************

        else if(Cube_colors[0][3] == 5 && Cube_colors[0][0] == 1 && Cube_colors[2][2] == 1 && Cube_colors[2][5] == 6 && Cube_colors[5][8] == 3 && Cube_colors[5][7] == 3 && Cube_colors[5][6] == 3)
        {
            System.out.print("R' U' F' R U R' U' R' F R R U' R' U' R U R' U R U");
        }
        else if(Cube_colors[4][1] == 5 && Cube_colors[4][2] == 1 && Cube_colors[5][8] == 1 && Cube_colors[5][7] == 6 && Cube_colors[0][6] == 3 && Cube_colors[0][3] == 3 && Cube_colors[0][0] == 3)
        {
            System.out.print("U R' U' F' R U R' U' R' F R R U' R' U' R U R' U R U");
        }
        else if(Cube_colors[2][5] == 5 && Cube_colors[2][8] == 1 && Cube_colors[0][6] == 1 && Cube_colors[0][3] == 6 && Cube_colors[4][0] == 3 && Cube_colors[4][1] == 3 && Cube_colors[4][2] == 3)
        {
            System.out.print("U U R' U' F' R U R' U' R' F R R U' R' U' R U R' U R U");
        }
        else if(Cube_colors[5][7] == 5 && Cube_colors[5][6] == 1 && Cube_colors[4][0] == 1 && Cube_colors[4][1] == 6 && Cube_colors[2][2] == 3 && Cube_colors[2][5] == 3 && Cube_colors[2][8] == 3)
        {
            System.out.print("U' R' U' F' R U R' U' R' F R R U' R' U' R U R' U R U");
        }//*********************************************************************************************************************************

        //V
        else if(Cube_colors[0][6] == 3 && Cube_colors[0][3] == 5 && Cube_colors[4][1] == 1 && Cube_colors[4][2] == 6 && Cube_colors[5][7] == 6 && Cube_colors[2][2] == 3)
        {
            System.out.print("F' U F' U' R' F' R R U' R' U R' F R F");
        }
        else if(Cube_colors[4][0] == 3 && Cube_colors[4][1] == 5 && Cube_colors[2][5] == 1 && Cube_colors[2][8] == 6 && Cube_colors[0][3] == 6 && Cube_colors[5][7] == 3)
        {
            System.out.print("U F' U F' U' R' F' R R U' R' U R' F R F");
        }
        else if(Cube_colors[2][2] == 3 && Cube_colors[2][5] == 5 && Cube_colors[5][7] == 1 && Cube_colors[5][6] == 6 && Cube_colors[4][1] == 6 && Cube_colors[0][3] == 3)
        {
            System.out.print("U U F' U F' U' R' F' R R U' R' U R' F R F");
        }
        else if(Cube_colors[5][8] == 3 && Cube_colors[5][7] == 5 && Cube_colors[0][3] == 1 && Cube_colors[0][0] == 6 && Cube_colors[2][2] == 6 && Cube_colors[4][1] == 3)
        {
            System.out.print("U' F' U F' U' R' F' R R U' R' U R' F R F");
        }//********************************************************************************************************************************

        else if(Cube_colors[0][6] == 6 && Cube_colors[0][3] == 3 && Cube_colors[4][1] == 5 && Cube_colors[4][2] == 1 && Cube_colors[5][7] == 1 && Cube_colors[2][2] == 6)
        {
            System.out.print("F' U F' U' R' F' R R U' R' U R' F R F U'");
        }
        else if(Cube_colors[4][0] == 6 && Cube_colors[4][1] == 3 && Cube_colors[2][5] == 5 && Cube_colors[2][8] == 1 && Cube_colors[0][3] == 1 && Cube_colors[5][7] == 6)
        {
            System.out.print("U F' U F' U' R' F' R R U' R' U R' F R F U'");
        }
        else if(Cube_colors[2][2] == 6 && Cube_colors[2][5] == 3 && Cube_colors[5][7] == 5 && Cube_colors[5][6] == 1 && Cube_colors[4][1] == 1 && Cube_colors[0][3] == 6)
        {
            System.out.print("U U F' U F' U' R' F' R R U' R' U R' F R F U'");
        }
        else if(Cube_colors[5][8] == 6 && Cube_colors[5][7] == 3 && Cube_colors[0][3] == 5 && Cube_colors[0][0] == 1 && Cube_colors[2][2] == 1 && Cube_colors[4][1] == 6)
        {
            System.out.print("U' F' U F' U' R' F' R R U' R' U R' F R F U'");
        }//********************************************************************************************************************************

        else if(Cube_colors[0][6] == 1 && Cube_colors[0][3] == 6 && Cube_colors[4][1] == 3 && Cube_colors[4][2] == 5 && Cube_colors[5][7] == 5 && Cube_colors[2][2] == 1)
        {
            System.out.print("F' U F' U' R' F' R R U' R' U R' F R F U U");
        }
        else if(Cube_colors[4][0] == 1 && Cube_colors[4][1] == 6 && Cube_colors[2][5] == 3 && Cube_colors[2][8] == 5 && Cube_colors[0][3] == 5 && Cube_colors[5][7] == 1)
        {
            System.out.print("U F' U F' U' R' F' R R U' R' U R' F R F U U");
        }
        else if(Cube_colors[2][2] == 1 && Cube_colors[2][5] == 6 && Cube_colors[5][7] == 3 && Cube_colors[5][6] == 5 && Cube_colors[4][1] == 5 && Cube_colors[0][3] == 1)
        {
            System.out.print("U U F' U F' U' R' F' R R U' R' U R' F R F U U");
        }
        else if(Cube_colors[5][8] == 1 && Cube_colors[5][7] == 6 && Cube_colors[0][3] == 3 && Cube_colors[0][0] == 5 && Cube_colors[2][2] == 5 && Cube_colors[4][1] == 1)
        {
            System.out.print("U' F' U F' U' R' F' R R U' R' U R' F R F U U");
        }//********************************************************************************************************************************

        else if(Cube_colors[0][6] == 5 && Cube_colors[0][3] == 1 && Cube_colors[4][1] == 6 && Cube_colors[4][2] == 3 && Cube_colors[5][7] == 3 && Cube_colors[2][2] == 5)
        {
            System.out.print("F' U F' U' R' F' R R U' R' U R' F R F U");
        }
        else if(Cube_colors[4][0] == 5 && Cube_colors[4][1] == 1 && Cube_colors[2][5] == 6 && Cube_colors[2][8] == 3 && Cube_colors[0][3] == 3 && Cube_colors[5][7] == 5)
        {
            System.out.print("U F' U F' U' R' F' R R U' R' U R' F R F U");
        }
        else if(Cube_colors[2][2] == 5 && Cube_colors[2][5] == 1 && Cube_colors[5][7] == 6 && Cube_colors[5][6] == 3 && Cube_colors[4][1] == 3 && Cube_colors[0][3] == 5)
        {
            System.out.print("U U F' U F' U' R' F' R R U' R' U R' F R F U");
        }
        else if(Cube_colors[5][8] == 5 && Cube_colors[5][7] == 1 && Cube_colors[0][3] == 6 && Cube_colors[0][0] == 3 && Cube_colors[2][2] == 3 && Cube_colors[4][1] == 5)
        {
            System.out.print("U' F' U F' U' R' F' R R U' R' U R' F R F U");
        }//********************************************************************************************************************************

        //Y
        else if(Cube_colors[0][0] == 3 && Cube_colors[2][8] == 1 && Cube_colors[2][5] == 6 && Cube_colors[5][7] == 3 && Cube_colors[0][3] == 1 && Cube_colors[4][1] == 5)
        {
            System.out.print("F R U' R' U' R U R' F' R U R' U' R' F R F'");
        }
        else if(Cube_colors[4][2] == 3 && Cube_colors[5][6] == 1 && Cube_colors[5][7] == 6 && Cube_colors[0][3] == 3 && Cube_colors[4][1] == 1 && Cube_colors[2][5] == 5)
        {
            System.out.print("U F R U' R' U' R U R' F' R U R' U' R' F R F'");
        }
        else if(Cube_colors[2][8] == 3 && Cube_colors[0][0] == 1 && Cube_colors[0][3] == 6 && Cube_colors[4][1] == 3 && Cube_colors[2][5] == 1 && Cube_colors[5][7] == 5)
        {
            System.out.print("U U F R U' R' U' R U R' F' R U R' U' R' F R F'");
        }
        else if(Cube_colors[5][6] == 3 && Cube_colors[4][2] == 1 && Cube_colors[4][1] == 6 && Cube_colors[2][5] == 3 && Cube_colors[5][7] == 1 && Cube_colors[0][3] == 5)
        {
            System.out.print("U' F R U' R' U' R U R' F' R U R' U' R' F R F'");
        }//***************************************************************************************************************************

        else if(Cube_colors[0][0] == 6 && Cube_colors[2][8] == 5 && Cube_colors[2][5] == 1 && Cube_colors[5][7] == 6 && Cube_colors[0][3] == 5 && Cube_colors[4][1] == 3)
        {
            System.out.print("F R U' R' U' R U R' F' R U R' U' R' F R F' U'");
        }
        else if(Cube_colors[4][2] == 6 && Cube_colors[5][6] == 5 && Cube_colors[5][7] == 1 && Cube_colors[0][3] == 6 && Cube_colors[4][1] == 5 && Cube_colors[2][5] == 3)
        {
            System.out.print("U F R U' R' U' R U R' F' R U R' U' R' F R F' U'");
        }
        else if(Cube_colors[2][8] == 6 && Cube_colors[0][0] == 5 && Cube_colors[0][3] == 1 && Cube_colors[4][1] == 6 && Cube_colors[2][5] == 5 && Cube_colors[5][7] == 3)
        {
            System.out.print("U U F R U' R' U' R U R' F' R U R' U' R' F R F' U'");
        }
        else if(Cube_colors[5][6] == 6 && Cube_colors[4][2] == 5 && Cube_colors[4][1] == 1 && Cube_colors[2][5] == 6 && Cube_colors[5][7] == 5 && Cube_colors[0][3] == 3)
        {
            System.out.print("U' F R U' R' U' R U R' F' R U R' U' R' F R F' U'");
        }//***************************************************************************************************************************

        else if(Cube_colors[0][0] == 1 && Cube_colors[2][8] == 3 && Cube_colors[2][5] == 5 && Cube_colors[5][7] == 1 && Cube_colors[0][3] == 3 && Cube_colors[4][1] == 6)
        {
            System.out.print("F R U' R' U' R U R' F' R U R' U' R' F R F' U U");
        }
        else if(Cube_colors[4][2] == 1 && Cube_colors[5][6] == 3 && Cube_colors[5][7] == 5 && Cube_colors[0][3] == 1 && Cube_colors[4][1] == 3 && Cube_colors[2][5] == 6)
        {
            System.out.print("U F R U' R' U' R U R' F' R U R' U' R' F R F' U U");
        }
        else if(Cube_colors[2][8] == 1 && Cube_colors[0][0] == 3 && Cube_colors[0][3] == 5 && Cube_colors[4][1] == 1 && Cube_colors[2][5] == 3 && Cube_colors[5][7] == 6)
        {
            System.out.print("U U F R U' R' U' R U R' F' R U R' U' R' F R F' U U");
        }
        else if(Cube_colors[5][6] == 1 && Cube_colors[4][2] == 3 && Cube_colors[4][1] == 5 && Cube_colors[2][5] == 1 && Cube_colors[5][7] == 3 && Cube_colors[0][3] == 6)
        {
            System.out.print("U' F R U' R' U' R U R' F' R U R' U' R' F R F' U U");
        }//***************************************************************************************************************************

        else if(Cube_colors[0][0] == 5 && Cube_colors[2][8] == 6 && Cube_colors[2][5] == 3 && Cube_colors[5][7] == 5 && Cube_colors[0][3] == 6 && Cube_colors[4][1] == 1)
        {
            System.out.print("F R U' R' U' R U R' F' R U R' U' R' F R F' U");
        }
        else if(Cube_colors[4][2] == 5 && Cube_colors[5][6] == 6 && Cube_colors[5][7] == 3 && Cube_colors[0][3] == 5 && Cube_colors[4][1] == 6 && Cube_colors[2][5] == 1)
        {
            System.out.print("U F R U' R' U' R U R' F' R U R' U' R' F R F' U");
        }
        else if(Cube_colors[2][8] == 5 && Cube_colors[0][0] == 6 && Cube_colors[0][3] == 3 && Cube_colors[4][1] == 5 && Cube_colors[2][5] == 6 && Cube_colors[5][7] == 1)
        {
            System.out.print("U U F R U' R' U' R U R' F' R U R' U' R' F R F' U");
        }
        else if(Cube_colors[5][6] == 5 && Cube_colors[4][2] == 6 && Cube_colors[4][1] == 3 && Cube_colors[2][5] == 5 && Cube_colors[5][7] == 6 && Cube_colors[0][3] == 1)
        {
            System.out.print("U' F R U' R' U' R U R' F' R U R' U' R' F R F' U");
        }//***************************************************************************************************************************

        //NA
        else if(Cube_colors[0][3] == 3 && Cube_colors[0][0] == 3 && Cube_colors[4][1] == 5 && Cube_colors[4][2] == 5 && Cube_colors[2][5] == 1 && Cube_colors[2][8] == 1  && Cube_colors[5][7] == 6 && Cube_colors[5][6] == 6)
        {
            System.out.print("L U' R U U L' U R' L U' R U U L' U R' U");
        }
        else if(Cube_colors[0][3] == 6 && Cube_colors[0][0] == 6 && Cube_colors[4][1] == 3 && Cube_colors[4][2] == 3 && Cube_colors[2][5] == 5 && Cube_colors[2][8] == 5  && Cube_colors[5][7] == 1 && Cube_colors[5][6] == 1)
        {
            System.out.print("U L U' R U U L' U R' L U' R U U L' U R' U");
        }
        else if(Cube_colors[0][3] == 1 && Cube_colors[0][0] == 1 && Cube_colors[4][1] == 6 && Cube_colors[4][2] == 6 && Cube_colors[2][5] == 3 && Cube_colors[2][8] == 3  && Cube_colors[5][7] == 5 && Cube_colors[5][6] == 5)
        {
            System.out.print("L U' R U U L' U R' L U' R U U L' U R' U'");
        }
        else if(Cube_colors[0][3] == 5 && Cube_colors[0][0] == 5 && Cube_colors[4][1] == 1 && Cube_colors[4][2] == 1 && Cube_colors[2][5] == 6 && Cube_colors[2][8] == 6  && Cube_colors[5][7] == 3 && Cube_colors[5][6] == 3)
        {
            System.out.print("U L U' R U U L' U R' L U' R U U L' U R' U'");
        }//****************************************************************************************************************************************************************************************************************************

        //NB
        else if(Cube_colors[0][6] == 3 && Cube_colors[0][0] == 3 && Cube_colors[4][1] == 5 && Cube_colors[4][0] == 5 && Cube_colors[2][5] == 1 && Cube_colors[2][2] == 1  && Cube_colors[5][8] == 6 && Cube_colors[5][6] == 6)
        {
            System.out.print("R' U L' U U R U' L R' U L' U U R U' L U'");
        }
        else if(Cube_colors[0][6] == 6 && Cube_colors[0][0] == 6 && Cube_colors[4][1] == 3 && Cube_colors[4][0] == 3 && Cube_colors[2][5] == 5 && Cube_colors[2][2] == 5  && Cube_colors[5][8] == 1 && Cube_colors[5][6] == 1)
        {
            System.out.print("U R' U L' U U R U' L R' U L' U U R U' L U'");
        }
        else if(Cube_colors[0][6] == 1 && Cube_colors[0][0] == 1 && Cube_colors[4][1] == 6 && Cube_colors[4][0] == 6 && Cube_colors[2][5] == 3 && Cube_colors[2][2] == 3  && Cube_colors[5][8] == 5 && Cube_colors[5][6] == 5)
        {
            System.out.print("R' U L' U U R U' L R' U L' U U R U' L U");
        }
        else if(Cube_colors[0][6] == 5 && Cube_colors[0][0] == 5 && Cube_colors[4][1] == 1 && Cube_colors[4][0] == 1 && Cube_colors[2][5] == 6 && Cube_colors[2][2] == 6  && Cube_colors[5][8] == 3 && Cube_colors[5][6] == 3)
        {
            System.out.print("U R' U L' U U R U' L R' U L' U U R U' L U");
        }//*****************************************************************************************************************************************************************************************************************************
        return Cube_colors;
    }

    public static int[][] GreenCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[0][0];
        primaryFace[1] = colors[0][1];
        primaryFace[2] = colors[0][2];
        primaryFace[3] = colors[0][3];
        primaryFace[4] = colors[0][4];
        primaryFace[5] = colors[0][5];
        primaryFace[6] = colors[0][6];
        primaryFace[7] = colors[0][7];
        primaryFace[8] = colors[0][8];

        colors[0][2] = primaryFace[0];
        colors[0][5] = primaryFace[1];
        colors[0][8] = primaryFace[2];
        colors[0][1] = primaryFace[3];
        colors[0][4] = primaryFace[4];
        colors[0][7] = primaryFace[5];
        colors[0][0] = primaryFace[6];
        colors[0][3] = primaryFace[7];
        colors[0][6] = primaryFace[8];

        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[40] = colors[4][0];
        primaryOuter[43] = colors[4][3];
        primaryOuter[46] = colors[4][6];
        primaryOuter[10] = colors[1][0];
        primaryOuter[13] = colors[1][3];
        primaryOuter[16] = colors[1][6];
        primaryOuter[50] = colors[5][0];
        primaryOuter[53] = colors[5][3];
        primaryOuter[56] = colors[5][6];
        primaryOuter[38] = colors[3][8];
        primaryOuter[35] = colors[3][5];
        primaryOuter[32] = colors[3][2];

        colors[1][0] = primaryOuter[40];
        colors[1][3] = primaryOuter[43];
        colors[1][6] = primaryOuter[46];
        colors[5][0] = primaryOuter[10];
        colors[5][3] = primaryOuter[13];
        colors[5][6] = primaryOuter[16];
        colors[3][8] = primaryOuter[50];
        colors[3][5] = primaryOuter[53];
        colors[3][2] = primaryOuter[56];
        colors[4][0] = primaryOuter[38];
        colors[4][3] = primaryOuter[35];
        colors[4][6] = primaryOuter[32];

        //now you have to new values ater turning the green clockwise once
        System.out.print("F ");
        return colors;
    }

    public static int[][] GreenCCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[0][0];
        primaryFace[1] = colors[0][1];
        primaryFace[2] = colors[0][2];
        primaryFace[3] = colors[0][3];
        primaryFace[4] = colors[0][4];
        primaryFace[5] = colors[0][5];
        primaryFace[6] = colors[0][6];
        primaryFace[7] = colors[0][7];
        primaryFace[8] = colors[0][8];

        colors[0][6] = primaryFace[0];
        colors[0][3] = primaryFace[1];
        colors[0][0] = primaryFace[2];
        colors[0][7] = primaryFace[3];
        colors[0][4] = primaryFace[4];
        colors[0][1] = primaryFace[5];
        colors[0][8] = primaryFace[6];
        colors[0][5] = primaryFace[7];
        colors[0][2] = primaryFace[8];

        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[40] = colors[4][0];
        primaryOuter[43] = colors[4][3];
        primaryOuter[46] = colors[4][6];
        primaryOuter[10] = colors[1][0];
        primaryOuter[13] = colors[1][3];
        primaryOuter[16] = colors[1][6];
        primaryOuter[50] = colors[5][0];
        primaryOuter[53] = colors[5][3];
        primaryOuter[56] = colors[5][6];
        primaryOuter[38] = colors[3][8];
        primaryOuter[35] = colors[3][5];
        primaryOuter[32] = colors[3][2];

        colors[3][8] = primaryOuter[40];
        colors[3][5] = primaryOuter[43];
        colors[3][2] = primaryOuter[46];
        colors[4][0] = primaryOuter[10];
        colors[4][3] = primaryOuter[13];
        colors[4][6] = primaryOuter[16];
        colors[1][0] = primaryOuter[50];
        colors[1][3] = primaryOuter[53];
        colors[1][6] = primaryOuter[56];
        colors[5][0] = primaryOuter[38];
        colors[5][3] = primaryOuter[35];
        colors[5][6] = primaryOuter[32];

        //now you have to new values ater turning the green clockwise once
        System.out.print("F' ");
        return colors;
    }

    public static int[][] WhiteCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[1][0];
        primaryFace[1] = colors[1][1];
        primaryFace[2] = colors[1][2];
        primaryFace[3] = colors[1][3];
        primaryFace[4] = colors[1][4];
        primaryFace[5] = colors[1][5];
        primaryFace[6] = colors[1][6];
        primaryFace[7] = colors[1][7];
        primaryFace[8] = colors[1][8];

        colors[1][2] = primaryFace[0];
        colors[1][5] = primaryFace[1];
        colors[1][8] = primaryFace[2];
        colors[1][1] = primaryFace[3];
        colors[1][4] = primaryFace[4];
        colors[1][7] = primaryFace[5];
        colors[1][0] = primaryFace[6];
        colors[1][3] = primaryFace[7];
        colors[1][6] = primaryFace[8];

        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[46] = colors[4][6];
        primaryOuter[47] = colors[4][7];
        primaryOuter[48] = colors[4][8];
        primaryOuter[20] = colors[2][0];
        primaryOuter[23] = colors[2][3];
        primaryOuter[26] = colors[2][6];
        primaryOuter[52] = colors[5][2];
        primaryOuter[51] = colors[5][1];
        primaryOuter[50] = colors[5][0];
        primaryOuter[8] = colors[0][8];
        primaryOuter[5] = colors[0][5];
        primaryOuter[2] = colors[0][2];

        colors[2][0] = primaryOuter[46];
        colors[2][3] = primaryOuter[47];
        colors[2][6] = primaryOuter[48];
        colors[5][2] = primaryOuter[20];
        colors[5][1] = primaryOuter[23];
        colors[5][0] = primaryOuter[26];
        colors[0][8] = primaryOuter[52];
        colors[0][5] = primaryOuter[51];
        colors[0][2] = primaryOuter[50];
        colors[4][6] = primaryOuter[8];
        colors[4][7] = primaryOuter[5];
        colors[4][8] = primaryOuter[2];

        //now you have to new values ater turning the White clockwise once
        System.out.print("D ");
        return colors;
    }

    public static int[][] WhiteCCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[1][0];
        primaryFace[1] = colors[1][1];
        primaryFace[2] = colors[1][2];
        primaryFace[3] = colors[1][3];
        primaryFace[4] = colors[1][4];
        primaryFace[5] = colors[1][5];
        primaryFace[6] = colors[1][6];
        primaryFace[7] = colors[1][7];
        primaryFace[8] = colors[1][8];

        colors[1][6] = primaryFace[0];
        colors[1][3] = primaryFace[1];
        colors[1][0] = primaryFace[2];
        colors[1][7] = primaryFace[3];
        colors[1][4] = primaryFace[4];
        colors[1][1] = primaryFace[5];
        colors[1][8] = primaryFace[6];
        colors[1][5] = primaryFace[7];
        colors[1][2] = primaryFace[8];

        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[46] = colors[4][6];
        primaryOuter[47] = colors[4][7];
        primaryOuter[48] = colors[4][8];
        primaryOuter[20] = colors[2][0];
        primaryOuter[23] = colors[2][3];
        primaryOuter[26] = colors[2][6];
        primaryOuter[52] = colors[5][2];
        primaryOuter[51] = colors[5][1];
        primaryOuter[50] = colors[5][0];
        primaryOuter[8] = colors[0][8];
        primaryOuter[5] = colors[0][5];
        primaryOuter[2] = colors[0][2];

        colors[0][8] = primaryOuter[46];
        colors[0][5] = primaryOuter[47];
        colors[0][2] = primaryOuter[48];
        colors[4][6] = primaryOuter[20];
        colors[4][7] = primaryOuter[23];
        colors[4][8] = primaryOuter[26];
        colors[2][0] = primaryOuter[52];
        colors[2][3] = primaryOuter[51];
        colors[2][6] = primaryOuter[50];
        colors[5][2] = primaryOuter[8];
        colors[5][1] = primaryOuter[5];
        colors[5][0] = primaryOuter[2];

        //now you have to new values ater turning the White CounterClokwise once
        System.out.print("D' ");
        return colors;
    }

    public static int[][] BlueCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[2][0];
        primaryFace[1] = colors[2][1];
        primaryFace[2] = colors[2][2];
        primaryFace[3] = colors[2][3];
        primaryFace[4] = colors[2][4];
        primaryFace[5] = colors[2][5];
        primaryFace[6] = colors[2][6];
        primaryFace[7] = colors[2][7];
        primaryFace[8] = colors[2][8];

        colors[2][2] = primaryFace[0];
        colors[2][5] = primaryFace[1];
        colors[2][8] = primaryFace[2];
        colors[2][1] = primaryFace[3];
        colors[2][4] = primaryFace[4];
        colors[2][7] = primaryFace[5];
        colors[2][0] = primaryFace[6];
        colors[2][3] = primaryFace[7];
        colors[2][6] = primaryFace[8];

        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[48] = colors[4][8];
        primaryOuter[45] = colors[4][5];
        primaryOuter[42] = colors[4][2];
        primaryOuter[30] = colors[3][0];
        primaryOuter[33] = colors[3][3];
        primaryOuter[36] = colors[3][6];
        primaryOuter[58] = colors[5][8];
        primaryOuter[55] = colors[5][5];
        primaryOuter[52] = colors[5][2];
        primaryOuter[18] = colors[1][8];
        primaryOuter[15] = colors[1][5];
        primaryOuter[12] = colors[1][2];

        colors[3][0] = primaryOuter[48];
        colors[3][3] = primaryOuter[45];
        colors[3][6] = primaryOuter[42];
        colors[5][8] = primaryOuter[30];
        colors[5][5] = primaryOuter[33];
        colors[5][2] = primaryOuter[36];
        colors[1][8] = primaryOuter[58];
        colors[1][5] = primaryOuter[55];
        colors[1][2] = primaryOuter[52];
        colors[4][8] = primaryOuter[18];
        colors[4][5] = primaryOuter[15];
        colors[4][2] = primaryOuter[12];

        //now you have to new values ater turning the White CounterClokwise once
        System.out.print("B ");
        return colors;
    }

    public static int[][] BlueCCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[2][0];
        primaryFace[1] = colors[2][1];
        primaryFace[2] = colors[2][2];
        primaryFace[3] = colors[2][3];
        primaryFace[4] = colors[2][4];
        primaryFace[5] = colors[2][5];
        primaryFace[6] = colors[2][6];
        primaryFace[7] = colors[2][7];
        primaryFace[8] = colors[2][8];

        colors[2][6] = primaryFace[0];
        colors[2][3] = primaryFace[1];
        colors[2][0] = primaryFace[2];
        colors[2][7] = primaryFace[3];
        colors[2][4] = primaryFace[4];
        colors[2][1] = primaryFace[5];
        colors[2][8] = primaryFace[6];
        colors[2][5] = primaryFace[7];
        colors[2][2] = primaryFace[8];

        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[48] = colors[4][8];
        primaryOuter[45] = colors[4][5];
        primaryOuter[42] = colors[4][2];
        primaryOuter[30] = colors[3][0];
        primaryOuter[33] = colors[3][3];
        primaryOuter[36] = colors[3][6];
        primaryOuter[58] = colors[5][8];
        primaryOuter[55] = colors[5][5];
        primaryOuter[52] = colors[5][2];
        primaryOuter[18] = colors[1][8];
        primaryOuter[15] = colors[1][5];
        primaryOuter[12] = colors[1][2];

        colors[1][8] = primaryOuter[48];
        colors[1][5] = primaryOuter[45];
        colors[1][2] = primaryOuter[42];
        colors[4][8] = primaryOuter[30];
        colors[4][5] = primaryOuter[33];
        colors[4][2] = primaryOuter[36];
        colors[3][0] = primaryOuter[58];
        colors[3][3] = primaryOuter[55];
        colors[3][6] = primaryOuter[52];
        colors[5][8] = primaryOuter[18];
        colors[5][5] = primaryOuter[15];
        colors[5][2] = primaryOuter[12];

        //now you have to new values ater turning the White CounterClokwise once
        System.out.print("B' ");
        return colors;
    }

    public static int[][] YellowCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[3][0];
        primaryFace[1] = colors[3][1];
        primaryFace[2] = colors[3][2];
        primaryFace[3] = colors[3][3];
        primaryFace[4] = colors[3][4];
        primaryFace[5] = colors[3][5];
        primaryFace[6] = colors[3][6];
        primaryFace[7] = colors[3][7];
        primaryFace[8] = colors[3][8];

        colors[3][2] = primaryFace[0];
        colors[3][5] = primaryFace[1];
        colors[3][8] = primaryFace[2];
        colors[3][1] = primaryFace[3];
        colors[3][4] = primaryFace[4];
        colors[3][7] = primaryFace[5];
        colors[3][0] = primaryFace[6];
        colors[3][3] = primaryFace[7];
        colors[3][6] = primaryFace[8];

        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[42] = colors[4][2];
        primaryOuter[41] = colors[4][1];
        primaryOuter[40] = colors[4][0];
        primaryOuter[00] = colors[0][0];
        primaryOuter[03] = colors[0][3];
        primaryOuter[06] = colors[0][6];
        primaryOuter[56] = colors[5][6];
        primaryOuter[57] = colors[5][7];
        primaryOuter[58] = colors[5][8];
        primaryOuter[28] = colors[2][8];
        primaryOuter[25] = colors[2][5];
        primaryOuter[22] = colors[2][2];

        colors[0][0] = primaryOuter[42];
        colors[0][3] = primaryOuter[41];
        colors[0][6] = primaryOuter[40];
        colors[5][6] = primaryOuter[00];
        colors[5][7] = primaryOuter[03];
        colors[5][8] = primaryOuter[06];
        colors[2][8] = primaryOuter[56];
        colors[2][5] = primaryOuter[57];
        colors[2][2] = primaryOuter[58];
        colors[4][2] = primaryOuter[28];
        colors[4][1] = primaryOuter[25];
        colors[4][0] = primaryOuter[22];

        //now you have to new values ater turning the White CounterClokwise once
        System.out.print("U ");
        return colors;
    }

    public static int[][] YellowCCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[3][0];
        primaryFace[1] = colors[3][1];
        primaryFace[2] = colors[3][2];
        primaryFace[3] = colors[3][3];
        primaryFace[4] = colors[3][4];
        primaryFace[5] = colors[3][5];
        primaryFace[6] = colors[3][6];
        primaryFace[7] = colors[3][7];
        primaryFace[8] = colors[3][8];

        colors[3][6] = primaryFace[0];
        colors[3][3] = primaryFace[1];
        colors[3][0] = primaryFace[2];
        colors[3][7] = primaryFace[3];
        colors[3][4] = primaryFace[4];
        colors[3][1] = primaryFace[5];
        colors[3][8] = primaryFace[6];
        colors[3][5] = primaryFace[7];
        colors[3][2] = primaryFace[8];

        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[42] = colors[4][2];
        primaryOuter[41] = colors[4][1];
        primaryOuter[40] = colors[4][0];
        primaryOuter[00] = colors[0][0];
        primaryOuter[03] = colors[0][3];
        primaryOuter[06] = colors[0][6];
        primaryOuter[56] = colors[5][6];
        primaryOuter[57] = colors[5][7];
        primaryOuter[58] = colors[5][8];
        primaryOuter[28] = colors[2][8];
        primaryOuter[25] = colors[2][5];
        primaryOuter[22] = colors[2][2];

        colors[2][8] = primaryOuter[42];
        colors[2][5] = primaryOuter[41];
        colors[2][2] = primaryOuter[40];
        colors[4][2] = primaryOuter[00];
        colors[4][1] = primaryOuter[03];
        colors[4][0] = primaryOuter[06];
        colors[0][0] = primaryOuter[56];
        colors[0][3] = primaryOuter[57];
        colors[0][6] = primaryOuter[58];
        colors[5][6] = primaryOuter[28];
        colors[5][7] = primaryOuter[25];
        colors[5][8] = primaryOuter[22];

        //now you have to new values ater turning the White CounterClokwise once
        System.out.print("U' ");
        return colors;
    }

    public static int[][] OrangeCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[4][0];
        primaryFace[1] = colors[4][1];
        primaryFace[2] = colors[4][2];
        primaryFace[3] = colors[4][3];
        primaryFace[4] = colors[4][4];
        primaryFace[5] = colors[4][5];
        primaryFace[6] = colors[4][6];
        primaryFace[7] = colors[4][7];
        primaryFace[8] = colors[4][8];

        colors[4][2] = primaryFace[0];
        colors[4][5] = primaryFace[1];
        colors[4][8] = primaryFace[2];
        colors[4][1] = primaryFace[3];
        colors[4][4] = primaryFace[4];
        colors[4][7] = primaryFace[5];
        colors[4][0] = primaryFace[6];
        colors[4][3] = primaryFace[7];
        colors[4][6] = primaryFace[8];

        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[32] = colors[3][2];
        primaryOuter[31] = colors[3][1];
        primaryOuter[30] = colors[3][0];
        primaryOuter[22] = colors[2][2];
        primaryOuter[21] = colors[2][1];
        primaryOuter[20] = colors[2][0];
        primaryOuter[12] = colors[1][2];
        primaryOuter[11] = colors[1][1];
        primaryOuter[10] = colors[1][0];
        primaryOuter[02] = colors[0][2];
        primaryOuter[01] = colors[0][1];
        primaryOuter[00] = colors[0][0];

        colors[2][2] = primaryOuter[32];
        colors[2][1] = primaryOuter[31];
        colors[2][0] = primaryOuter[30];
        colors[1][2] = primaryOuter[22];
        colors[1][1] = primaryOuter[21];
        colors[1][0] = primaryOuter[20];
        colors[0][2] = primaryOuter[12];
        colors[0][1] = primaryOuter[11];
        colors[0][0] = primaryOuter[10];
        colors[3][2] = primaryOuter[02];
        colors[3][1] = primaryOuter[01];
        colors[3][0] = primaryOuter[00];

        //now you have to new values ater turning the White CounterClokwise once
        System.out.print("R ");
        return colors;
    }

    public static int[][] OrangeCCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[4][0];
        primaryFace[1] = colors[4][1];
        primaryFace[2] = colors[4][2];
        primaryFace[3] = colors[4][3];
        primaryFace[4] = colors[4][4];
        primaryFace[5] = colors[4][5];
        primaryFace[6] = colors[4][6];
        primaryFace[7] = colors[4][7];
        primaryFace[8] = colors[4][8];

        colors[4][6] = primaryFace[0];
        colors[4][3] = primaryFace[1];
        colors[4][0] = primaryFace[2];
        colors[4][7] = primaryFace[3];
        colors[4][4] = primaryFace[4];
        colors[4][1] = primaryFace[5];
        colors[4][8] = primaryFace[6];
        colors[4][5] = primaryFace[7];
        colors[4][2] = primaryFace[8];

        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[32] = colors[3][2];
        primaryOuter[31] = colors[3][1];
        primaryOuter[30] = colors[3][0];
        primaryOuter[22] = colors[2][2];
        primaryOuter[21] = colors[2][1];
        primaryOuter[20] = colors[2][0];
        primaryOuter[12] = colors[1][2];
        primaryOuter[11] = colors[1][1];
        primaryOuter[10] = colors[1][0];
        primaryOuter[02] = colors[0][2];
        primaryOuter[01] = colors[0][1];
        primaryOuter[00] = colors[0][0];

        colors[0][2] = primaryOuter[32];
        colors[0][1] = primaryOuter[31];
        colors[0][0] = primaryOuter[30];
        colors[3][2] = primaryOuter[22];
        colors[3][1] = primaryOuter[21];
        colors[3][0] = primaryOuter[20];
        colors[2][2] = primaryOuter[12];
        colors[2][1] = primaryOuter[11];
        colors[2][0] = primaryOuter[10];
        colors[1][2] = primaryOuter[02];
        colors[1][1] = primaryOuter[01];
        colors[1][0] = primaryOuter[00];

        //now you have to new values ater turning the White CounterClokwise once
        System.out.print("R' ");
        return colors;
    }

    public static int[][] RedCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[5][0];
        primaryFace[1] = colors[5][1];
        primaryFace[2] = colors[5][2];
        primaryFace[3] = colors[5][3];
        primaryFace[4] = colors[5][4];
        primaryFace[5] = colors[5][5];
        primaryFace[6] = colors[5][6];
        primaryFace[7] = colors[5][7];
        primaryFace[8] = colors[5][8];

        colors[5][2] = primaryFace[0];
        colors[5][5] = primaryFace[1];
        colors[5][8] = primaryFace[2];
        colors[5][1] = primaryFace[3];
        colors[5][4] = primaryFace[4];
        colors[5][7] = primaryFace[5];
        colors[5][0] = primaryFace[6];
        colors[5][3] = primaryFace[7];
        colors[5][6] = primaryFace[8];

        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[16] = colors[1][6];
        primaryOuter[17] = colors[1][7];
        primaryOuter[18] = colors[1][8];
        primaryOuter[26] = colors[2][6];
        primaryOuter[27] = colors[2][7];
        primaryOuter[28] = colors[2][8];
        primaryOuter[36] = colors[3][6];
        primaryOuter[37] = colors[3][7];
        primaryOuter[38] = colors[3][8];
        primaryOuter[6] = colors[0][6];
        primaryOuter[7] = colors[0][7];
        primaryOuter[8] = colors[0][8];

        colors[2][6] = primaryOuter[16];
        colors[2][7] = primaryOuter[17];
        colors[2][8] = primaryOuter[18];
        colors[3][6] = primaryOuter[26];
        colors[3][7] = primaryOuter[27];
        colors[3][8] = primaryOuter[28];
        colors[0][6] = primaryOuter[36];
        colors[0][7] = primaryOuter[37];
        colors[0][8] = primaryOuter[38];
        colors[1][6] = primaryOuter[6];
        colors[1][7] = primaryOuter[7];
        colors[1][8] = primaryOuter[8];

        //now you have to new values ater turning the White CounterClokwise once
        System.out.print("L ");
        return colors;
    }

    public static int[][] RedCCW(int colors[][])
    {
        //First you have to change the face parts
        int[] primaryFace = new int[62];
        primaryFace[0] = colors[5][0];
        primaryFace[1] = colors[5][1];
        primaryFace[2] = colors[5][2];
        primaryFace[3] = colors[5][3];
        primaryFace[4] = colors[5][4];
        primaryFace[5] = colors[5][5];
        primaryFace[6] = colors[5][6];
        primaryFace[7] = colors[5][7];
        primaryFace[8] = colors[5][8];

        colors[5][6] = primaryFace[0];
        colors[5][3] = primaryFace[1];
        colors[5][0] = primaryFace[2];
        colors[5][7] = primaryFace[3];
        colors[5][4] = primaryFace[4];
        colors[5][1] = primaryFace[5];
        colors[5][8] = primaryFace[6];
        colors[5][5] = primaryFace[7];
        colors[5][2] = primaryFace[8];

        //Then you have to change the outer parts
        int[] primaryOuter = new int[62];
        primaryOuter[16] = colors[1][6];
        primaryOuter[17] = colors[1][7];
        primaryOuter[18] = colors[1][8];
        primaryOuter[26] = colors[2][6];
        primaryOuter[27] = colors[2][7];
        primaryOuter[28] = colors[2][8];
        primaryOuter[36] = colors[3][6];
        primaryOuter[37] = colors[3][7];
        primaryOuter[38] = colors[3][8];
        primaryOuter[6] = colors[0][6];
        primaryOuter[7] = colors[0][7];
        primaryOuter[8] = colors[0][8];

        colors[0][6] = primaryOuter[16];
        colors[0][7] = primaryOuter[17];
        colors[0][8] = primaryOuter[18];
        colors[1][6] = primaryOuter[26];
        colors[1][7] = primaryOuter[27];
        colors[1][8] = primaryOuter[28];
        colors[2][6] = primaryOuter[36];
        colors[2][7] = primaryOuter[37];
        colors[2][8] = primaryOuter[38];
        colors[3][6] = primaryOuter[6];
        colors[3][7] = primaryOuter[7];
        colors[3][8] = primaryOuter[8];

        //now you have to new values ater turning the White CounterClokwise once
        System.out.print("L' ");
        return colors;
    }


}
