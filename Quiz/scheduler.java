
 import java.awt.*;
 import java.awt.event.*;
 import java.util.Random;
 import javax.swing.*;
 import java.sql.*;

 class detail
 {
  static int show;   //show log file or not
  static int mode;   //whehther normal or debugging mode
  static int output=1; //whether output=1 for subject name 2 for subject code
  static int random=1; // random placement of period else sequecial placement
 }
 class backtrack
 {
 int internal_id=0;
 int perioddd[]=new int[300];
 int periodSetted[]=new int[300];
 int backtrack_no;
 int no_of_backtrack;
 int class_id;  // class id and subject_id is equal to subject[i][j];
 int subject_id;
 int round[]=new int[300];
 int day[]=new int[300];
 int period[]=new int[300];
 int no_continous_period;
 int position_of_lab_in_group;
backtrack()
{
backtrack_no=0;
no_of_backtrack=0;
for(int q=0;q<300;q++)
{
  perioddd[q]=0;
  periodSetted[q]=0;
}
for(int q=0;q<300;q++)
{
round[q]=1;
day[q]=0;
period[q]=0;

}
subject_id=0;
class_id=0;

no_continous_period=0;
position_of_lab_in_group=0;
}

}
class lab_info
{
static int parallel_possible=1;
static int no_parallel_possible=2;
static int session=1; // 0 for any session ,1 for start of session, 2 for end of session
static int labDays=1; // 0 for any day(even in same day),1 for not in same day;
static int  labSessions=1;//0 for any way(consecutive or alternate session ),1 for alternate sessions,2 for consecutive sessions,
static int labSessions_prior=2; //0 for any way (computer choice,1 for morning consecutive,2 for afternoon consecutive
}

class schedule
{

int setted;
String subject_id;
String staff_id[]=new String[20];
int no_of_staff;
int round;
//int round[]=new int[10];
schedule()
{
setted=0;
subject_id="NULL";
round=1;
}
}
	class time_table
	{
public  String class_name;
public  String subject_code  ;
public int round;
public int setted;
public int internal_id;
public int period[];
public int periodSetted[];
public int periodSettedDetail[][];
               public int specialBit=0;
		public	int class_no;
		public int subject_id;
		public int group_id;
		public int individual_id;
	        public  int special_form;
		public 	int reserve_form;
		public	int  ordinary_form;
		public	int lab;
            public      int  position_of_lab_in_group;

		public	int serialno;
		public	int priority;
		public	int no_of_staff;
		public	String staff_name[];
		public	String staff_id[];
		public	int no_continuous_period;
            public       int continuous[];
            public      int continuous_period;
		public	int no_of_period;
	//	public	int a[][];
		public	int priority_set;
		public	int generic_priority;
		public	int specific_priority;
		public	int no_of_specific_period;
		public	int specific_day_selected_priority;
		public	String b[][];
		public	int specific_period_selected_priority;
	//	public	String c[][];
		public	int specific_session_selected_priority;
	//	public	String d[][];
		public  int specific_continuous[]=new int[50];
		public	int no_of_general_period;
		public	int general_day_selected_priority;
		public	String e[][];
		public	int general_session_selected_priority;
	//	public	int f[][];
		public	int general_period_selected_priority;
	//	public	int g[][];
		public	int non_attendable;
		public	int general_non_attendable;
		public	int specific_non_attendable;
		public	int no_of_general_non_attendable;
		public	int no_of_specific_non_attendable;
		public	int general_day_selected_non_attendable;
		public	String h[][];
		public	int general_session_selected_non_attendable;
	//	public	int i[][];
		public	int general_period_selected_non_attendable;
	//	public	int j[][];
		public	int specific_day_selected_non_attendable;
		public	String k[][];
		public	int specific_session_selected_non_attendable;
	//	public	int l[][];
                public  int specific_period_selected_non_attendable;
	//	public	int m[][];

                time_table()
                {
round=1;
periodSettedDetail=new int[100][5];
periodSetted=new int[100];
internal_id=0;
setted=0;
group_id=0;
class_no=0;
special_form=0;
reserve_form=0;
ordinary_form=0;
lab=0;
serialno=0;
priority=0;
no_of_staff=0;
staff_name=new String[20];
staff_id=new String[20];
no_continuous_period=0;

continuous=new int[20];
period=new int[100];
for(int uu=0;uu<100;uu++)
{
 period[uu]=0;
 periodSetted[uu]=0;
}
for(int uu=0;uu<20;uu++)
{
 continuous[uu]=1;
}
continuous_period=0;
no_of_period=0;
//a=new int[50][50];
priority_set=0;
generic_priority=0;
specific_priority=0;
no_of_specific_period=0;
specific_day_selected_priority=0;
b=new String[50][5];
for( int oo=0;oo<50;oo++)
{
  for( int ee=0;ee<4;ee++)
  {
    b[oo][ee]="NULL";
  }
}
specific_period_selected_priority=0;
//c=new String[50][50];
specific_session_selected_priority=0;
//d=new String[50][50];
no_of_general_period=0;
general_day_selected_priority=0;
e=new String[50][5];
for( int oo=0;oo<50;oo++)
{
  for( int ee=0;ee<4;ee++)
  {
    e[oo][ee]="NULL";
  }
}
general_session_selected_priority=0;
//f=new int[50][50];
general_period_selected_priority=0;
//g=new int[50][50];
non_attendable=0;
general_non_attendable=0;
specific_non_attendable=0;
no_of_general_non_attendable=0;
no_of_specific_non_attendable=0;
general_day_selected_non_attendable=0;
h=new String[50][5];
for( int oo=0;oo<50;oo++)
{
  for( int ee=0;ee<4;ee++)
  {
    h[oo][ee]="NULL";
  }
}
general_session_selected_non_attendable=0;
//i=new int[50][50];
general_period_selected_non_attendable=0;
//j=new int[50][50];
specific_day_selected_non_attendable=0;
k=new String[50][5];
for( int oo=0;oo<50;oo++)
{
  for( int ee=0;ee<4;ee++)
  {
    k[oo][ee]="NULL";
  }
}
			specific_session_selected_non_attendable=0;
	//		l=new int[50][50];
                        specific_period_selected_non_attendable=0;
	  //       	m=new int[50][50];
               	}
      		public void set_reserve_form(int reserve_form)
              	{
this.reserve_form=reserve_form;
System.out.println(this.reserve_form);
                }
      		public int put_reserve_form()
             	{
                	return(this.reserve_form);
              	}
        }
	class class_structure
	{
int class_no;
int class_name;
int a[][]=new int[50][50];


	}


class staff_structure
	{       public  String subjectcode[]=new String[50];

		public	int setted;
                public  int validate_no_period; 
		public	String staff_id;
		public	String staff_name;
		public	String subject_code;
                public  int no_of_subject_handled=0;
		public	int setted_no;
		public String  a[][]=new String[10][50];//staff id
		public int b[][]=new int[10][50];
            public int round;
           staff_structure()
                {
                    setted=0;
                    validate_no_period=0;   
                }
	}
        class subjects
        {
static String subject_name[]=new String[300];
static String subject_id[]=new String[300];
static int no_of_period[]=new int[300];
static int total_subject;


        }
	class info
 	{
static String name[]=new String[300];
static int no_of_subject[]=new int[300];
                static String subject_name[][]=new String[50][100];
static String subject_id[][]=new String[50][100];
static int no_of_period[][]=new int[50][100];
static int no_of_classes;
static int total_no_of_subject;
static String staffid[]=new String[300];
static int total_no_of_staff;
static String staff_name[]=new String[300];
 	}

  	class scheduler
     extends Frame implements ActionListener,ItemListener
 	{
CardLayout cl;
Panel p1 = new Panel();
	        Panel p4 = new Panel();
        	int c=1;
int k=0;
Button b1,b2,b3,b4;
        editt2 ee=new editt2(this);
        editt3 ee3=new editt3(this);
        options op=new options(this);
        pan1 p2 = new pan1(this);
   			 pan2 p3 = new pan2(this);
   			pan5 p5 = new pan5(this);


         MenuBar mb;
    Menu m,m1,m2,m3;
    MenuItem mi1,mi2,mf1,mf2,mf3,mf4;
    CheckboxMenuItem me1,me2,mg1,mg2,mg3;

  		scheduler()
		{
   			super("                         SCHEDULER");
 //********************************************************

   //   setResizable(false);
        mb=new MenuBar();
        setMenuBar(mb);
        m=new Menu("File");
        mb.add(m);
        mi1=new MenuItem("Save");
        mi2=new MenuItem("Print");
        m.add(mi1);
        m.add(mi2);
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        m1=new Menu("Edit");
        mb.add(m1);
        me1=new CheckboxMenuItem("Form2");
        me2=new CheckboxMenuItem("Form3");
        //me3=new MenuItem("Form 3");

        m1.add(me1);
        m1.add(me2);
        //m1.add(me3);
        me1.addItemListener(this);
        me2.addItemListener(this);
        //me3.addActionListener(this);
        m2=new Menu("Options");
        mb.add(m2);
        mf1=new MenuItem("General");
        mf2=new MenuItem("Specific");
        m2.add(mf1);
        m2.add(mf2);
        mf1.addActionListener(this);
        mf2.addActionListener(this);
        m3=new Menu("View");
        mb.add(m3);
        mg1=new CheckboxMenuItem("Form 1");
        mg2=new CheckboxMenuItem("Form 2");
        mg3=new CheckboxMenuItem("Form 3");
        m3.add(mg1);
        m3.add(mg2);
        m3.add(mg3);
        mg1.setState(true);
        mg1.addItemListener(this);
        mg2.addItemListener(this);
        mg3.addItemListener(this);
   /*     setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {

    }

     */

 //*********************************************************


			cl = new CardLayout();
   			setLayout(new BorderLayout());
    			setSize(700,550);
   		/*	pan1 p2 = new pan1();
   			 pan2 p3 = new pan2();
   			pan5 p5 = new pan5(); */
   			p1.setLayout(cl);
   			add(p1,BorderLayout.CENTER);

			b1 = new Button("NEXT");
 			b2 = new Button("BACK");
 			b3 = new Button("EDIT");
 			b4 = new Button("OPTION");
   		add(p4,BorderLayout.NORTH);
	    p4.setLayout(new GridLayout(1,3));

   			p1.add("pan3",p3);
   			p1.add("pan5",p5);
   			p1.add("pan2",p2);

          setSize(800,550);
     			setVisible(true);

		}
    public void itemStateChanged(ItemEvent ie)
    {
    System.out.println("item");
    CheckboxMenuItem cb=(CheckboxMenuItem )ie.getSource();
    if(cb==mg1)
      {
       System.out.println("form1");
       cl.show(p1,"pan3");
         c=1;
         mg2.setState(false);
         mg3.setState(false);
      }
     if(cb==mg2)
      {
       System.out.println("form2");
       cl.show(p1,"pan5");
         c=2;
         mg1.setState(false);
         mg3.setState(false);
      }
     if(cb==mg3)
      {
       System.out.println("form3");
       cl.show(p1,"pan2");
         c=3;
         mg1.setState(false);
         mg2.setState(false);
      }
      if(cb==me1)
      {
       System.out.println("edit form2");
       if(c==2)
         {
           System.out.println("edit2 is presses");

           ee.setVisible(true);
          }
         me2.setState(false);
      }
      if(cb==me2)
      {
       System.out.println("edit form3");
         if(c==3)
         {
        System.out.println("edit3 is presses");

        ee3.setVisible(true);
        }
        me1.setState(false);
      }

    }
		public void actionPerformed(ActionEvent ae)
		{
 			MenuItem s =(MenuItem)ae.getSource();
        System.out.println(" action performed "+s);



		  if(s==mf1)
      {
         op.setVisible(true);
      }

		}
        public void notice(int form2)
    {
        System.out.println(" the main ok "+form2);
        if(form2==1)
        {
          cl.show(p1,"pan5");
         c=2;
         mg1.setState(false);
         mg3.setState(false);

        }
        if(form2==2)
        {
           System.out.println("form3");
           p5.database();
           mg2.disable();
       if(pan1.error==0)
      {
       cl.show(p1,"pan2");
         c=3;
         mg1.setState(false);
         mg2.setState(false);
         mg3.enable();
         mg3.setState(true);
       }
        else
        {
         mg1.setState(true);
         mg2.setState(false);
         mg3.setState(false);
         mg3.disable();  
        }

        }
        if(form2==3)
        {
          System.out.println("form3");
       cl.show(p1,"pan2");
         c=3;
         mg1.setState(false);
         mg2.setState(false);
        }
    }

		public static void main(String arg[])
		{
			scheduler h = new scheduler();
		}
 }
//********************************************************************
  class Mycanvas extends Canvas implements FocusListener
  {
     log2 www;
      String str="hai";
      int y=0;
      float x=0;
      static int i=1;
   Mycanvas(log2 www)
    {
     this.www=www;
     setBounds(7,7,230,20);

     addFocusListener(this);
          //  repaint();
    }
    public void drawstring(String str,int x,int y,int x1,int y1)
    {
      //  this.setBackground(new Color(10,20,20));
        //this.setForeground(new Color(10,20,250));
        www.app(" drawstring entered");
        System.out.println("drawstring enteered");
        Graphics ggg=        getGraphics();
     }
    public void focusGained(FocusEvent fe)
    {
     //www.app("focus gained");
     repaint();
    }
    public void focusLost(FocusEvent fe)
    {
     //www.app("focus lost");
    }
    public void draw(float x,float total)
    {  x--;
       this.x=x;
       this.validate();
       Graphics gg=getGraphics();
         float iv=(x/total);   
     
        float  div=(iv*iv*iv)*235; 
         
        for(int i=0;i<=22;i++)
     {
       gg.drawLine(0,i,(int)div,i);
     }
          this.requestFocus();
    
    }

  }


                           /*   form 3   */
/**********************************************************************************************************/
	class pan1 extends Panel implements ActionListener,ItemListener,FocusListener,KeyListener
	{
     static int error=0;
     int finished=0;
     Canvas can;
     Mycanvas can1;
       Label fg1,fg2;
     Label e1,e2,e3,e4,e5;
  		Label l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l30,l40,l50,l51,lab;
		Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,check1,check3,check4,check2,check5,check6,check7,check8,check9,check10,check11,check12;
		TextField tf1,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16;
		Panel  np,sp,ep,wp,cp,emp,emp1,emp2,emp3,emp4,ap,ap1,ap2,ap3,p1,p2,p3,p4,p5,p0;
		Panel add1,add2,add3,add4,pp1,pp2,pp3,pp4,ppp;
		Button b1,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b17,b18,b30,b40,b41;
		Choice ch,ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10,ch11,ch12,ch30,ch40,ch50,chhh;
		String s;
    Frame parent;
     int max_limit=0, cont_enter=0;
     static int esc_key=0,div;
            int current_backtrack_no=0;
        	class_structure  classes[]=new class_structure[50];
	        staff_structure  ss[]=new staff_structure[100];
			schedule sch[][][]=new schedule[50][7][20];
      log2 www=new log2();
                  backtrack bb[]=new backtrack[300];

/*object to time table class is subject[][]  */
          Random r=new Random();
        	time_table subject[][];
                int count=1;
                int total_intid=0;
                static int no_of_round=0;
                int k=0,kk=0,counter_class=0,serial_no=0,special_period_flag=0,lab_counter=0;
                  int  ALL = 100;
                 int unable_to_set=0;
                  int back_set=0,max_backtrack_no=0;
                int counter=0,ct=0;
              	int init_counter=0,no_of_specific_period=0 ,no_of_general_period=0   ;
		int no_of_general_non_attendable=0,no_of_specific_non_attendable=0;
            int no_continuous_period=0;
 int class_limit=0,subject_limit=0;
  disp ddd = new disp();
  error qqq;
int temp[]=new int[1000];
int unique_day[]=new int[10];
int dayyy[]=new int[200],perioddd[]=new int[200];
int alloted_day[]=new int[200];
int  alloted_period[]=new int[200];
int alloted_continuous[]=new int[200];
int current_day=100,current_period=100;
static int yd=0;
int int_ud=0;
//

         	pan1(Frame parent)
		{

           this.parent=parent;
           qqq=new error(parent,"ERROR");
        	 subject=new time_table[50][100];
setSize(800,650);
setLayout(new BorderLayout());
	        setBackground(new Color(157,248,140));
	        setForeground(new Color(1,2,63));

	        b17=new Button("NEXT");
        	b18=new Button("READY");
	        b30=new Button("CONT1");
        	ch30=new Choice();
          ch30.setSize(50,30);
          ch30.resize(70,50);
			b40=new Button("CONTINUESS");
                        Font f=new Font("SansSerif",Font.PLAIN,20);
                        
                        l50=new Label("no of period");
                        l50.setFont(f); 
                        l51=new Label("no of remaining per");
			l51.setFont(f);
			b41=new Button("EXITS");
			l40=new Label("CLASS NAME");
			ch40=new Choice();
			ch50=new Choice();
			//ch50.addItem("1");
			//ch50.addItem("2");
			//ch50.addItem("3");
			//ch50.addItem("4");
			//ch50.addItem("5");
	        l30=new Label("STAFF ID");
                tf16=new TextField(10);
CheckboxGroup  cg=new CheckboxGroup( );
CheckboxGroup  mg=new CheckboxGroup( );
CheckboxGroup  ng=new CheckboxGroup( );
CheckboxGroup  og=new CheckboxGroup( );
CheckboxGroup  ccc=new CheckboxGroup( );

	np=new Panel(new GridLayout(3,1));
	emp1=new Panel();
	emp2=new Panel();
	emp3=new Panel();
	emp4=new Panel();

   	// emp4
	l50 .setForeground(new Color(250,0,250));
	l51.setForeground(new Color(250,0,250));
          Font f1=new Font("SansSerif",Font.PLAIN,16);
         fg1=new Label("NO OF PERIOD = ");
         fg2=new Label("PERIOD AVAILABLE = ");
         fg1.setForeground(new Color(210,20,20));
         fg2.setForeground(new Color(210,20,20));
	fg1.setFont(f1);
        emp4.add(fg1);
        emp4.add(l50);
	fg2.setFont(f1);
        emp4.add(fg2);
	//p0.add(b41);
        emp4.add(l51);
	np.add(emp4);
	
	//emp2
	c5=new Checkbox("reservedPeriod");
	c5.addItemListener(this);
	c5.addFocusListener(this);
	emp2.add(c5);
	c6=new Checkbox("specialPeriod");
	//c6.addItemListener(this);
	//emp2.add(c6);
	l1=new Label("subjectCode");
	emp2.add(l1);
	tf1=new TextField(15);
	emp2.add(tf1);
	Panel p=new Panel();
	l2=new Label("class");
	p.add(l2);
	p.add(tf16);
	c1=new Checkbox("lab y/n");
	c1.addItemListener(this);
	p.add(c1);
	emp2.add(p);
	np.add(emp2);

	//emp3
	l3=new Label("no.ofStaffUnderTaking");
	emp3.add(l3);
	chhh =new Choice();
	emp3.add(chhh);
	//tf2=new TextField(15);
	//emp3.add(tf2);
	c2=new Checkbox("forContinuousPeriod");
	c2.addItemListener(this);
	emp3.add(c2);
	c3=new Checkbox("any priority");
	c3.addItemListener(this);
	emp3.add(c3);
	c4=new Checkbox("anyNotAttendableperiod");
	c4.addItemListener(this);
	emp3.add(c4);
	np.add(emp3);

	//** add emp2,emp3,emp4 in np and add it in north of borderlayout

 	add(np,BorderLayout.NORTH);

//** create south panel

sp=new Panel(new GridLayout(2,1));
e1=new Label("    ");
e2=new Label("     ");
e3=new Label("     ");
e4=new Label("     ");
e5=new Label("          ");
Label e6=new Label("             progress bar  ");
pp1=new Panel(new GridLayout(1,4));
sp.add(pp1);
pp2=new Panel(new GridLayout(1,2));
sp.add(pp2);

pp1.add(e1);
b1=new Button(" OK ");
b1.addActionListener(this);
b17.addActionListener(this);
b18.addActionListener(this);
b30.addActionListener(this);
b40.addActionListener(this);
pp1.add(b1);
pp1.add(b17);
pp1.add(b18);

//pp3=new Panel();
pp1.add(e2);
//ppp=new Panel();
//sp.add(ppp);

pp4=new Panel(new BorderLayout());
pp4.setBackground(new Color(250,30,100));
can1=new Mycanvas(www);
can1.setBackground(new Color(250,250,250));
e3.setBackground(new Color(85,128,141));
e4.setBackground(new Color(85,128,141));
e5.setBackground(new Color(85,128,141));
e6.setBackground(new Color(85,128,141));
//can1.setBackground(new Color(85,128,141));
//pp4.add(e3,BorderLayout.NORTH);
//pp4.add(e4,BorderLayout.SOUTH);
pp4.add(can1,BorderLayout.CENTER);
pp4.add(e5,BorderLayout.EAST);
pp4.add(e6,BorderLayout.WEST);
lab=new Label("status bar");
lab.setBackground(new Color(85,128,141));

pp2.add(lab);

pp2.add(pp4);
//sp.add(pp4);
/*sp.add(pp4);
sp.add(e3);
sp.add(e4);
sp.add(e5);*/
//add(sp,BorderLayout.SOUTH);

ep=new Panel();
//add(ep,BorderLayout.EAST);

wp=new Panel();
//add(wp,BorderLayout.WEST);

  //** in center panel created p1,p2,p3,p4

cp=new Panel(new BorderLayout());
Panel cpp=new Panel(new GridLayout(3,1,10,10));
cp.add(cpp,BorderLayout.NORTH);
Panel cppp=new Panel(new GridLayout(3,1,10,10));
cp.add(cppp,BorderLayout.CENTER);
Panel cpppp=new Panel(new GridLayout(3,1,10,10));
cp.add(cpppp,BorderLayout.SOUTH);


	/*staff id in north*/
		Panel ppp4=new Panel();
		ppp4.add(l30);
		ppp4.add(ch30);
		ppp4.add(b30);
		cpp.add(ppp4);

	/*for continuous period in north*/
		p1=new Panel();
		l5=new Label("noOfContinuousPeriod");     
		l5.disable();
		p1.add(l5);
		ch=new Choice();
		ch.disable();
		p1.add(ch);
		b5=new Button("CONT2");
		b5.disable();
		p1.add(b5);
		b6=new Button("EXT2");
		b6.disable();
		p1.add(b6);
		cpp.add(p1);	
		Panel extending1=new Panel();
		cpp.add(extending1);

	/*generic in center */
		Panel gen1=new Panel(new GridLayout(1,13,5,5));
		c7=new Checkbox("generic",ccc,true);
		c7.addItemListener(this);
		c7.disable();
		check1=new Checkbox("",mg,true);
		check1.addItemListener(this);
		gen1.add(c7);
		gen1.add(check1);
		l6=new Label("day");
		l6.disable();
		gen1.add(l6);
		ch1=new Choice();
		ch1.add("monday");
		ch1.add("tuesday");
		ch1.add("thursday");
		ch1.add("wednesday");
		ch1.add("friday");
		ch1.add("saturday");
		ch1.add("sunday");
		ch1.disable();
		gen1.add(ch1);
		check2=new Checkbox("",mg,false);
		check2.addItemListener(this);
		gen1.add(check2);
		l7=new Label("Session");
		l7.disable();
		gen1.add(l7);
		ch5=new Choice();
		ch5.add("session-I");
		ch5.add("session-II");
		ch5.disable();
		gen1.add(ch5);
		check3=new Checkbox("",mg,false);
		check3.addItemListener(this);
		gen1.add(check3);
		l8=new Label("Period");
		l8.disable();
		gen1.add(l8);
		ch9=new Choice();
		//ch10=new Choice();
		ch9.disable();
		gen1.add(ch9);
		b7=new Button("CONT3");
		b7.setSize(20,30);
		b7.disable();
		gen1.add(b7);
		b8=new Button("EXT3");
		b8.disable();
		gen1.add(b8);		
		Label empty1=new Label("   ");
		gen1.add(empty1);
		cppp.add(gen1);


	/* specific in center */
		Panel spec1=new Panel(new GridLayout(1,12,5,5));
		c8=new Checkbox("specific",ccc,false);
		c8.addItemListener(this);
		c8.disable();
		spec1.add(c8);
		check4=new Checkbox("");
		check4.addItemListener(this);
		spec1.add(check4);
		l0=new Label("day");
		l0.disable();
		spec1.add(l0);
		ch2=new Choice();
		ch2.add("monday");
		ch2.add("tuesday");
		ch2.add("thursday");
		ch2.add("wednesday");
		ch2.add("friday");
		ch2.add("saturday");
		ch2.add("sunday");
		ch2.disable();
		spec1.add(ch2);
		check5=new Checkbox("",cg,true);
		check5.addItemListener(this);
		spec1.add(check5);
		l9=new Label("Session");
		l9.disable();
		spec1.add(l9);
		ch6=new Choice();
		ch6.add("session-I");
		ch6.add("session-II");
		ch6.disable();
		spec1.add(ch6);
		check6=new Checkbox("",cg,false);
		check6.addItemListener(this);
		spec1.add(check6);
		l10=new Label("Period");
		l10.disable();
		spec1.add(l10);
		ch10=new Choice();
		ch10.disable();
		spec1.add(ch10);
		b9=new Button("CONT4");
		b9.disable();
		spec1.add(b9);
		b10=new Button("EXT4");
		b10.disable();
		spec1.add(b10);
		spec1.add(ch50);
		cppp.add(spec1);
		Panel extending2=new Panel();
		cppp.add(extending2);


	/* generic in south */		
		Panel gen2=new Panel(new GridLayout(1,13,5,5));
		c9=new Checkbox("generic");
		c9.addItemListener(this);
		c9.disable();
		gen2.add(c9);
    		check7=new Checkbox("",ng,true);
		check7.addItemListener(this);
		gen2.add(check7);
		l11=new Label("day");
		l11.disable();
		gen2.add(l11);
		ch3=new Choice();
		ch3.add("monday");
		ch3.add("tuesday");
		ch3.add("thursday");
		ch3.add("wednesday");
		ch3.add("friday");
		ch3.add("saturday");
		ch3.disable();
		gen2.add(ch3);
    		check8=new Checkbox("",ng,false);
		check8.addItemListener(this);
		gen2.add(check8);
		l12=new Label("Session");
		l12.disable();
		gen2.add(l12);
		ch7=new Choice();
		ch7.add("session-I");
		ch7.add("session-II");
		ch7.disable();
		gen2.add(ch7);
		check9=new Checkbox("",ng,false);
		check9.addItemListener(this);
		gen2.add(check9);
		l13=new Label("forPeriod");
		l13.disable();
		gen2.add(l13);
		ch11=new Choice();
                ch11.disable();
		gen2.add(ch11);
		b11=new Button("CONT5");
		b11.disable();
		gen2.add(b11);
		b12=new Button("EXT5");
		b12.disable();
		gen2.add(b12);
		Label empty2=new Label("   ");
		gen2.add(empty2);
		cpppp.add(gen2);

	/* specific in south */
		Panel spec2=new Panel(new GridLayout(1,13,5,5));
		c10=new Checkbox("specific");
		c10.disable();
		c10.addItemListener(this);
		spec2.add(c10);
		check10=new Checkbox("");
		check10.addItemListener(this);
		spec2.add(check10);
		l14=new Label("day");
		l14.disable();
		spec2.add(l14);
		ch4=new Choice();
		ch4.add("monday");
		ch4.add("tuesday");
		ch4.add("thursday");
		ch4.add("wednesday");
		ch4.add("friday");
		ch4.add("saturday");
		ch4.disable();
		spec2.add(ch4);
		check11=new Checkbox("",og,true);
		check11.addItemListener(this);
		spec2.add(check11);
		l15=new Label("forSession");
		l15.disable();
		spec2.add(l15);
		ch8=new Choice();
		ch8.add("session-I");
		ch8.add("session-II");
		ch8.disable();
		spec2.add(ch8);
		check12=new Checkbox("",og,false);
		check12.addItemListener(this);
		spec2.add(check12);
		l16=new Label("forPeriod");
		l16.disable();
		spec2.add(l16);
		ch12=new Choice();
		//ch10=new Choice();
		ch12.disable();
		spec2.add(ch12);
		b13=new Button("CONT6");
		b13.disable();
		spec2.add(b13);
		b14=new Button("EXT6");
		b14.disable();
		spec2.add(b14);
		Label empty3=new Label("   ");
		spec2.add(empty3);
		cpppp.add(spec2);
		Panel extending3=new Panel();
		cpppp.add(extending3);
				

this.add(cp);
setVisible(true);
b17.disable();
b1.disable();

           	cp.disable();
            	np.disable();

l0.disable();
l1.disable();
l2.disable();
l3.disable();

c1.disable();
c2.disable();
c3.disable();
c4.disable();
c5.disable();
c6.disable();

ch30.disable();
//ch40.disable();
b30.disable();
l30.disable();
check1.disable();
check2.disable();
check3.disable();
check4.disable();
check5.disable();
check6.disable();
                check7.disable();
check8.disable();
check9.disable();
check10.disable();
check11.disable();
check12.disable();
ddd.addKeyListener(this);

                 b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
                b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
for(int i=0;i< 300;i++)
{
bb[i]=new backtrack();

}
add(sp,BorderLayout.SOUTH);
	}
	public void class_init()
	{
		if(init_counter==0)
		{
       			System.out.println("intit counter enrtedred");
	 		subject[counter_class][serial_no]=new time_table();
		}
	}

public void actionPerformed(ActionEvent e)
	{
      String s1="status bar:   ";
         System.out.println("action perfomed");
     try
     {
  		//s=e.getActionCommand();
         	Button check=(Button)e.getSource();
                if(check==b7)
                 {
                 lab.setText(s1+"cont3 is clicked");
                 subject[counter_class][serial_no].specialBit=1;
                 //System.out.println("counter class and serial no"+counter_class+serial_no);
                 if(check1.getState())
                  {
                   	subject[counter_class][serial_no].e[no_of_general_period][0]=ch1.getSelectedItem();
                  }
                   if(check2.getState())
                   {
                    	subject[counter_class][serial_no].e[no_of_general_period][1]=ch5.getSelectedItem();
                   }
                    if(check3.getState())
                    {
		    	subject[counter_class][serial_no].e[no_of_general_period][2]=ch9.getSelectedItem();
                      }
                      no_of_general_period ++;
                    //  qqq.app(" no of general period "+no_of_general_period);
                    subject[counter_class][serial_no].no_of_general_period=no_of_general_period;
		               ddd.app("general day"+ subject[counter_class][serial_no].e[no_of_general_period-1][0]);
                    ddd.app("general sessoion"+subject[counter_class][serial_no]. e[no_of_general_period-1][1]);
                   ddd.app("general period"+subject[counter_class][serial_no]. e[no_of_general_period-1][2]);

		c4.setState(false);  
		c4.disable();
                

                  }
               if(check==b8)
                  {
                lab.setText(s1+(b8.getLabel()).toLowerCase()+" is clicked");
                subject[counter_class][serial_no].specialBit=1;
                        if(check1.getState())
                  	{
                   		subject[counter_class][serial_no].e[no_of_general_period][0]=ch1.getSelectedItem();
                  	}
                   	if(check2.getState())
                   	{
                    		subject[counter_class][serial_no].e[no_of_general_period][1]=ch5.getSelectedItem();
                   	}
                    	if(check3.getState())
                    	{
		    		subject[counter_class][serial_no].e[no_of_general_period][2]=ch9.getSelectedItem();
                      	}
                    //	subject[counter_class][serial_no].no_of_general_period=no_of_general_period;
		    	ddd.app("general day"+ subject[counter_class][serial_no].e[no_of_general_period][0]);
                    	ddd.app("general sessoion"+subject[counter_class][serial_no]. e[no_of_general_period][1]);
                    	ddd.app("general period"+subject[counter_class][serial_no]. e[no_of_general_period][2]);
                    	no_of_general_period ++;
                      	subject[counter_class][serial_no].no_of_general_period=no_of_general_period;
                    //	subject[counter_class][serial_no].no_of_general_period=no_of_general_period;
        		ddd.app("no of subject "+subject[counter_class][serial_no].no_of_general_period);
        	       	no_of_general_period=0;

  	                b7.disable(); b8.disable();
                        c4.setState(false);    
			c4.disable();
                    
                   }
		if(check==b9)
		{
    lab.setText(s1+(b9.getLabel()).toLowerCase()+" is clicked");
                 int period=0,res=0;
                 boolean day=false;
                day=check4.getState();
               // ddd.app("dayy" +day);
                if(day==false)
                {
                 res=-2;
                }

                if(res != -2)
                {
                    try {
                        period=Integer.parseInt(ch50.getSelectedItem());
                    }
                    catch(Exception ae)
                    {
                        qqq.add(" "+ae);
                    }
                    res=period_validation(period);
                }
                if(res==1)
                {
                 cont_enter=1;
                  subject[counter_class][serial_no].specialBit=1;
		  if(check4.getState())
                  {
                   	subject[counter_class][serial_no].b[no_of_specific_period][0]=ch2.getSelectedItem();
                  }

                   if(check5.getState())
                   {
                    	subject[counter_class][serial_no].b[no_of_specific_period][1]=ch6.getSelectedItem();
                   }
                    if(check6.getState())
                    {
		    	subject[counter_class][serial_no].b[no_of_specific_period][2]=ch10.getSelectedItem();
                    }

		    System.out.println("specific day"+ subject[counter_class][serial_no].b[no_of_specific_period][0]);
                    System.out.println("specific sessoion"+subject[counter_class][serial_no]. b[no_of_specific_period][1]);
                    System.out.println(" specific period"+subject[counter_class][serial_no]. b[no_of_specific_period][2]);
		    subject[counter_class][serial_no].specific_continuous[no_of_specific_period]=period;
		    //	System.out.prinln("no of specific period"+no_of_specific_period);
		    //	System.out.prinln("no of continous period"+subject[counter_class][serial_no].specific_continuous[no_of_specific_period]);
                    no_of_specific_period ++;
                    subject[counter_class][serial_no].no_of_specific_period=no_of_specific_period;
                   }
                else
                  {
                   if(res==-1)
                   {

                    qqq.add("CONTINOUS PERIOD OVERFLOW ERROR");
                   }
                   if(res==-2)
                   {
                    qqq.add("SPECIFIC DAY NOT SELECTED");
                   }

                  }
 		  c4.setState(false);  
		  c4.disable();

		}
		if(check==b10)
		{
    lab.setText(s1+(b10.getLabel()).toLowerCase()+" is clicked");
                  int period=0,res=0;
                 boolean day=false;
                day=check4.getState();
                //ddd.app("dayy" +day);
                if(day==false)
                {
                 res=-2;
                }

                if(res != -2)
                {
                try {
                period=Integer.parseInt(ch50.getSelectedItem());
                }
                catch (Exception be)
                {
                qqq.add(" "+be);
                }
                res=period_validation(period);
                }

                 if(res==1)
                {

                  cont_enter=1;
		  if(check4.getState())
                  {
                   	subject[counter_class][serial_no].b[no_of_specific_period][0]=ch2.getSelectedItem();
                  }
                   if(check5.getState())
                   {
                    	subject[counter_class][serial_no].b[no_of_specific_period][1]=ch6.getSelectedItem();
                   }
                    if(check6.getState())
                    {
		    	subject[counter_class][serial_no].b[no_of_specific_period][2]=ch10.getSelectedItem();
                      }
                    subject[counter_class][serial_no].no_of_specific_period=no_of_specific_period;
		    System.out.println("specific day"+ subject[counter_class][serial_no].b[no_of_specific_period][0]);
                    System.out.println("specific sessoion"+subject[counter_class][serial_no]. b[no_of_specific_period][1]);

                    System.out.println(" specific period"+subject[counter_class][serial_no]. b[no_of_specific_period][2]);
                 try {
				        		subject[counter_class][serial_no].specific_continuous[no_of_specific_period]=Integer.parseInt(ch50.getSelectedItem());
                    }
                  catch(Exception ce)
                  {
                      qqq.add(" "+ce);
                  }
                    no_of_specific_period ++;

	            subject[counter_class][serial_no].no_of_specific_period=no_of_specific_period;
        	    System.out.println("no of subject "+subject[counter_class][serial_no].no_of_specific_period);
        	    no_of_specific_period=0;
                    b9.disable();
                    b10.disable();
                  }
                  else
                  {
                     if(res==-1)
                   {

                    qqq.add("CONTINOUS PERIOD OVERFLOW ERROR");
                   }
                   if(res==-2)
                   {
                    qqq.add("SPECIFIC DAY NOT SELECTED");
                   }

                  }
                c4.setState(false);  
		c4.disable();

		
		}
	    if(check==b11)
           {
           lab.setText(s1+(b11.getLabel()).toLowerCase()+" is clicked");
                subject[counter_class][serial_no].specialBit=1;

		if(check7.getState())
                  {
                   	subject[counter_class][serial_no].h[no_of_general_non_attendable][0]=ch3.getSelectedItem();
                  }
                   if(check8.getState())
                   {
                    	subject[counter_class][serial_no].h[no_of_general_non_attendable][1]=ch7.getSelectedItem();
                   }
                    if(check9.getState())
                    {
		    	subject[counter_class][serial_no].h[no_of_general_non_attendable][2]=ch11.getSelectedItem();
                      }
                    no_of_general_non_attendable++;
                    subject[counter_class][serial_no].no_of_general_non_attendable=no_of_general_non_attendable;
		 /*   System.out.println("general not attendable day"+ subject[counter_class][serial_no].b[no_of_general_non_attendable][0]);
                    System.out.println("general not attendable sessoion"+subject[counter_class][serial_no]. b[no_of_general_non_attendable][1]);
                    System.out.println("  general not attendable period"+subject[counter_class][serial_no]. b[no_of_general_non_attendable][2]);
                    */
                c3.setState(false);  
		c3.disable();


		}
		if(check==b12)
		{
      lab.setText(s1+(b12.getLabel()).toLowerCase()+" is clicked");
      subject[counter_class][serial_no].specialBit=1;
			if(check7.getState())
                  {
                   	subject[counter_class][serial_no].h[no_of_general_non_attendable][0]=ch3.getSelectedItem();
                  }
                   if(check8.getState())
                   {
                    	subject[counter_class][serial_no].h[no_of_general_non_attendable][1]=ch7.getSelectedItem();
                   }
                    if(check9.getState())
                    {
		    	subject[counter_class][serial_no].h[no_of_general_non_attendable][2]=ch11.getSelectedItem();
                      }
                  //  subject[counter_class][serial_no].no_of_general_non_attendable=no_of_general_non_attendable;
	  /*	    System.out.println("general not attendable day"+ subject[counter_class][serial_no].b[no_of_general_non_attendable][0]);
                    System.out.println("general not attendable sessoion"+subject[counter_class][serial_no]. b[no_of_general_non_attendable][1]);
                    System.out.println("  general not attendable period"+subject[counter_class][serial_no]. b[no_of_general_non_attendable][2]);
                    */
                        no_of_general_non_attendable++;
			subject[counter_class][serial_no].no_of_general_non_attendable=no_of_general_non_attendable;
        		System.out.println("no of subject "+subject[counter_class][serial_no].no_of_general_non_attendable);
no_of_general_non_attendable=0;
b11.disable();
b12.disable();
                c3.setState(false);  
		c3.disable();

		}
	  if(check==b13)
	    {

       lab.setText(s1+(b13.getLabel()).toLowerCase()+" is clicked");
        int period=0,res=0;
                 boolean day=false;
                day=check10.getState();
                //ddd.app("dayy" +day);
                if(day==false)
                {
                 res=-2;
                }
     if(res==0)
     {
        System.out.println("no of specific non atendable "+no_of_specific_non_attendable);
                 subject[counter_class][serial_no].specialBit=1;
		if(check10.getState())
                  {
                   	subject[counter_class][serial_no].k[no_of_specific_non_attendable][0]=ch4.getSelectedItem();
                  }
                   if(check11.getState())
                   {
                    	subject[counter_class][serial_no].k[no_of_specific_non_attendable][1]=ch8.getSelectedItem();
                   }
                    if(check12.getState())
                    {
		    	subject[counter_class][serial_no].k[no_of_specific_non_attendable][2]=ch12.getSelectedItem();
                      }
                    no_of_specific_non_attendable++;
                    subject[counter_class][serial_no].no_of_specific_non_attendable=no_of_specific_non_attendable;
		    System.out.println(" specificnot attendable day"+ subject[counter_class][serial_no].k[no_of_specific_non_attendable-1][0]);
                    System.out.println("specific not attendable sessoion"+subject[counter_class][serial_no].k[no_of_specific_non_attendable-1][1]);
                    System.out.println("specific not attendable period"+subject[counter_class][serial_no]. k[no_of_specific_non_attendable-1][2]);
                    System.out.println(" no of specific non attendable "+subject[counter_class][serial_no].no_of_general_non_attendable);
         }
         else
         {
          qqq.add("SPECIFIC DAY NOT SELECTED");
         }
                c3.setState(false);  
		c3.disable();


		}
		if(check==b14)
		{
      lab.setText(s1+(b14.getLabel()).toLowerCase()+" is clicked");
       int period=0,res=0;
                 boolean day=false;
                day=check10.getState();
                ddd.app("dayy" +day);
                if(day==false)
                {
                 res=-2;
                }
      if(res==0)
     {
      subject[counter_class][serial_no].specialBit=1;
			if(check10.getState())
                  {
                   	subject[counter_class][serial_no].k[no_of_specific_non_attendable][0]=ch4.getSelectedItem();
                  }
                   if(check11.getState())
                   {
                    	subject[counter_class][serial_no].k[no_of_specific_non_attendable][1]=ch8.getSelectedItem();
                   }
                    if(check12.getState())
                    {
		    	subject[counter_class][serial_no].k[no_of_specific_non_attendable][2]=ch12.getSelectedItem();
                      }
                  //  subject[counter_class][serial_no].no_of_general_non_attendable=no_of_specific_non_attendable;
		    System.out.println(" specificnot attendable day"+ subject[counter_class][serial_no].k[no_of_specific_non_attendable][0]);
                    System.out.println("specific not attendable sessoion"+subject[counter_class][serial_no]. k[no_of_specific_non_attendable][1]);
                    System.out.println("specific not attendable period"+subject[counter_class][serial_no]. k[no_of_specific_non_attendable][2]);
                    no_of_specific_non_attendable++;
                    subject[counter_class][serial_no].no_of_specific_non_attendable=no_of_specific_non_attendable;
        		System.out.println("no of subject "+subject[counter_class][serial_no].no_of_specific_non_attendable);
no_of_specific_non_attendable=0;
b13.disable();
b14.disable();
}
 else
         {
          qqq.add("SPECIFIC DAY NOT SELECTED");
         }
                c3.setState(false);  
		c3.disable();


		}

        	if(check==b30)
   		{
int allow=1;
 lab.setText(s1+(b30.getLabel()).toLowerCase()+" is clicked");
class_init();
init_counter++;
try{
ct=Integer.parseInt(chhh.getSelectedItem());
subject[counter_class][serial_no]. no_of_staff=Integer.parseInt(chhh.getSelectedItem());
}
catch (Exception de){
        qqq.add(" "+de);
      }
      			System.out.println("the class no "+counter_class+"subject no "+serial_no);

              ////////////////////////////////////////////////////////////

                                          for(int i=0;i<(counter);i++)
                                    {
                                    

                                     if(subject[counter_class][serial_no].staff_id[i]==(ch30.getSelectedItem()))
                                           {
                                              allow=0;
                                               qqq.add(" REDUNDANT STAFF NOT ALLOWED ");
       
                                           }
                                    }

				  if(allow==1)
                                  {
					for(int q=0;q<=info.total_no_of_staff;q++)
						{
						   if(ss[q].staff_id==(ch30.getSelectedItem()))
							{
							 ss[q].validate_no_period=ss[q].validate_no_period+info.no_of_period[counter_class][serial_no] ;  
                                                             
                                                         
           						    if(	ss[q].validate_no_period > (pan2.no_of_days*pan2.no_of_periods))
                                                              {
                                                                 qqq.add(" period for this staff overflows ");
                                                                 ss[q].validate_no_period=ss[q].validate_no_period-info.no_of_period[counter_class][serial_no] ;     
                                                                 allow=0;  
                                                              }
							    else
							      {
                                                                 allow=1;
							      }
                                                               System.out.println(" THE NO OF PERIOD FOR THIS STAFF "+ss[q].validate_no_period);

							}
						  }				


                                  }                               
                               



////////////////////////////////////////////////////////////////
                      
    if(allow==1)
     {
            if(counter < (ct-1))
      			{
      				System.out.println("if entered");
				System.out.println("no of staff"+subject[counter_class][serial_no]. no_of_staff);
				subject[counter_class][serial_no].staff_id[counter]=(ch30.getSelectedItem());
                                
       				//tf30.setText("");

      			}
        		else
      			{
         			subject[counter_class][serial_no].staff_id[counter]=(ch30.getSelectedItem());

b30.disable();
System.out.println("else enrterd");
ch30.disable();
l30.disable();
 				for(int ii=0;ii<subject[counter_class][serial_no]. no_of_staff;ii++)
		  		{
			    		System.out.println(subject[counter_class][serial_no].staff_id[ii]);
		  		}
       			}

    
			counter++;

        
     chhh.disable();
    }
   		}

        	if(check==b18)
        	{
                int max=0;
       lab.setText(s1+(b18.getLabel()).toLowerCase()+" is clicked");
      if(pan2.no_of_periods_session1 > pan2.no_of_periods_session2)
      {
       max=pan2.no_of_periods_session1;
      }
      else
      {
        max=pan2.no_of_periods_session2;
      }
    for(int i=0;i<=info.total_no_of_staff;i++)
{
 chhh.addItem((i+1)+"");
}
     for(int j=0;j<max;j++)
     {
      ch50.addItem(""+(j+1));
      ch.addItem(""+(j+1));
     }
		   for(int p1=0;p1<pan2.no_of_classes+pan2.no_of_special_period;p1++)
				   {
				   for(int i=0;i<pan2.no_of_days;i++)
			  	   {
			  	    for(int j=0;j<pan2.no_of_periods;j++)
			  	    {

			  	    sch[p1][i][j]=new schedule();

                    }

					}}
          ch30.removeAll();
           ch30.setSize(50,30);
           ch30.resize(50,30);
           b30.setSize(60,25);
          b30.resize(60,25);
          b30.setLocation(500,10);
          b30.setLabel("CONTT1");

					for(int q=0;q<=info.total_no_of_staff;q++)
                    				{
                        			ch30.addItem(info.staffid[q]);

			ss[q]=new staff_structure();
                        			ss[q].staff_id=info.staffid[q];
			ss[q].staff_name=info.staff_name[q];
			System.out.println("staff id and name"+ss[q].staff_id+" "+ss[q].staff_name);
			                      }

                 ch40.removeAll();
ch9.removeAll();
ch10.removeAll();
ch11.removeAll();
ch12.removeAll();
for(int i=0;i<pan2.no_of_periods;i++)
{
ch9.add(""+(i+1));
}
ch9.disable();
for(int i=0;i<pan2.no_of_periods;i++)
{
ch10.add(""+(i+1));
}
ch10.disable();
for(int i=0;i<pan2.no_of_periods;i++)
{
ch11.add(""+(i+1));
}
ch11.disable();
for(int i=0;i<pan2.no_of_periods;i++)
{
ch12.add(""+(i+1));
}
ch12.disable();

ch30.enable();
b30.enable();
l30.enable();
cp.enable();
np.enable();
l0.enable();
l1.enable();
l2.enable();
l3.enable();
c1.enable();
c2.enable();
c3.enable();
c4.enable();
c5.enable();
c6.enable();
b17.enable();
b18.disable();
                  info.total_no_of_subject=0;
                  System.out.println(" no of classes "+pan2.no_of_classes);
                    for(int z=0;z<(pan2.no_of_classes+pan2.no_of_special_period);z++)
                      {
				 info.total_no_of_subject=info.no_of_subject[z]+info.total_no_of_subject;


                     }
                         System.out.println("no of sunject  "+info.total_no_of_subject);

                  	tf16.setText(info.name[0]);
                          tf1.setText(info.subject_id[counter_class][serial_no]);
                               l50.setText("  "+info.no_of_period[counter_class][serial_no]);
                               l51.setText("  "+info.no_of_period[counter_class][serial_no]);
                          ddd.app("after info.subject_id[count][] in check==b18"+info.no_of_period[counter_class][serial_no]);
         	}
			if(check==b41)
					{
          lab.setText(s1+(b41.getLabel()).toLowerCase()+" is clicked");
							b40.disable();
							b41.disable();
		}
		if(check==b17)
		{
    lab.setText(s1+(b17.getLabel()).toLowerCase()+" is clicked");
System.out.println("next entered");
chhh.enable();
c3.enable();
c4.enable();
init_counter=0;
no_continuous_period=0;
no_of_specific_period=0;
no_of_general_non_attendable=0;
no_of_specific_non_attendable=0;
no_of_general_period=0;
             		get();
                      //   allocate();
           		//System.out.println("next entered");
validation();

//System.out.println("next");
//tf2.setText("");
ch30.enable();
l30.enable();
b30.enable();
if(finished==1)
{
b30.disable();
}
counter=0;
            	}


             if(check==b5)
                {
                lab.setText(s1+(b5.getLabel()).toLowerCase()+" is clicked");
                int period=0,res=0;
                subject[counter_class][serial_no].specialBit=1;
         //ddd.app("classname "+counter_class+"
 try {
      period=Integer.parseInt(ch.getSelectedItem());
 }
 catch(Exception ee)
 {
    qqq.add(" "+ee);
 }
 res= period_validation(period);
 if(res==1)
 {
 cont_enter=1;
  subject[counter_class][serial_no]. continuous[no_continuous_period]=period;
  if(subject[counter_class][serial_no]. continuous[no_continuous_period]==0)
  {
   subject[counter_class][serial_no]. continuous[no_continuous_period]=1;
  }
  no_continuous_period++;
  subject[counter_class][serial_no].no_continuous_period=no_continuous_period;
 }
  else
  {
   qqq.add(" period overflow ");
  }

}
              if(check==b6)
                 {
                 lab.setText(s1+(b6.getLabel()).toLowerCase()+" is clicked");
                          int period=0,res=0;
                subject[counter_class][serial_no].specialBit=1;
         //ddd.app("classname "+counter_class+"
 try {
          period=Integer.parseInt(ch.getSelectedItem());
 }
 catch(Exception fe)
 {
    qqq.add(fe+"");
 }
 res= period_validation(period);
 if(res==1)
 {
 try {
  cont_enter=1;
  subject[counter_class][serial_no].continuous[no_continuous_period]=
  Integer.parseInt(ch.getSelectedItem());
  }
  catch(Exception ge)
  {
      qqq.add(" "+ge);
  }

 no_continuous_period++;
subject[counter_class][serial_no].no_continuous_period=no_continuous_period;
ddd.app("no of continous period****************"+
 subject[counter_class][serial_no]. no_continuous_period);
b5.disable();
b6.disable();
no_continuous_period=0;
}
  else
  {
   qqq.add(" period overflow ");
  }

               }
           if(check==b1)
             {
             lab.setText(s1+(b1.getLabel()).toLowerCase()+" is clicked");
                 b30.disable();
                 c5.requestFocus();
                 if(detail.mode==1)
                 {
                  ddd.setVisible(true);
                 }
                 else
                 {
                   ddd.setVisible(false);
                 }
		 System.out.println("ok");
 	         //calc_special();
       		 //	calc_reserved();
                //qqq.add("NO OF ROUND " +no_of_round);
                 ddd.settext(" ");

		 //	calc_forcontinuousperiod();
		 ddd.app("priority going to enter and no of classes"+counter_class);
			//calc_anypriority();

                 // calc_lab();
                 main_loop();
                 ddd.app("priority calulated ");
		 //display();

      displayyy();
     tabledemo td=new tabledemo(sch,ss);

               }
         }

                          catch(Exception es)
                          {
                           qqq.add(""+es);
                          }

       }

              public void progressBar()
       {
      // System.out.println(" progress bar "+current_backtrack_no);
        www.app("BACKTRACK NO "+current_backtrack_no);
        System.out.println("BACKTRACK NO "+current_backtrack_no);

      //  www.app("no of division "+div);
       can1. nextFocus();
        can1.requestFocus();
        can1.draw((current_backtrack_no+1),total_intid);
       // can1.repaint();
        //can1.paint();
       }
           public void main_loop()
           {
               int res=0;
               //div=220/(total_intid-1);
                 
               www.app(" TOTAL INTERNAL ID"+total_intid);
               www.app("BACKTRACK NO "+current_backtrack_no);
               while(true)
                {
                 progressBar();
                // ddd.app("IAM THE FIRST STATEMENT IN MAIN LOOP");
                // ddd.app("IAM GOIGN TO CALCULATE SPECIFIC PRIORITY");

                 res=calc_specificPriority();
                 if(res== -1)
                 {
                  continue;
                 }
                 if(res==-2)
                 {
                  break;
                 }
                 progressBar();
                // ddd.app("IAM FINFISHED CALCULATING SPECIFIC PRIORIRTY");
                 res=calc_specialPriority_lab();
                 if(res== -1)
                 {
                  continue;
                 }
                 //ddd.app("LAB IS FINFISHED IN GOOD FASHION");
                 progressBar();
                 res=calc_specialPriority();
                 if(res== -1)
                 {
                  continue;
                 }
                 //ddd.app("SPECIAL PERIOD IS FINISHED IN GOOD FASHION");
                 progressBar();
                 res=calc_ordinaryPeriod();
                 if(res==-1)
                 {
                  continue;
                 }
                 else
                 {
                   //ddd.app("EVERYTHING IS FINFISHED IN GOOOD FASHION");
                   break;
                 }

               }

           }
     public void keyPressed(KeyEvent ke)
     {
     System.out.println("keypreessed even");
     //ddd.app("key pressed");
      int key=ke.getKeyCode();
       if(key==KeyEvent.VK_F1)
       {
        esc_key=1;
       }

     }
     public void keyReleased(KeyEvent ke)
     { }
     public void keyTyped(KeyEvent ke)
     { }
     public void displayyy()
     {
     int enter=0;
     disp ddd = new disp();
     ddd.setVisible(true);
 //*************************************************************
      ddd.app("FOR CLASSES ");
	   for(int i=0;i<counter_class;i++)
	  {
         ddd.appLine();
         ddd.app("NEXT CLASS");
         ddd.appLine();
	  for(int day=0;day<pan2.no_of_days;day++)
	  {
           ddd.appLine();
	  for(int period=0;period<pan2.no_of_periods;period++)
	   {

	             if(period ==(pan2.no_of_periods_session1))
              { ddd.ap("            ");
              }
              if(detail.output==2)
                 {

              	   ddd.ap(sch[i][day][period].subject_id+"     ");
                 }
             else
                 {
                   	for(int is=0;is<info.total_no_of_subject;is++)
                  			 {

                             //ddd.app("the subject id "+subjects.subject_id[is]);
                    			   //ddd.app("name"+subjects.subject_name[is]);
                    			   if(sch[i][day][period].subject_id.equals(subjects.subject_id[is]))
                                 {
                          			     ddd.ap(subjects.subject_name[is]+"     ");
                                     enter=1;
                                      break;

                                 }

                         }
                         if(enter==0)
                         {
                          ddd.ap("NULL ");
                         }
                         enter=0;
                  }

	   }
	   }
	   }
        ddd.appLine();
	ddd.app("FOR EACH STAFF");
	 for(int q=0;q<=info.total_no_of_staff;q++)
	 {       ddd.appLine();
               ddd.app("NEXT STAFF");
	 for(int day=0;day<pan2.no_of_days ;day++)
	 {  ddd.appLine();
	   for(int period=0;period<pan2.no_of_periods ;period++)
	   {
       if(period ==(pan2.no_of_periods_session1))
              { ddd.ap("         ");
              }
	if(ss[q].b[day][period]==1)
	{
     if(detail.output==2)
     {
    	ddd.ap(ss[q].a[day][period]+"     ");
      }

      else
      {
              for(int is=0;is<info.total_no_of_subject;is++)
                  			 {
                    			   //ddd.app("name"+subjects.subject_name[is]);
                    			   if(ss[q].a[day][period].equals(subjects.subject_id[is]))
                                 {
                         			     ddd.ap(subjects.subject_name[is]+"     ");

                                      break;

                                 }

                           }



      }
	// ss[q].a[day][period]=subject[i][j].subject_code;

	}
       else{
         ddd.ap("EMPTY ");
           }
	}
	}
  }
  }
 //************************************************

	   public void display()
	   {
     int enter=0;
	   for(int i=0;i<counter_class;i++)
	  {
	  for(int day=0;day<pan2.no_of_days;day++)
	  {

           System.out.println("");
	  for(int period=0;period<pan2.no_of_periods;period++)
	   {

	             if(period ==(pan2.no_of_periods_session1))
              {

                System.out.print("   ");
              }
           if(sch[i][day][period].setted==1)
           {

              if(detail.output==2)
                 {

                   System.out.print(sch[i][day][period].setted+" ");

                 }
             else
                 {
                   	for(int is=0;is<info.total_no_of_subject;is++)
                  			 {
                    			   if(sch[i][day][period].subject_id.equals(subjects.subject_id[is]))
                                 {
                          			     ddd.ap(subjects.subject_name[is]+" ");
                                     enter=1;
                                      break;

                                 }

                         }
                         if(enter==0)
                         {
                         // ddd.ap("NULL ");
                         }
                         enter=0;
                  }
            }
            else
            {
                System.out.print("0  ");
            }
	   }
	   }
	   }
        ddd.appLine();
                   System.out.println("");
	   }

	public void calc_reserved()
 	{
for(int i=0;i<pan2.no_of_classes;i++)
for(int j=0;j<info.no_of_subject[i];j++)
  		{
			if(subject[i][j].reserve_form==1)
	 		{
				System.out.println("reserved setted");
		 	}
 			else
 			{
			  	System.out.println("not setted");
 			}
	 	}
	}
public int calc_day(String temp )
{
   int ret=34;
 if(temp=="monday")
      ret=0;
 if(temp=="tuesday")
      ret=1;
if(temp=="wednesday")
      ret=2;

if(temp=="thursday")
      ret=3;
if(temp=="friday")
      ret=4;
if(temp=="saturday")
      ret=5;
if(temp=="sunday")
      ret=6;
return(ret);

}
 public int calc_session(String temp)
{
int ret1=44;
if(temp=="session-I")
   ret1=1;
if(temp=="session-II")
    ret1=2;
return(ret1);



}
	public void calc_special()
 	{
		int i,j;
       System.out.println("calc special entereed no of class"+counter_class);
 for( i=0;i<counter_class;i++)
	{	for( j=0;j<info.no_of_subject[i];j++)
  		{
if(subject[i][j].special_form==1)
         {
             System.out.println("name of special class"+ subject[i][j].class_name+i);

           }
else
       {
       System.out.println("special not setted");
       }
}
}
 	}
//*********************************************************************8**********
 public int period_validation(int period)
 {           int total_period_calc=0,total_period=0;
             //ddd.app("gettttttttttttttttttttttttttttttttttttttttttttt");
            // ddd.app("PERIOD GOT THROUGH PARAMETER IN PERIOD VALIDATION IS "+period);
            // ddd.app("specific"+subject[counter_class][serial_no].no_of_specific_period);
             //    subject[counter_class][serial_no].specific_continuous[no_of_specific_period]=Integer.parseInt(ch50.getSelectedItem());
             for(int pp=0;pp<subject[counter_class][serial_no].no_of_specific_period;pp++)
               {
                 total_period_calc=total_period_calc+subject[counter_class][serial_no].specific_continuous[pp];
               }
            // ddd.app("continous"+subject[counter_class][serial_no].no_continuous_period);
             //ddd.app("continous"+cc);
             for(int tt=0;tt<subject[counter_class][serial_no].no_continuous_period;tt++)
               {
                 total_period_calc=total_period_calc+ subject[counter_class][serial_no]. continuous[tt];
               }
            total_period_calc=total_period_calc+period;
           // ddd.app("total period calculate "+total_period_calc);
            total_period=info.no_of_period[counter_class][serial_no];
            //ddd.app("actual total period "+total_period);
            if(total_period_calc>total_period)
             {
             // ddd.app("YOU MUST VERIFY THIS WHILE ENTERING BUT NOW NO SOLUTION");
              return -1;
             }

         if(total_period_calc<=total_period)
         {
           l51.setText(" "+(total_period-total_period_calc));
           return 1;
         }
      return -1;
  }
//********************************************************************************
          	public int calc_ordinaryPeriod()
	{
int  no_continous_period=1,iq=0,jq=0,intt_id,entered=0,set=0;
//while(true)
 //{
// ddd.app("THIS IS ORDINARY PERIOD ALGORITHM");
// ddd.app("CURRENT BACKTRACK NO IN LAB "+current_backtrack_no);
if(back_set==1)
{

   if(current_backtrack_no<0)
         {
     //     ddd.app("SINCE THERE IS NO PERIODS TO BACKTRACK IAM QUITTING");
          //System.exit;
          return -2;
         }

//ddd.app("MAKE SURE BACKSET==1 FOR THIS LOOP");
//ddd.app("calc_lab backtrack entered");
iq= bb[current_backtrack_no].class_id;
jq=   bb[current_backtrack_no].subject_id;

         no_continous_period=bb[current_backtrack_no].no_continous_period;
subject[iq][jq].setted=0;
intt_id=  bb[current_backtrack_no].internal_id;
subject[iq][jq].periodSetted[intt_id]=0;
//ddd.app("FIRST BACK_SET==1 IS ENTEREDDDD in ordinary perid");
// ddd.app("END OF BACKSET==1 IN ORDINARY PRIORITY");
// ddd.app("IAM GOING TO CLEAR ALL THE BACKTRACK PERIODS");
 clearing_periods(iq,jq,no_continous_period,intt_id );
 //ddd.app("I HAVE CLEARED");

 back_set=0;
 //display();
 return -1;
}
//ddd.app("the value of iq and jq(incremented) is "+iq+" "+jq);
for(iq=0;iq<counter_class;iq++)
{
//  ddd.app("intermediate looppppppppppp");


//ddd.app("the value of jq "+jq);
for(jq=0;jq<info.no_of_subject[iq];jq++)
  		{
               // ddd.app("the value of iq and jq(incremented) is "+iq+" "+jq);

			if((subject[iq][jq].setted==0))
 			{
			 	//ddd.app("NOW IAM GOING TO CALCULATE FOR ORDINARY PERIOD");
                       //ddd.app("group id and individual id"+subject[iq][jq].group_id+" "+subject[iq][jq].individual_id);
                      // ddd.app("checking specialpriorityyyyyyyyyyyyyyy");
            // ddd.app("internal id "+subject[iq][jq].internal_id);
      /*    for(int uu=0;uu<subject[iq][jq].internal_id;uu++)
          {
            ddd.app("no of period of each internal id "+ subject[iq][jq].period[uu]);
          }

          */
                 intt_id=0;
            for(int uu=0;uu<subject[iq][jq].internal_id;uu++)
          {
          // closing bracket was not closed..
              if(  subject[iq][jq].periodSetted[uu]==0)
              {
              entered=1;
              no_continous_period= subject[iq][jq].period[uu];
              intt_id=uu;
             // ddd.app("I HAVE FOUND THE NO OF CONTINOUS PERIOD FOR NOT SETTED "+no_continous_period);
              break;
              }

           }
                         if(entered==1)
                         {

                     // ddd.app("RIGHT PROCEED NO PROBLEM");
                       int iii=   periodPositions(iq,jq,no_continous_period,ALL,1);
                       if(iii<=0)
                             {
                              // ddd.app("THERE IS NO PERIOD POSITIONS SO PLEASE BACKTRACK");
                               current_backtrack_no--;
                               back_set=1;

                               calc_ordinaryPeriod();
                              // ddd.app("IAM RETURNING AFTER THE CONDITION III<0");
                               return -1;
                             }
                         /*   ddd.app("period available");
                           for(int qr=0;qr<iii;qr++)
                              {

                               ddd.ap(temp[qr]+" ");
					 ddd.ap(temp[++qr]+" ");
                               ddd.app(temp[++qr]+" ");
                              }

                           */
                             //  ddd.app("position of labn  in group..... "+subject[iq][jq].position_of_lab_in_group);
                           //  if(subject[iq][jq].position_of_lab_in_group==1)
                             //		{
                                      //int finally_setted=0;
                                      int result=   checkStaffFree_period(iq,jq,iii,no_continous_period,1,back_set,0,intt_id);
                                     //   ddd.app("the result of lab "+result);
                                  //      ddd.app("********************************************************************");
					             if(result== -1)
                                                {
                                                // ddd.app("NOT SETTED SO BACKTRACKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
                                                  current_backtrack_no--;
                                                     back_set=1;
                                                  //     break;
                                                  //per_setted--;
                                                  calc_ordinaryPeriod();
                                                  //ddd.app("IAM RETURNING AFTER RESULT -1 CONDITION");
                                                  return -1;
                                                }
                                             else
                                            {      back_set=0;
                                                   subject[iq][jq].periodSetted[intt_id]=1;
                                                   subject[iq][jq].periodSettedDetail[intt_id][0]=current_day;
                                                   subject[iq][jq].periodSettedDetail[intt_id][1]=current_period;
                                                  // ddd.app("the selected day "+subject[iq][jq].periodSettedDetail[intt_id][0]);
                                                   //ddd.app("the selected period "+subject[iq][jq].periodSettedDetail[intt_id][1]);

                                             for(int uu=0;uu<subject[iq][jq].internal_id;uu++)
          {
          // closing bracket was not closed..
              if(  subject[iq][jq].periodSetted[uu]==0)
              {
                      set=1;
              }

            }
                if(set==0)
                {
                 // ddd.app("setted ==0");
                   subject[iq][jq].setted=1;
                  // per_setted++;
                  // calc_ordinaryPeriod();
                }
                else
                {
                set=0;
                //ddd.app("setted=1");
                subject[iq][jq].setted=0;
                //per_setted++;
                //calc_ordinaryPeriod();
                }
                //calc_ordinaryPeriod();
                ddd.app("IAM RETURNING from result= 1 ");
                return -1;
                                            }

                         }
                      }
              }
        }
        return 1;
        }


//********************************************************************************
      // for periods like nonattendable and priority and not lab
        	public int calc_specialPriority()
	{
int  no_continous_period=1,iq=0,jq=0,intt_id,entered=0,set=0;
//while(true)
 //{
// ddd.app("THIS IS PRIORITY PERIOD ALGORITHM");
// ddd.app("CURRENT BACKTRACK NO IN LAB "+current_backtrack_no);
if(back_set==1)
{

     if(current_backtrack_no<0)
         {
         // ddd.app("SINCE THERE IS NO PERIODS TO BACKTRACK IAM QUITTING");
          //System.exit;
          return -2;
         }

//ddd.app("MAKE SURE BACKSET==1 FOR THIS LOOP");
//ddd.app("calc_lab backtrack entered");
iq= bb[current_backtrack_no].class_id;
jq=   bb[current_backtrack_no].subject_id;
subject[iq][jq].setted=0;
         no_continous_period=bb[current_backtrack_no].no_continous_period;
 intt_id=  bb[current_backtrack_no].internal_id;
subject[iq][jq].periodSetted[intt_id]=0;
//ddd.app("FIRST BACK_SET==1 IS ENTEREDDDD in special period");
//ddd.app("END OF BACKSET==1 IN SPECIAL PRIORITY");
//ddd.app("IAM GOING TO CLEAR ALL THE BACKTRACK PERIODS");
clearing_periods(iq,jq,no_continous_period,intt_id );
//ddd.app("I HAVE CLEARED");
back_set=0;
//display();
return -1;

}
//ddd.app("the value of iq and jq(incremented) is "+iq+" "+jq);
for(iq=0;iq<counter_class;iq++)
{

//ddd.app("the value of jq "+jq);
for(jq=0;jq<info.no_of_subject[iq];jq++)
  		{
               // ddd.app("the value of iq and jq(incremented) is "+iq+" "+jq);

			if(subject[iq][jq].specialBit==1 && subject[iq][jq].setted==0 )
 			{
			 	//ddd.app("special period setted");
                       //ddd.app("group id and individual id"+subject[iq][jq].group_id+" "+subject[iq][jq].individual_id);
                      // ddd.app("checking specialpriorityyyyyyyyyyyyyyy");
             ddd.app("internal id "+subject[iq][jq].internal_id);
      /*    for(int uu=0;uu<subject[iq][jq].internal_id;uu++)
          {
            ddd.app("no of period of each internal id "+ subject[iq][jq].period[uu]);
          }

          */
                 intt_id=0;
            for(int uu=0;uu<subject[iq][jq].internal_id;uu++)
          {
          // closing bracket was not closed..
              if(  subject[iq][jq].periodSetted[uu]==0)
              {
              entered=1;
              no_continous_period= subject[iq][jq].period[uu];
              intt_id=uu;
              //ddd.app("I HAVE FOUND THE NO OF CONTINOUS PERIOD FOR NOT SETTED "+no_continous_period);
              break;
              }

           }
                         if(entered==1)
                   {

                      //ddd.app("RIGHT PROCEED NO PROBLEM");
                   //   no_continous_period=subject[iq][jq].continuous[0];
                   //   ddd.app("no of continous period"+no_continous_period);
                    //  ddd.app("internal period " +intt_id);
                   //     ddd.app("to find whether there is match in passing of class id "+subject[iq][jq].class_name);
                       int iii=   periodPositions(iq,jq,no_continous_period,ALL,1);
                       if(iii<=0)
                             {
                               //ddd.app("THERE IS NO PERIOD POSITIONS SO PLEASE BACKTRACK");
                               current_backtrack_no--;
                               back_set=1;
                               //per_setted--;
                               //calc_specialPriority_lab();
                               calc_specialPriority();
                               //ddd.app("IAM RETURNING FROM CONDITION III<0 ");
                               return -1;
                             }
                         /*   ddd.app("period available");
                           for(int qr=0;qr<iii;qr++)
                              {

                               ddd.ap(temp[qr]+" ");
					 ddd.ap(temp[++qr]+" ");
                               ddd.app(temp[++qr]+" ");
                              }

                           */
                             //  ddd.app("position of labn  in group..... "+subject[iq][jq].position_of_lab_in_group);
                           //  if(subject[iq][jq].position_of_lab_in_group==1)
                             //		{
                                      //int finally_setted=0;
                                      int result=   checkStaffFree_period(iq,jq,iii,no_continous_period,1,back_set,0,intt_id);
                                     //   ddd.app("the result of lab "+result);
                                  //      ddd.app("********************************************************************");
					             if(result== -1)
                                                {
                                                // ddd.app("NOT SETTED SO BACKTRACKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
                                                  current_backtrack_no--;
                                                     back_set=1;
                                                  //     break;
                                                 // per_setted--;
                                                  calc_specialPriority();
                                                  //ddd.app("IAM RETURNING FROM RESULT=-1");
                                                  return -1;

                                                }
                                             else
                                            { back_set=0;

                                                   subject[iq][jq].periodSetted[intt_id]=1;
                                                   subject[iq][jq].periodSettedDetail[intt_id][0]=current_day;
                                                   subject[iq][jq].periodSettedDetail[intt_id][1]=current_period;
                                                   //ddd.app("the selected day "+subject[iq][jq].periodSettedDetail[intt_id][0]);
                                                   //ddd.app("the selected period "+subject[iq][jq].periodSettedDetail[intt_id][1]);

                                             for(int uu=0;uu<subject[iq][jq].internal_id;uu++)
          {
          // closing bracket was not closed..
              if(  subject[iq][jq].periodSetted[uu]==0)
              {
                      set=1;
              }

            }
                if(set==0)
                {
                   subject[iq][jq].setted=1;
                   //calc_specialPriority();
                }
                else
                {
                set=0;
                subject[iq][jq].setted=0;
                 //calc_specialPriority();
                }
                //per_setted++;
                //ddd.app("IAM RETURNING FROM RESULT=1");
                return -1;

                                            }


                        }
                      }
              }
        }
        return 1;
        }



public int calc_specialPriority_lab()
{
   int  no_continous_period=1,iq=0,jq=0,intt_id=0,entered=0,set=0;
  // ddd.app("THIS IS LAB PEROID ALGORITHM");
  // ddd.app("CURRENT BACKTRACK NO IN LAB "+current_backtrack_no);
   if(back_set==1)
      {
         if(current_backtrack_no<0)
         {
          //ddd.app("SINCE THERE IS NO PERIODS TO BACKTRACK IAM QUITTING");
          //System.exit;
          return -2;
         }

        // ddd.app("MAKE SURE THIS IF LOOP IS ENTERED ONLY WHERN BACKSET==1 ");
         //ddd.app("calc_lab backtrack entered");
         iq= bb[current_backtrack_no].class_id;
         jq=   bb[current_backtrack_no].subject_id;
         subject[iq][jq].setted=0;
         no_continous_period=bb[current_backtrack_no].no_continous_period;
         intt_id=  bb[current_backtrack_no].internal_id;
         subject[iq][jq].periodSetted[intt_id]=0;
        // ddd.app("THE VALUE OF IQ JQ AND INTT_ID INSIDE THE BACKSET==1 "+iq+" "+jq+" "+intt_id);
        // ddd.app("FIRST BACK_SET==1 IS ENTEREDDDD in lab");
        // ddd.app("IAM GOING TO CLEAR ALL THE BACKTRACK PERIODS");
         clearing_periods(iq,jq,no_continous_period,intt_id );
         ddd.app("I HAVE CLEARED");
         back_set=0;
         //display();
         return -1;
      }
    //ddd.app("the value of iq and jq(incremented) is "+iq+" "+jq);
    //ddd.app("the value of internal id during backtrack"+intt_id);
    //ddd.app("the value of counter_class "+counter_class);
    for(iq=0;iq<counter_class;iq++)
       {  for(jq=0;jq<info.no_of_subject[iq];jq++)
  		{
                   //ddd.app("the value of iq and jq(incremented) is "+iq+" "+jq);
                   //ddd.app("value of  subject[iq][jq].lab "+subject[iq][jq].lab);
                   //ddd.app("value of subject[iq][jq].setted "+subject[iq][jq].setted);
			if(subject[iq][jq].lab==1 && subject[iq][jq].setted==0)
 			   {
			      //ddd.app("special period setted");
                              //ddd.app("group id and individual id"+subject[iq][jq].group_id+" "+subject[iq][jq].individual_id);
                              // ddd.app("checking specialpriorityyyyyyyyyyyyyyy");
                             // ddd.app("internal id "+subject[iq][jq].internal_id);
                              /*    for(int uu=0;uu<subject[iq][jq].internal_id;uu++)
                              {
                              ddd.app("no of period of each internal id "+ subject[iq][jq].period[uu]);
                               }

                               */

                              for(int uu=0;uu<subject[iq][jq].internal_id;uu++)
                                  {
                                     // closing bracket was not closed..
                                     if(  subject[iq][jq].periodSetted[uu]==0)
                                        {
                                           entered=1;
                                           no_continous_period= subject[iq][jq].period[uu];
                                           intt_id=uu;
                                           ddd.app("TJE INTERNAL ID "+intt_id);
                                           ddd.app("I HAVE FOUND THE NO OF CONTINOUS PERIOD FOR NOT SETTED "+no_continous_period);
                                            break;
                                         }
                                  }
                             if(entered==1)
                         {

                                     ddd.app("RIGHT PROCEED NO PROBLEM");
                                int iii=   periodPositions(iq,jq,no_continous_period,ALL,lab_info.no_parallel_possible);
                               ddd.app("period available");
                             if(iii<=0)
                             {
                               ddd.app("THERE IS NO PERIOD POSITIONS SO PLEASE BACKTRACK");
                               current_backtrack_no--;
                               back_set=1;
                               calc_specialPriority_lab();
                               ddd.app("IAM RETURNING FRO M condition iii<0");
                               return -1;

                             }
                             for(int qr=0;qr<iii;qr++)
                              {

                                ddd.ap(temp[qr]+" "+temp[++qr]+temp[++qr]);
				//ddd.app(temp[++qr]+" ");
                                //ddd.app(temp[++qr]+" ");
                              }
                                ddd.app(" ");

                             int result=   checkStaffFree_lab(iq,jq,iii,no_continous_period,back_set,1,intt_id);
                             ddd.app("the result of lab "+result);
                             //      ddd.app("********************************************************************");
			     if(result== -1)
                                 {
                                    ddd.app("NOT SETTED SO BACKTRACKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
                                    current_backtrack_no--;
                                    back_set=1;
                                    //     break;
                                    calc_specialPriority_lab();
                                    ddd.app("I AM RETURNING FROM RESULT=-1");
                                                  return -1;

                                  }
                              else
                                  {
                                      back_set=0;
                                      set=0;
                                      subject[iq][jq].periodSetted[intt_id]=1;
                                      subject[iq][jq].periodSettedDetail[intt_id][0]=current_day;
                                      subject[iq][jq].periodSettedDetail[intt_id][1]=current_period;
                                      ddd.app("the selected day "+subject[iq][jq].periodSettedDetail[intt_id][0]);
                                      ddd.app("the selected period "+subject[iq][jq].periodSettedDetail[intt_id][1]);
                                      for(int uu=0;uu<subject[iq][jq].internal_id;uu++)
                                           {
                                             if(  subject [iq][jq].periodSetted[uu]==0)
                                                  {
                                                      set=1;
                                                  }
                                           }

                                      if(set==0)
                                           {  ddd.app("set = 0 entered ");
                                              subject[iq][jq].setted=1;
                                              //calc_specialPriority_lab();
                                             // jq=0;
                                           }
                                      else
                                           {
                                              ddd.app("set=1 entered ");
                                              set=0;
                                              subject[iq][jq].setted=0;
                                              //calc_specialPriority_lab();
                                           }
                                           ddd.app("IAM RETURNING FROM RESULT=+1");
                                           return -1;

                                  }
                            }

                           }
                }

       }
       return 1;
   }

                public void clearing_periods(int i,int j,int no_continous_period,int int_id)
                 {

          //            ddd.app("PLEASE CHECK WELL IF I ENTER THIS MAKE SURE BACKSET==1 SINCE IAM BACKTRACKING IAM RETRIEVING PREVIOUS RECORD");
           //     ddd.app(" THE VALUE IN CLEARING PERIDS  I , J, NO OF CONTINOUS PIOER, INT_ID "+i+" "+j+" "+no_continous_period+" "+int_id);
                      int day1=0,period1=0,id=0;
             //         ddd.app("backtrack entered");
                      id=  bb[current_backtrack_no].internal_id;
		      subject[i][j].setted=0;
                      day1=    bb[current_backtrack_no].day[(bb[current_backtrack_no].no_of_backtrack)-1];
		      period1=bb[current_backtrack_no].period[bb[current_backtrack_no].no_of_backtrack-1];
               //        ddd.app("day and period from backtrack "+day1+" "+period1);
		      //	bb[current_backtrack_no].round[bb[current_backtrack_no].no_of_backtrack]=temp[qr+2];
		      //bb[current_backtrack_no].no_continous_period=no_continous_period;
                           for(int k=0;k<subject[i][j].no_of_staff;k++)
				{
				   for(int q=0;q<=info.total_no_of_staff;q++)
					{
					   if(ss[q].staff_id==subject[i][j].staff_id[k])
					       {
						  for(int pp=0;pp<no_continous_period;pp++)
						      {
                                                         ss[q].b[day1][period1+pp]=0;
                                                         subject[i][j].setted=0;										        //cc-=2;
							 ss[q].a[day1][period1+pp]="bEMPTY";
                                                         subject[i][j].round=0;
                                                         // ss[q].a[temp[qr]][temp[qr+1]+pp]=temp[qr+2];
							 sch[i][day1][period1+pp].round=0;
							 sch[i][day1][period1+pp].setted=0;
                                                              for(int k3=0;k3<subject[i][j].no_of_staff;k3++)
								  {
								    sch[i][day1][period1+pp].staff_id[k3]=null;
								    sch[i][day1][period1+pp].no_of_staff=0;
                                                                  }
                                                       }
						     //     ddd.app("every thing is cleared to zero");
					       }
					}
                                }
                         // display();



                 }


                       public  int  checkStaffFree_period(int i,int j,int iii,int no_continous_period,int group,int back_set,int lab,int int_id)
                          {
                                    int internal_idd=0,out=0;
                                      int day=0,period=0,session=0,selected=0,sss=0;
                                    int temp2[]=new int[500];
                                                                        int ud=0;
                                  // int ss=0;
                   //                 ddd.app("no of cotionus period in check "+no_continous_period);
                                          unable_to_set=0;

                    if(current_backtrack_no > max_backtrack_no)
                               {
                                   max_backtrack_no=current_backtrack_no;
			        }

                     //    ddd.app("checking whether max backtrack is greater than current ");
                      //   ddd.app("max backtrac number is "+max_backtrack_no);
                       //  ddd.app("current backtrack no is "+current_backtrack_no);
                                 // if(back_set==1)
                                 // {
                                    if(max_backtrack_no>current_backtrack_no)
                                                      {
                             //                         ddd.app("yes current max backtrack is greater than current ");
                                                         for(int bbb=(current_backtrack_no+1) ; bbb<=max_backtrack_no;bbb++)
                                                           {
                                                           bb[bbb].no_of_backtrack=0;
                           //                                ddd.app("clearing leaf");
                                                           System.out.println("clearing leaf");
                                                           }

                                                       }
                             //         ddd.app("DISPLAYING ALL PERIODS IN CURRENT BACKTRACK no");
                                       {
                                         	 for(int p=0;p<bb[current_backtrack_no].no_of_backtrack;p++)
                                                  {
                         //                          ddd.app("ddday "+bb[current_backtrack_no].day[p]);
                           //                        ddd.app("period "+bb[current_backtrack_no].period[p]);
                                                  }

                                       }

                                  // }
                               //    ddd.app("no of backtrack for this period "+bb[current_backtrack_no].no_of_backtrack);
              for(int qr=0;qr<iii;qr+=3)
              {
                unable_to_set=0;
                 //if(back_set==1)
                  // {

			for(int p=0;p<bb[current_backtrack_no].no_of_backtrack;p++)
                           {
                              if((temp[qr]==bb[current_backtrack_no].day[p] )&& (temp[qr+1]==bb[current_backtrack_no].period[p] ))
                                  {
 		  			unable_to_set=1;
//		        ddd.app("already visited period so cannot set");
                                  }
                           }
                                                      // back_set=0;
                   // }

                                // BACKSET=1 IS FINISHEDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD
                    if(unable_to_set==0)
                       {
                          for(int k=0;k<subject[i][j].no_of_staff;k++)
				{
				  unable_to_set=0;
					for(int q=0;q<=info.total_no_of_staff;q++)
						{
						   if(ss[q].staff_id==subject[i][j].staff_id[k])
							{
							   for(int pp=0;pp<no_continous_period;pp++)
       							      {
								if((ss[q].b[temp[qr]][temp[qr+1]+pp])==1)
          							   {
								      unable_to_set=1;
								      //ddd.app("staff not free");
								    }
                                                               }
							  }
						  }
				}
                      }

                                                                        // ddd.app("UNABLE TO SET //////////"+unable_to_set);

                     if(unable_to_set==0)
                         {
                           temp2[sss++]=temp[qr];
                           temp2[sss++]=temp[qr+1];
                           temp2[sss++]=temp[qr+2];
                         }

              }
                //   back_set=0;
                               // CLOSE THE BRACKET FROM HERE

                  if(sss<=0)
                  {
                    ddd.app("THERE IS NO VALUE IN TEMP SO RETURN -1 AND BACKTRACK");
                    return -1;
                  }
                            iii=sss;
                  //     ddd.app("the value of ss"+sss);
                     for(int kk=0;kk<sss;kk++)
                        {
                         temp[kk]=temp2[kk];
                        }
  //       ddd.app("THE FINAL VALUE AFTER CALCULATING STAFF FREE AND BACKTRACK");
         int df=0,pf=0;
                            for(int kk=0;kk<sss;kk+=3)
                   {
                       //  ddd.ap(temp[kk]+" "+temp[kk+1]+" "+temp[kk+2]+" ");
                      // ddd.appLine();
                          dayyy[df]=temp[kk];
                          perioddd[df++]=temp[kk+1];
                   }
    //                  ddd.app("seperated day ");
                      for(int kk=0;kk<df;kk++)
                      {
      //                  ddd.ap(" "+dayyy[kk]);
                       // ddd.app("period "+perioddd[kk]);
                      }
        //               ddd.app("seperated period ");
                      for(int kk=0;kk<df;kk++)
                      {
                       // ddd.app("day "+dayyy[kk]);
          //              ddd.ap(" "+perioddd[kk]);
                      }

                      ud=0;
                     // ddd.app("unique day calculartion");
                       for(int kk=0;kk<df;kk++)
                      {
                          if(kk==0)
                          {
                          unique_day[ud++]=dayyy[kk];
                          }
                          else
                          {
                           if(unique_day[ud-1]!=dayyy[kk])
                           {
                            unique_day[ud++]=dayyy[kk];
                           }
                          }

                      }
                       internal_idd=subject[i][j].internal_id;
                    //  ddd.app("no of internal id "+internal_idd);
            //          ddd.app("NO OF UNIQUE DAYS "+ud);
                    /*      for(int kk=0;kk<ud;kk++)
                          {
                            ddd.app("unique day "+unique_day[kk]);
                          }
                          */
                     out=0;
                     int_ud=ud;
                   out= seperation_distance(internal_idd,no_continous_period,int_id,df,ud,0);
          // ddd.app("I VALUE OF OUT IS "+out);
                   if(out==1)
                   {       back_set=0;
                    //   ddd.app("THE SELECTED DAY IS "+current_day);
                    //   ddd.app("THE SELECTED PERIOD IS "+current_period);
              //         ddd.app("maximum backtrack no"+max_backtrack_no);
                //       ddd.app("SINCE I HAVE ALLOCATED PERIOD IAM WRITING THE DETAILS IN BACKTRACK");
                      bb[current_backtrack_no].backtrack_no=current_backtrack_no;
                      bb[current_backtrack_no].internal_id=int_id;
                      bb[current_backtrack_no].class_id=i;
                      bb[current_backtrack_no].subject_id=j;
                      bb[current_backtrack_no].day[bb[current_backtrack_no].no_of_backtrack]=current_day;
		      bb[current_backtrack_no].period[bb[current_backtrack_no].no_of_backtrack]=current_period;
		      bb[current_backtrack_no].round[bb[current_backtrack_no].no_of_backtrack]=1;
		      bb[current_backtrack_no].no_continous_period=no_continous_period;
                      bb[current_backtrack_no].position_of_lab_in_group=subject[i][j].position_of_lab_in_group;
                      bb[current_backtrack_no].no_of_backtrack=++bb[current_backtrack_no].no_of_backtrack;;
                        ddd.app(" backtrak details ");
                        ddd.app("current backtrack no "+bb[current_backtrack_no].backtrack_no);
                     //   ddd.app("position of lab(period) in group "+bb[current_backtrack_no].position_of_lab_in_group);
                      for(int p=0;p<bb[current_backtrack_no].no_of_backtrack;p++)
                        {
                  //        ddd.app("ddday "+bb[current_backtrack_no].day[p]);
                    //      ddd.app("period "+bb[current_backtrack_no].period[p]);
                         }
                      current_backtrack_no++;

                         if(current_backtrack_no > max_backtrack_no)
                              {
                               max_backtrack_no=current_backtrack_no;
                              }


                      //    ddd.app("going to set");
                        for(int k=0;k<subject[i][j].no_of_staff;k++)
			 {
			   for(int q=0;q<=info.total_no_of_staff;q++)
			     {
			     	if(ss[q].staff_id==subject[i][j].staff_id[k])
				  {
				     for(int pp=0;pp<no_continous_period;pp++)
					 {
                                           //ddd.app("continou period loop");
					     ss[q].b[current_day][current_period+pp]=1;
                                           //subject[i][j].setted=1;										        //cc-=2;
					     ss[q].a[current_day][current_period+pp]=subject[i][j].subject_code;
                                             subject[i][j].round=1;
                                           // ss[q].a[temp[qr]][temp[qr+1]+pp]=temp[qr+2];
					    sch[i][current_day][current_period+pp].round=1;
					    sch[i][current_day][current_period+pp].setted=1;
              sch[i][current_day][current_period+pp].subject_id=subject[i][j].subject_code;
                                              for(int k3=0;k3<subject[i][j].no_of_staff;k3++)
						   {
							//ddd.app("fourth for loop entered");
							//cc-=2;
							sch[i][current_day][current_period].staff_id[k3]=subject[i][j].staff_id[k3];
							//cc-=2;
							sch[i][current_day][current_period].no_of_staff=subject[i][j].no_of_staff;
                                                    }

                                           }

				  }
			     }
                         }
                        // display();
                          return(1);
                      }
               return -1;
 }

public int  seperation_distance(int tot_int,int continous_per,int internal_idd,int df,int ud,int first)
{
//ddd.app("SEPERATION_DISTANCE ENTERED ");
//ddd.app(" INTERNAL IDD "+internal_idd);
//ddd.app("CONTIONUYOU PERIOD "+continous_per);
int seperation=0,not_possible=0,enter=0;
current_day=100;current_period=100;
//  ddd.app("THE VALUE OF TOT_INT "+tot_int);
//  ddd.app("the value of ud is "+ud);
//  ddd.app("the value of int_ud "+int_ud);
int working_days=pan2.no_of_days;
  seperation=(ud/tot_int)+1;
int temp_sep=seperation;

int temp_rout=1;
ddd.app("first temp_sep"+seperation);
/*ddd.app("internal id "+internal_idd);
ddd.app("first temp_sep"+seperation);
ddd.app("df and ud "+df+" "+ud);
ddd.app("working days "+working_days);
  ddd.app("THE VALUE OF FIRST ISSSSSSSSSSSSSSSSSS "+first);
  */
  if( (df==0) || (ud==0))
  {
 //  ddd.app("THERE IS NO UNIQUE DAYS OR PERIODS ");
   return -1;
  }
  if(df==1)
  {
     current_day=dayyy[0];
     current_period=perioddd[0];
     alloted_day[internal_idd]=current_day;
     alloted_continuous[internal_idd]=continous_per;
//     ddd.app("THE VALUE OF DF==1 SO ALLOT THE ONLY ONE EXISTING PERIOD WITHOUT ANY FURTHER PROCESSING "+(internal_idd+first));
     return 1;

  }
  if(first>0 && ((internal_idd % int_ud)==0))
  {     int temp=0;
        if(detail.random==1)
        {

          temp=r.nextInt();
          temp=temp%df;
          if(temp<0)
          {
          temp=(temp*(-1));
          }
       //   ddd.app(" THE VALUE OF TEMP(RANDOM) IS "+temp);
        //  ddd.app(" THE VALUE OF DF IS "+df);
         }
         else
         {
          temp=0;
         }
          current_day=dayyy[temp];
          current_period=perioddd[temp];
          alloted_day[internal_idd]=current_day;
          alloted_continuous[internal_idd]=continous_per;
         // ddd.app("INTERNAL  SO FIRST PERIOD IS ALLOTED "+(internal_idd+first));
          return 1;

  }
  if( (internal_idd ) == 0)
        {
         int temp=0;
         if(detail.random==1)
         {

          temp=r.nextInt();
          temp=temp%df;
          if(temp<0)
          {
          temp=(temp*(-1));
          }
   //       ddd.app(" THE VALUE OF TEMP2(RANDOM) IS "+temp);
     //     ddd.app(" THE VALUE OF DF IS "+df);
         }
         else
         {
          temp=0;
         }
          current_day=dayyy[temp];
          current_period=perioddd[temp];
          alloted_day[internal_idd]=current_day;
          alloted_continuous[internal_idd]=continous_per;
        //  ddd.app("INTERNAL  SO FIRST PERIOD IS ALLOTED "+(internal_idd+first));
          return 1;
        }
        enter=0;
while(true)
{
   for(int jj=0;jj<df;jj++)
   {
   // ddd.app("dayyy[jj] "+dayyy[jj]);
    //ddd.app("alloted_day[internal_idd-1] "+alloted_day[internal_idd-1]);
      if( ((dayyy[jj])-(alloted_day[internal_idd-1]))==temp_sep)
          {
          //  ddd.app("tempset matched for "+temp_sep);
           // ddd.app("the value of first "+first);
             int kkk=first;
             for(;kkk<internal_idd;kkk++)
              {
               // ddd.ap("THE ALLOTED DAY "+alloted_day[kkk]);
                if( dayyy[jj]==alloted_day[kkk] )
                  {
                    not_possible=1;
                  }
              }
               if(not_possible==0)
                 {
                   current_day=dayyy[jj];
                   int temp=0;
                  if(detail.random==1)
                  {
                   int prob=0;
                   for(int cc=jj;cc<df;cc++)
                   {
                       prob++;
                       if(dayyy[cc]!=dayyy[jj])
                       {
                        break;
                       }
                   }
                   if(prob>=2)
                   {
                   prob--;
                   }

                    temp=r.nextInt();
                    temp=temp%prob;
                    if(temp<0)
                      {
                          temp=(temp*(-1));
                      }
               //     ddd.app(" THE VALUE OF TEMP3(RANDOM) IS "+temp);
             //       ddd.app(" THE VALUE OF prob IS "+prob);
                   }
                   else
                   {
                    temp=0;
                   }
                   current_period=perioddd[jj+temp];
                   alloted_day[(internal_idd)]=current_day;
                   alloted_continuous[internal_idd]=continous_per;
                 //  ddd.app("THE TEMPORAARY SEPERATION "+temp_sep);
                   return 1;
                  }
             not_possible=0;
          }

      }
      if(temp_rout==1)
      {
       temp_sep++;
      }
       if(temp_rout==1)
       {
         if(temp_sep>=working_days)
         {
          temp_rout=0;
          temp_sep=(seperation);
         }
        }
      if(temp_rout==0)
      {
       temp_sep--;
      }

      if(temp_sep==0)
      {
       temp_sep=(-working_days);
       temp_rout=2;
      }
      if(temp_rout==2)
      {
       temp_sep++;
      }
      if(temp_rout==2)
      {
      // ddd.app("the absolute value of temp_sep "+(temp_sep));
       if( (temp_sep)==0 )
       {
//        ddd.app("NO SEPERATE DAY FOR ME TO ALLOT LOOK FOR SAME ALLOTED DAY");
        enter=1;
        break;
       }
       if(enter==1)
        {
         break;
        }
      }
  //    ddd.ap("the absolute value of temp_sep "+(temp_sep));
  //    ddd.ap("the value of temp_rout "+temp_rout);
   //   ddd.appLine();
      if(enter==1)
      {
       break;
      }
      enter=0;
   }

//************************************************
//ddd.app("ENTERED SECONDARAY CALCULATRION");
// for period wirth temp_sep=0;
int no_period=0,min_period=50;
 for(int yy=0;yy<ud;yy++)
  {      no_period=0;
    for(int hh=0;hh<internal_idd;hh++)
    {
     // ddd.app("ALLOTED DAY[hh] "+alloted_day[hh]);
     if(alloted_day[hh]==unique_day[yy])
      {
         no_period=no_period+alloted_continuous[hh];

      //   ddd.app("alloted day "+alloted_day[hh]);
      }

    }
//    ddd.app("TOTAL NO OF PERIOD FOR THIS DAY "+no_period);
    if(no_period !=0)
    {
     if(no_period < min_period)
      {
       min_period=no_period;
       /*current_day=yy;
       alloted_day[(internal_idd)]=current_day;
       alloted_continuous[internal_idd]=continous_per; */
      }
     }
  }
//**********************************************
int temp_unique_day[]=new int[200];
//ddd.app("THE OVERALL MINIMUM PERIOD "+min_period);
            int temp_ud=0;
          for(int yy=0;yy<ud;yy++)
  {      no_period=0;
    for(int hh=0;hh<internal_idd;hh++)
    {
     // ddd.app("ALLOTED DAY[hh] "+alloted_day[hh]);
     if(alloted_day[hh]==unique_day[yy])
      {
         no_period=no_period+alloted_continuous[hh];

   //      ddd.app("alloted day "+alloted_day[hh]);
      }

    }
  //  ddd.app("TOTAL NO OF PERIOD FOR THIS DAY "+no_period);
     if(no_period == min_period)
      {
       //min_period=no_period;
       //current_day=yy;
       temp_unique_day[temp_ud++]=unique_day[yy];
       //alloted_continuous[internal_idd]=continous_per;
      }

  }
  ud=temp_ud;
  for(int jj=0;jj<temp_ud;jj++)
       {
     unique_day[jj]=temp_unique_day[jj];
       }
  //  ddd.app("for displaying uniqueid for same periods");
    int temp_df=0,temp_dayyy[]=new int[200],temp_perioddd[]=new int[200];
  //  ddd.app(" UNIQUE IDDDDDDDDDDDD");
    for(int rr=0;rr<ud;rr++)
    {
   //  ddd.app(" "+unique_day[rr]);
       for(int jj=0;jj<df;jj++)
       {
        if(dayyy[jj]==unique_day[rr])
         {
           temp_dayyy[temp_df]=dayyy[jj];
           temp_perioddd[temp_df++]=perioddd[jj];
         }
       }

    }

    df=temp_df;
       for(int jj=0;jj<df;jj++)
       {
          dayyy[jj]=temp_dayyy[jj];
          perioddd[jj]=temp_perioddd[jj];
       }
     /*  for(int jj=0;jj<df;jj++)
       {
        ddd.app(  dayyy[jj]+" ");
         // perioddd[jj]=temp_perioddd[jj];
       }
        for(int jj=0;jj<df;jj++)
       {
       // ddd.app(  dayyy[jj]=temp_dayyy[jj]+" ");
         ddd.app(" "+ perioddd[jj]);
       }
       */
       tot_int=tot_int-int_ud;
      return( seperation_distance( tot_int, continous_per, internal_idd, df, ud,(first+int_ud)) );
//ddd.app("UNABLE TO RETURN FROM SEPERATION ");
//return -1;
}
    public int  checkStaffFree_lab(int i,int j,int iii,int no_continous_period,int back_set,int lab,int int_id)
      {
                                        unable_to_set=0;
                                        if(current_backtrack_no > max_backtrack_no)
                                {
                                   max_backtrack_no=current_backtrack_no;
			                          }
                                        if(max_backtrack_no>current_backtrack_no)
                                                     {
                                                       ddd.app("yes current max backtrack is greater than current ");
                                                       System.out.println("yes current max backtrack is greater than current ");
                                                        for(int bbb=(current_backtrack_no+1) ; bbb<=max_backtrack_no;bbb++)
                                                           {
                                                           bb[bbb].no_of_backtrack=0;
                                                           System.out.println("clearing leafs");
                                                           ddd.app("clearing leafs");
                                                           }

                                                       }
                                                ddd.app("DISPLAYING ALL PERIODS IN CURRENT BACKTRACK no");

                                         	 for(int p=0;p<bb[current_backtrack_no].no_of_backtrack;p++)
                                                  {
                                                   ddd.app("ddday "+bb[current_backtrack_no].day[p]);
                                                   ddd.app("period "+bb[current_backtrack_no].period[p]);
                                                  }



                                        ddd.app("internal id in funtion parameter"+int_id);
                                        ddd.app("current backtrack no "+current_backtrack_no);
                                        ddd.app("maximum backtrack no "+max_backtrack_no);

 		 for(int qr=0;qr<iii;qr+=3)
                    {
                      if(subject[i][j].setted==1)
                          {
                            return(1);
                          }
                      unable_to_set=0;
                     // if(back_set==1)
                       //  {

			    for(int p=0;p<bb[current_backtrack_no].no_of_backtrack;p++)
                               {
                                  if((temp[qr]==bb[current_backtrack_no].day[p] )&& (temp[qr+1]==bb[current_backtrack_no].period[p] ))
                                      {
 					unable_to_set=1;
				      //	ddd.app("already visited period so cannot set");
                                      }
                                }

                        // }
               // since it is a lab we cannot same period among different classes
                     // ddd.app("IAM GOING TO CHECK THIS PERIOD WITH ALL OTHER CLASSES");
                      if(unable_to_set==0)
                          {
                         //   ddd.app("yes proceed to check");
                               for(int ii=0;ii<counter_class;ii++)
	                           {
                                      for(int pp=0;pp<no_continous_period;pp++)
       					 {
                                            if(sch[ii][temp[qr]][temp[qr+1]+pp].setted==1)
                                               {
                                              //    ddd.app("same day and period");
                                                  if(sch[i][temp[qr]][temp[qr+1]+pp].round==temp[qr+2])
                                                    {
                                                     unable_to_set=1;
                                                //     ddd.app("same round ");
                                                     //ddd.app("THIS UNABLE TO SET IS UNIQE FOR LAB");
                                                    }
                                                   else
                                                     {
                                                  //     ddd.app("not same round");
                                                     }
                                               }
                                          }
                                   }
                          }
	              if(unable_to_set==0)
                         {
                            for(int k=0;k<subject[i][j].no_of_staff;k++)
				{
				   //unable_to_set=0;
				   for(int q=0;q<=info.total_no_of_staff;q++)
				        {
					    if(ss[q].staff_id==subject[i][j].staff_id[k])
						{
						   for(int pp=0;pp<no_continous_period;pp++)
       						      {
						         if((ss[q].b[temp[qr]][temp[qr+1]+pp])==1)
          						     {
								unable_to_set=1;
							//	ddd.app("staff not free");
							      }
                                                      }
					         }
					   }
				}
                            //    ddd.app("UNABLE TO SET //////////"+unable_to_set);
                         }
                      if(unable_to_set==0)
                          {
 			     if(lab_info.session==1)
                                {
                                   //ddd.app("session 1 entered");
                                   if((temp[qr+1]==0) || (temp[qr+1]==pan2.no_of_periods_session1))
                                       {
                                         unable_to_set=0;
					// ddd.app("period is starting of sessions");
                                        }
                                    else
                                        {
                                         //  ddd.app("period is not at the starting of sessions");
       					   unable_to_set=1;
					  //  ddd.app("unable to set "+unable_to_set);
					}
                               }
                          }
		      if(unable_to_set==0)
                          {
                             if(lab_info.session==2)
                                 {
                                  //  ddd.app("session 2********************"+temp[qr+1]+" "+no_continous_period+" "+pan2.no_of_periods_session1);
                                    if(((temp[qr+1]+no_continous_period)==(pan2.no_of_periods_session1)) || ((temp[qr+1]+no_continous_period)==(pan2.no_of_periods_session2+pan2.no_of_periods_session1)))
                                        {
				      //      ddd.app("if loop sessionon 2 entered");
                                        }
   				    else
					{
                                        //     ddd.app("else session 2 entered");
                                             unable_to_set=1;
                                        }
                                 }
                          }
                       if(unable_to_set==0)
                          {
                             if(int_id>=1)
                                 {
                                     int prev_day=0,prev_period=0;
                                     //ddd.app("group2 calculationnssssssssssssss");
				    // ddd.app("previous backtrack no "+bb[current_backtrack_no].backtrack_no);
                                     //ddd.app("ddday "+bb[current_backtrack_no-1].day[p]);
                                  /*   subject[iq][jq].periodSettedDetail[intt_id][0]=current_day;
                                      subject[iq][jq].periodSettedDetail[intt_id][1]=current_period;
                                      ddd.app("the selected day "+subject[iq][jq].periodSettedDetail[intt_id][0]);
                                      ddd.app("the selected period "+subject[iq][jq].periodSettedDetail[intt_id][1]);
                                      */

              prev_day=subject[i][j].periodSettedDetail[int_id-1][0];
              prev_period=subject[i][j].periodSettedDetail[int_id-1][1];
              ddd.app("PREVIOUS DAY "+prev_day);
              ddd.app("PREVIOUS PERIOD "+prev_period);
				 /*    for(int pp=0;pp<bb[current_backtrack_no-1].no_of_backtrack;pp++)
                  			{
					    // ddd.app("ddday "+bb[current_backtrack_no-1].day[pp]);
					    // ddd.app("period "+bb[current_backtrack_no-1].period[pp]);
                                            // ddd.app("round "+bb[current_backtrack_no-1].round[pp]);

					     prev_day=bb[current_backtrack_no-1].day[pp];
					     prev_period=bb[current_backtrack_no-1].period[pp];
					     prev_round=bb[current_backtrack_no-1].round[pp];
                                        }
                                        */
                                     if(lab_info.labDays==1)
                                        {
                                        //    ddd.app("group 2 labdays calculating");
                                            if((temp[qr]-prev_day)==0)
                                                {
					  //	    ddd.app("same day so cannot set");
                                                    unable_to_set=1;
					        }
					}
                                     if(unable_to_set==0)
                                         {
                                            if(lab_info.labSessions==1)
					        {
                                                //  ddd.app("group 2 labsession  1 is calculating");
						//  ddd.app(" pan2.no of periods of session1 ,   temp[qr+1], prev_period " + pan2.no_of_periods_session1+", "+temp[qr+1]+" , "+prev_period);
						  if((temp[qr+1]< pan2.no_of_periods_session1) && (prev_period < pan2.no_of_periods_session1 ))
						      {
                                                         unable_to_set=1;
						//	 ddd.app("same session1");
						      }
						  if(((temp[qr+1]>= pan2.no_of_periods_session1 ) && (prev_period >= pan2.no_of_periods_session1 )) && ((temp[qr+1]<(pan2.no_of_periods_session1+pan2.no_of_periods_session2)) && (prev_period< (pan2.no_of_periods_session1+pan2.no_of_periods_session2))))
                                                      {
                                                         unable_to_set=1;
						  //	 ddd.app("same session2");
					              }
						}
                                         }
                                     if(unable_to_set==0)
                                         {
                                            if(lab_info.labSessions==2)
						{
                                            	   if(    ((temp[qr+1]< pan2.no_of_periods_session1 ) && (prev_period < pan2.no_of_periods_session1)) || ( (temp[qr+1]>=pan2.no_of_periods_session1)  && (prev_period>=pan2.no_of_periods_session1))    )
                                                       {
                                                    //       ddd.app("lab session2 and consecutive periods");
                                                       }
						   else
                                                       {
                                                            unable_to_set=1;ddd.app(" unable to set ,differnt  session1");}
                                                       }
                                                }
                                         }
			  }
                       if(unable_to_set==0)
                          {
                           //  ddd.app("maximum backtrack no"+max_backtrack_no);
                             bb[current_backtrack_no].backtrack_no=current_backtrack_no;
                             bb[current_backtrack_no].class_id=i;
                             bb[current_backtrack_no].subject_id=j;
                             bb[current_backtrack_no].internal_id=int_id;
                             bb[current_backtrack_no].day[bb[current_backtrack_no].no_of_backtrack]=temp[qr];
                             current_day=temp[qr];
                             current_period=temp[qr+1];
			     bb[current_backtrack_no].period[bb[current_backtrack_no].no_of_backtrack]=temp[qr+1];
                 	     bb[current_backtrack_no].round[bb[current_backtrack_no].no_of_backtrack]=temp[qr+2];
			     bb[current_backtrack_no].no_continous_period=no_continous_period;
                            // bb[current_backtrack_no].position_of_lab_in_group=subject[i][j].position_of_lab_in_group;
                             bb[current_backtrack_no].no_of_backtrack=++bb[current_backtrack_no].no_of_backtrack;
                           //  ddd.app(" backtrak details ");
                           //  ddd.app("current backtrack no "+bb[current_backtrack_no].backtrack_no);
                            // ddd.app("internal id "+bb[current_backtrack_no].internal_id);
                             /*for(int p=0;p<bb[current_backtrack_no].no_of_backtrack;p++)
                                {
                                  ddd.app("ddday "+bb[current_backtrack_no].day[p]);
                                  ddd.app("period "+bb[current_backtrack_no].period[p]);
                                  ddd.app("round "+bb[current_backtrack_no].round[p]);
                                }
                               */
                             current_backtrack_no++;
                             if(current_backtrack_no > max_backtrack_no)
                              {
                               max_backtrack_no=current_backtrack_no;
                              }
                             ddd.app("going to set");
                             for(int k=0;k<subject[i][j].no_of_staff;k++)
				{
				   for(int q=0;q<=info.total_no_of_staff;q++)
					{
					    if(ss[q].staff_id==subject[i][j].staff_id[k])
					        {
						   for(int pp=0;pp<no_continous_period;pp++)
						        {
                                                           ss[q].b[temp[qr]][temp[qr+1]+pp]=1;
                                                           //subject[i][j].setted=1;										        //cc-=2;
							   ss[q].a[temp[qr]][temp[qr+1]+pp]=subject[i][j].subject_code;
                                                           subject[i][j].round=temp[qr+2];
                                                           // ss[q].a[temp[qr]][temp[qr+1]+pp]=temp[qr+2];
							   sch[i][temp[qr]][temp[qr+1]+pp].round=temp[qr+2];
							   sch[i][temp[qr]][temp[qr+1]+pp].setted=1;
                 sch[i][temp[qr]][temp[qr+1]+pp].subject_id=subject[i][j].subject_code;

                                                           for(int k3=0;k3<subject[i][j].no_of_staff;k3++)
							       {
								  sch[i][temp[qr]][temp[qr+1]].staff_id[k3]=subject[i][j].staff_id[k3];
								  sch[i][temp[qr]][temp[qr+1]].no_of_staff=subject[i][j].no_of_staff;
                                                               }
                                                         }
						  // ddd.app("first if statement entered");
						}
					}
                                }
                              //display();
                              back_set=0;
                              return(1);
                          }
                        else
                           {
			      //	ddd.app("unable to set proceed for next place");
                           }
                }
                    return(-1);
            // public int  checkStaffFree(int i,int j,int iii,int no_continous_period,int group,int back_set)
 }



public int periodPositions(int class_id ,int sub_id,int no_continous_period,int parallel_period,int parallel)
{
int cannot_set=0;
int ii=0;
int start=0,way=0;
  if(lab_info.parallel_possible ==0)
      {
       parallel_period=ALL;
       parallel=1;
        ddd.app("parallel not possible");
       }


if(parallel_period == ALL)
  {

        ddd.app("ALL parallel period");
          ddd.app("total period"+(pan2.no_of_periods_session2+pan2.no_of_periods_session1));
            for(int qq=0;qq<parallel;qq++)
                 {   //   ddd.app("first loop"+lab_info.no_parallel_possible);
                   for(int count_day=0;count_day<pan2.no_of_days;count_day++)
                       {
                       //ddd.app("second loop"+pan2.no_of_days);
                        //   ddd.app("\n"+"nextday"+"\n");
                                     cannot_set=0;
                         for(int count_period=0;count_period<(pan2.no_of_periods_session2+pan2.no_of_periods_session1);count_period++)
                            {
                                   cannot_set=0;
                                   if(count_period<pan2.no_of_periods_session1)
                                           {
                                              start=1;
                                           }
                                     else
                                           {
								start=2;
							 }
                               for(int qe=count_period;qe<(count_period+no_continous_period);qe++)
                                  {
                                         if(qe>=(pan2.no_of_periods_session2+pan2.no_of_periods_session1))
                                              {
								cannot_set=1;
                                                 break;
                                               }

                                           if(qe<pan2.no_of_periods_session1)
                                            {
                                              way=1;
                                             }
                                               else
                                             {
                                                way=2;
                                              }
                                        /* ddd.app("way"+way);
                                              ddd.app("qe... "+qe);
                                              ddd.app("round... "+sch[class_id][count_day][count_period].round);
                                               ddd.app("rounds..."+(qq+1));  */

                                            if((sch[class_id][count_day][qe].setted==1) && (sch[class_id][count_day][count_period].round==(qq+1)))
                                         {
                                                 cannot_set=1;
                                              break;

						        //temp[qq][count_day][count_period]=1;
                                          }
                                  }
                                       //  ddd.app("cannot set "+cannot_set);
                                   if(cannot_set==0 && start==way)
                                   {
                              // ddd.app("    first element  says the period no and the second elements says the round");
                                   temp[ii++]=count_day;
                                   temp[ii++]=count_period;
						temp[ii++]=(qq+1);
                                  }
                            }

                        }
                 }


  }
else{


        ddd.app("specific parallel period");
                   for(int count_day=0;count_day<pan2.no_of_days;count_day++)
                       {             cannot_set=0;
                         for(int count_period=0;count_period<(pan2.no_of_periods_session2+pan2.no_of_periods_session1);count_period++)
                            {
                                   cannot_set=0;
                                   if(count_period<pan2.no_of_periods_session1)
                                           {
                                              start=1;
                                           }
                                     else
                                           {
								start=2;
							 }

                               for(int qe=count_period;qe<(count_period+no_continous_period);qe++)
                                  {
                                                  if(qe>=(pan2.no_of_periods_session2+pan2.no_of_periods_session1))
                                              {
								cannot_set=1;
                                                 break;
                                               }

                                       if(qe<pan2.no_of_periods_session1)
                                            {
                                              way=1;
                                             }
                                               else
                                             {
                                                way=2;
                                              }

                                      if((sch[class_id][count_day][qe].setted==1) && (sch[class_id][count_day][count_period].round==parallel_period))
                                         {
                                                 cannot_set=1;
                                              break;

						        //temp[qq][count_day][count_period]=1;
                                          }
                                  }
                                   if(cannot_set==0 && start==way)
                                   {
                                   //first element  says the period no and the second elements says the round
                                   temp[ii++]=(count_period+1)*(count_day+1);
						temp[ii++]=parallel_period;
                                   }
                            }

                        }





    }
    ddd.app("end of continous perio0d calculation");
        if(subject[class_id][sub_id].no_of_general_period > 0)
          {
          ddd.app("starting of general prioreity");
          ii=calc_generalPriority(class_id,sub_id,ii);
          ddd.app("ending of general period");
          }
          ddd.app("before second if  ");
        if(subject[class_id][sub_id].no_of_general_non_attendable > 0)
        {
        ddd.app("before general non attendable");
               ii=calc_generalNonattendable(class_id,sub_id,ii,no_continous_period);
               ddd.app("after general non attendable");
        }
         if(subject[class_id][sub_id].no_of_specific_non_attendable > 0)
        {
        ddd.app("before specific non attendable");
               ii=calc_specificNonattendable(class_id,sub_id,ii,no_continous_period);
               ddd.app("after specific non attendable");
        }
 return(ii);
}
public int calc_specificNonattendable(int class_id,int sub_id,int ii,int continuous_period)
{
  int day=0,session=0,period=0,selected=0,temp3[]=new int[500],ss=0;
           /*  for(int yy=0;yy<subject[class_id][sub_id].no_of_specific_non_attendable;yy++)
                {
		    ddd.app(" specific not attendable day"+ subject[class_id][sub_id].k[yy][0]);
                    ddd.app("specific not attendable sessoion"+subject[class_id][sub_id]. k[yy][1]);
                    ddd.app("specific not attendable period"+subject[class_id][sub_id]. k[yy][2]);
                }
                */

                 /*  ddd.app("***********before calculating specific non atendable*********");
                     for(int kk=0;kk<ii;kk++)
                   {
                         ddd.ap(temp[kk++]+" "+temp[kk++]+" "+temp[kk]+" ");
                       ddd.appLine();

                   }
                     */
   for(int yy=0;yy<subject[class_id][sub_id].no_of_specific_non_attendable;yy++)
  {
   day= calc_day(subject[class_id][sub_id].k[yy][0]);
   session=calc_session(subject[class_id][sub_id].k[yy][1]);
   if(subject[class_id][sub_id].k[yy][2].equals("NULL"))
   {
    period=54;
   }
   else
   {
     try
     {
   period=Integer.parseInt(subject[class_id][sub_id].k[yy][2]);
   period-=1;
        }
                          catch(Exception eeee)
                          {
                           qqq.add(""+eeee);
                          }

   }
  // ddd.app("converted day "+day);
  // ddd.app("conbverted sessuiobn "+session);
  // ddd.app("converted period "+period);
   }

     //  calculating for general non atttendable
         for(int kk=0;kk<ii;kk++)
 {
                      selected=0;

                            for(int yy=0;yy<subject[class_id][sub_id].no_of_specific_non_attendable;yy++)
   {
   day= calc_day(subject[class_id][sub_id].k[yy][0]);
   session=calc_session(subject[class_id][sub_id].k[yy][1]);
   if(subject[class_id][sub_id].k[yy][2].equals("NULL"))
   {
    period=54;
   }
   else
   {
     try
      {
    period=Integer.parseInt(subject[class_id][sub_id].k[yy][2]);
    period-=1;
        }
                          catch(Exception e)
                          {
                           qqq.add(""+e);
                          }
   }
 //  ddd.app("converted day "+day);
  // ddd.app("conbverted sessuiobn "+session);
  // ddd.app("converted period "+period);

   if(temp[kk]==day)
   {
      for(int dd=temp[kk+1];dd<(temp[kk+1]+continuous_period);dd++)
                           {  if(dd==period)
                             {
                              selected=1;
                              }
                           }
   }

     if(temp[kk]==day)
       {
         if(session==1)
          {
             if(temp[kk+1]<pan2.no_of_periods_session1)
             {
              selected=1;
             }
           }
          if(session==2)
            {
               if(temp[kk+1]>=(pan2.no_of_periods_session1))
                               {
                                selected=1;
                               }

            }
          }
       }
         if(selected == 0)
                         {
                           temp3[ss++]=temp[kk];
                           temp3[ss++]=temp[kk+1];
                           temp3[ss++]=temp[kk+2];
                         }
                kk+=2;

   }
      /*                  ddd.app("checking temp3 @@@@@@@@@@@@@@@@@@@@@");
                   ddd.app("the value of ss"+ss);
                     for(int kk=0;kk<ss;kk++)
                   {
                         ddd.ap(temp3[kk++]+" "+temp3[kk++]+" "+temp3[kk]+" ");
                       ddd.appLine();

                   }
                   */
                        for(int kk=0;kk<ss;kk++)
                        {
                         temp[kk]=temp3[kk];
                        }
                   /*         for(int kk=0;kk<ss;kk++)
                   {
                         ddd.ap(temp[kk++]+" "+temp[kk++]+" "+temp[kk]+" ");
                       ddd.appLine();

                   }
                     */

                   return ss;
  }

public int calc_generalNonattendable(int class_id,int sub_id,int ii,int continuous_period)
{
  int day=0,period=0,session=0,selected=0,ss=0,temp2[]=new int[500];
/*  for(int yy=0;yy<subject[class_id][sub_id].no_of_general_non_attendable;yy++)
  {
		    ddd.app("general not attendable day"+ subject[class_id][sub_id].h[yy][0]);
                    ddd.app("general not attendable sessoion"+subject[class_id][sub_id].h[yy][1]);
                    ddd.app("  general not attendable period"+subject[class_id][sub_id]. h[yy][2]);

  }
   ddd.app("***********before calculating general non atendable*********");
                     for(int kk=0;kk<ii;kk++)
                   {
                         ddd.ap(temp[kk++]+" "+temp[kk++]+" "+temp[kk]+" ");
                       ddd.appLine();

                   }
    */
   for(int yy=0;yy<subject[class_id][sub_id].no_of_general_non_attendable;yy++)
  {
   day= calc_day(subject[class_id][sub_id].h[yy][0]);
   session=calc_session(subject[class_id][sub_id].h[yy][1]);
   if(subject[class_id][sub_id].h[yy][2].equals("NULL"))
   {
    period=54;
   }
   else
   {
     try
      {
   period=Integer.parseInt(subject[class_id][sub_id].h[yy][2]);
   period-=1;
           }
     catch(Exception e)
        {
           qqq.add(""+e);
       }
   }
  // ddd.app("converted day "+day);
  // ddd.app("conbverted sessuiobn "+session);
  // ddd.app("converted period "+period);
   }
  //  calculating for general non atttendable
         for(int kk=0;kk<ii;kk++)
                   {
                      selected=0;
                   for(int yy=0;yy<subject[class_id][sub_id].no_of_general_non_attendable;yy++)
                      {
                        day= calc_day(subject[class_id][sub_id].h[yy][0]);
                        session=calc_session(subject[class_id][sub_id].h[yy][1]);
                          if(subject[class_id][sub_id].h[yy][2].equals("NULL"))
                            {
                                period=54;
                            }
                          else
                             {   try
                                  {
                                period=Integer.parseInt(subject[class_id][sub_id].h[yy][2]);
                                period-=1;
                                   }
                              catch(Exception e)
                                  {
                                   qqq.add(""+e);
                                  }
                             }

                             if(temp[kk]==day)
                             {
                              selected=1;
                             }
                             if(session==1)
                             {
                               if(temp[kk+1]<pan2.no_of_periods_session1)
                               {
                                selected=1;
                               }
                             }
                             if(session==2)
                             {
                               if(temp[kk+1]>=(pan2.no_of_periods_session1))
                               {
                                selected=1;
                               }
                             }
                            for(int dd=temp[kk+1];dd<(temp[kk+1]+continuous_period);dd++)
                           {  if(dd==period)
                             {
                              selected=1;
                             }
                            }
                         }
                         if(selected == 0)
                         {
                           temp2[ss++]=temp[kk];
                           temp2[ss++]=temp[kk+1];
                           temp2[ss++]=temp[kk+2];
                         }
                          kk+=2;
                      }
                //       ddd.app("the value of ss"+ss);
                     for(int kk=0;kk<ss;kk++)
                        {
                         temp[kk]=temp2[kk];
                        }
                  /*          for(int kk=0;kk<ss;kk++)
                   {
                         ddd.ap(temp[kk++]+" "+temp[kk++]+" "+temp[kk]+" ");
                       ddd.appLine();

                   }
                   */

 return ss;
}
public int calc_generalPriority(int class_id,int sub_id,int ii)
{
  int day=0,session=0,period=0,ss=0,settedd=0;
  int temp1[]=new int[500];
 /* ddd.app("***********before calculating general priorirty*********");
                     for(int kk=0;kk<ii;kk++)
                   {
                         ddd.ap(temp[kk++]+" "+temp[kk++]+" "+temp[kk]+" ");
                         ddd.appLine();

                   }
  ddd.app("***********after calculating general priorirty*********");
        	ddd.app("no of subject "+subject[class_id][sub_id].no_of_general_period);
                for( int dd=0;dd<subject[class_id][sub_id].no_of_general_period;dd++)
                {
		    	ddd.app("general day"+ subject[class_id][sub_id].b[dd][0]);
                    	ddd.app("general sessoion"+subject[class_id][sub_id]. b[dd][1]);
                    	ddd.app("general period"+subject[class_id][sub_id]. b[dd][2]);


                   }
                 ddd.app("after the conversion of days session &&&&&&&&&&&&&&&&&&&&&&&");
                 */
                       for( int dd=0;dd<subject[class_id][sub_id].no_of_general_period;dd++)
                {         day=calc_day(subject[class_id][sub_id].e[dd][0]);
                          session=calc_session(subject[class_id][sub_id]. e[dd][1]);
                          if(subject[class_id][sub_id]. e[dd][2].equals("NULL"))
                          {
                           period=54;
                          }
                          else
                          {
                          try{
                          period= Integer.parseInt( subject[class_id][sub_id]. e[dd][2]);
                             }
                          catch(Exception e)
                          {
                           qqq.add(""+e);
                          }
                          period-=1;
                          }
		   // 	ddd.app("general day"+ day);
                    //	ddd.app("general sessoion"+session);
                    //	ddd.app("general period"+period);


                   }
                   for(int kk=0;kk<ii;kk++)
                   {

                      for( int dd=0;dd<subject[class_id][sub_id].no_of_general_period;dd++)
                    {         day=calc_day(subject[class_id][sub_id].e[dd][0]);
                          session=calc_session(subject[class_id][sub_id]. e[dd][1]);
                          if(subject[class_id][sub_id]. e[dd][2].equals("NULL"))
                          {
                           period=54;
                          }
                          else
                          {
                             try
                              {
                          period= Integer.parseInt( subject[class_id][sub_id]. e[dd][2]);
                               }
                          catch(Exception e)
                          {
                           qqq.add(""+e);
                          }
                          }


                       if(temp[kk]==day)
                       {
                         settedd=1;
                       }
                        if(session==1)
                        {
                       if(temp[kk+1]<pan2.no_of_periods_session1)
                            { settedd=1;
                             }

                         }
                         if(session==2)
                         {
                           if(temp[kk+1]>=pan2.no_of_periods_session1 && temp[kk+1]<(pan2.no_of_periods_session1+pan2.no_of_periods_session2))
                            { settedd=1;
                             }
                         }
                         if(period==temp[kk+1])
                         {
                          settedd=1;
                         }
                      }
                    /*   ddd.app("#######checkup########################");
                       ddd.ap(temp[kk]+" "+temp[kk+1]+" "+temp[kk+2]+" ");
                       ddd.appLine();
                       */


                      if(settedd==1)
                      {
                      //    ddd.app("setteddddddddddddddddddddd");
                       temp1[ss++]=temp[kk];
                       temp1[ss++]=temp[kk+1];
                       temp1[ss++]=temp[kk+2];
                       settedd=0;
                      }
                      kk+=2;

                   }
             /*      ddd.app("checking temp1 @@@@@@@@@@@@@@@@@@@@@");
                   ddd.app("the value of ss"+ss);
                     for(int kk=0;kk<ss;kk++)
                   {
                         ddd.ap(temp1[kk++]+" "+temp1[kk++]+" "+temp1[kk]+" ");
                       ddd.appLine();

                   }
                   */
                        for(int kk=0;kk<ss;kk++)
                        {
                         temp[kk]=temp1[kk];
                        }
                /*            for(int kk=0;kk<ss;kk++)
                   {
                         ddd.ap(temp[kk++]+" "+temp[kk++]+" "+temp[kk]+" ");
                       ddd.appLine();

                   }  */
   return ss;


}
	public void calc_forcontinuousperiod()
	{
for(int i=0;i<pan2.no_of_classes;i++)
for(int j=0;j<info.no_of_subject[i];j++)
  		{
			if(subject[i][j].continuous_period>=1)
 			{
			 	System.out.println("continuous period setted");

		 	}
		 	else
		 	{
			  	System.out.println("continuous period not setted");
		 	}

	  	}



	}
	public void calc_anypriority()
	{
           int i,j,day,session,period;
for( i=0;i<counter_class;i++)
for( j=0;j<info.no_of_subject[i];j++)
  		{
			if(subject[i][j].priority_set==1)
 			{
			 	System.out.println("any priority");
				if(subject[i][j].generic_priority==1)
				{
					System.out.println("the generic priority setted");
					   //System.out.println(subject[i][j].general_day_selected_priority);
				}
				else
				{
					System.out.println("the generic priority not setted");
				}
				if(subject[i][j].specific_priority==1)
				{
	ddd.app("the period code"+subject[i][j].subject_code);





       System.out.println("no of specific period"+subject[i][j].no_of_specific_period);
      for(int k1=0;k1< subject[i][j].no_of_specific_period;k1++)
        {
          day=calc_day(subject[i][j].b[k1][0]);
 ddd.app("the specific day is "+day);

 session =      calc_session(subject[i][j].b[k1][1]);
ddd.app("the specific session is"+session);
 period= Integer.parseInt(subject[i][j].b[k1][2]);
ddd.app("the specific period is "+period);
ddd.app("the continous period is "+subject[i][j].specific_continuous[k1]);
subject[i][j].setted=1;
ddd.app("specific period is calculated classno day period" +i+day+period);
for(int aw=0;aw<subject[i][j].specific_continuous[k1];aw++)
{
ddd.app("first for loop entered");
sch[i][day][period-1].setted=1;

sch[i][day][period-1].round=1;

ddd.app("first statement  executed");
for(int k=0;k<subject[i][j].no_of_staff;k++)
{
 // System.out.println("for loop entered");
 ddd.app("second for loop entered");
for(int q=0;q<=info.total_no_of_staff;q++)
{
ddd.app("third for loop entered");
if(ss[q].staff_id==subject[i][j].staff_id[k])
{
ss[q].b[day][period-1]=1;
ss[q].a[day][period-1]=subject[i][j].subject_code;
ddd.app("first if statement entered");
}
}
}

sch[i][day][period-1].no_of_staff=subject[i][j].no_of_staff;
for(int k3=0;k3<subject[i][j].no_of_staff;k3++)
{
ddd.app("fourth for loop entered");
sch[i][day][period-1].staff_id[k3]=subject[i][j].staff_id[k3];
}
/*
for(int k=0;k<subject[i][j].no_of_staff;k++)
{
  ddd.app("fifith for loop entered");
for(int q=0;q<=info.total_no_of_staff;q++)
{
if(ss[q].staff_id==subject[i][j].staff_id[k])
{
ss[q].b[day][period-1]=1;
ss[q].a[day][period-1]=subject[i][j].subject_code;
}
}
}
*/
System.out.println("setted");
period++;
}

}


				}
				else
				{
					System.out.println("the specific priority not setted");
				}
		 	}
		 	else
		 	{
			  	System.out.println("no priority setted");
		 	}

	  	}

	}
  // *********************************************************************
  public int specific_periodPositions(int iq,int jq,int no_continous_period,int int_id,int parallel_period)
{
                    int tt=0,day=0,session=0,period=0,entered=0,temp1[]=new int[500];
                   // ddd.app("specific day"+ subject[iq][jq].b[int_id][0]);
                   // ddd.app("specific sessoion"+subject[iq][jq]. b[int_id][1]);
                   // ddd.app(" specific period"+subject[iq][jq]. b[int_id][2]);
                    day=calc_day(subject[iq][jq].b[int_id][0]);
                    //ddd.app("the specific day is "+day);

                    session =      calc_session(subject[iq][jq].b[int_id][1]);
                    //ddd.app("the specific session is"+session);
                       if(subject[iq][jq]. b[int_id][2].equals("NULL"))
                          {
                           period=54;
                          }
                          else
                          {

                          period= Integer.parseInt( subject[iq][jq]. b[int_id][2]);
                          period-=1;
                          }
                    //ddd.app("period "+period);;

                    if(session!=44)
                    {
                       //ddd.app("session calculation is entered");
                       //ddd.app("no of periods on session1 "+ pan2.no_of_periods_session1);
                       //ddd.app("no of periods on session2 "+ pan2.no_of_periods_session2);
                       //ddd.app(" no of continous period "+no_continous_period);

                       if(session==1)
                       {
                           // ddd.app("session1 calculation is entered");
                              for(int count_period=0;count_period<pan2.no_of_periods_session1;count_period++)
                            {
                             //  ddd.app("count period "+count_period);
                               for(int con=0;con<no_continous_period;con++)
                               {
                                 if( (count_period+con)>=pan2.no_of_periods_session1)
   	 					                      {
                          							entered=1;
                        						}

                               }
                                 if(entered==0)
                                    {
                                  //   ddd.app("entered "+count_period);
                                     temp1[tt]=day;
                                     temp1[++tt]=count_period;
                                     temp1[++tt]=1;
                                     tt++;
                                    }
                                 entered=0;
                            }
                       }
                       else
                       {
                          //   ddd.app("session2 calculation is entered");
                              for(int count_period=pan2.no_of_periods_session1;count_period<(pan2.no_of_periods_session2+pan2.no_of_periods_session1);count_period++)
                            {
                              //  ddd.app("count period "+count_period);
                                 for(int con=0;con<no_continous_period;con++)
                               {
                                 if( (count_period+con)>=(pan2.no_of_periods_session2+pan2.no_of_periods_session1))
                						          {
	                           						entered=1;
                           						}

                               }
                                 if(entered==0)
                                  {
                                //    ddd.app("entered "+count_period);
                                    temp1[tt]=day;
                                    temp1[++tt]=count_period;
                                    temp1[++tt]=1;
                                    tt++;
                                  }
                                  entered=0;
                            }



                       }

                    }


                    else
                    {

                     temp1[0]=day;
                     temp1[1]=period;
                     temp1[2]=1;
                     tt=3;

                    }
     /* ddd.app("BEFORE THE PARALLEL PERIOD");
       for(int hh=0;hh<tt;hh++)
                               {
                                ddd.app("   "+temp1[hh]+" "+temp1[++hh]+" "+temp1[++hh]);

                               }
     */

     for(int rr=0;rr<parallel_period;rr++)
      {
        for(int ss=0;ss<tt;ss=ss+3)
          {
           // ddd.app("ss "+ss+" rr "+rr);
            temp[(rr*tt)+ss]=temp1[ss];
            temp[(rr*tt)+ss+1]=temp1[ss+1];
            temp[(rr*tt)+ss+2]=(temp1[ss+2]+rr);

          }

      }
         return (tt*parallel_period);
}
// ******************************************88888888*******************
//********************************************************************************
      // for periods like nonattendable and priority and not lab
        	public int calc_specificPriority()
          {
int  no_continous_period=1,iq=0,jq=0,intt_id,entered=0,set=0,parallel=0;;
 ddd.app("THIS IS SPECIFIC PRIORITY PERIOD ALGORITHM");
 ddd.app("CURRENT BACKTRACK NO IN LAB "+current_backtrack_no);
if(back_set==1)
{
  if(current_backtrack_no<0)
         {
          ddd.app("SINCE THERE IS NO PERIODS TO BACKTRACK IAM QUITTING");
          //System.exit;
          return -2;
         }

ddd.app("MAKE SURE BACKSET==1 FOR THIS LOOP");
ddd.app("calc_lab backtrack entered");
iq= bb[current_backtrack_no].class_id;
jq=   bb[current_backtrack_no].subject_id;
subject[iq][jq].setted=0;
         no_continous_period=bb[current_backtrack_no].no_continous_period;
 intt_id=  bb[current_backtrack_no].internal_id;
subject[iq][jq].periodSetted[intt_id]=0;
ddd.app("FIRST BACK_SET==1 IS ENTEREDDDD in special period");
ddd.app("END OF BACKSET==1 IN SPECIAL PRIORITY");
ddd.app("IAM GOING TO CLEAR ALL THE BACKTRACK PERIODS");
clearing_periods(iq,jq,no_continous_period,intt_id );
ddd.app("I HAVE CLEARED");

back_set=0;
//display();
return -1;

}
//ddd.app("the value of iq and jq(incremented) is "+iq+" "+jq);
for(iq=0;iq<counter_class;iq++)
{

//ddd.app("the value of jq "+jq);
for(jq=0;jq<info.no_of_subject[iq];jq++)
  		{
               // ddd.app("the value of iq and jq(incremented) is "+iq+" "+jq);
                   if(subject[iq][jq].specific_priority==1 && subject[iq][jq].setted==0 )
    		     {
                    if(subject[iq][jq].lab==1)
                    {
                     ddd.app("THIS IS ALSO A LAB PERIOD ");
                     parallel=lab_info.no_parallel_possible;
                    }
                    else
                    {
                     ddd.app("NOT AN LAB");
                     parallel=1;
                    }
		                ddd.app("total internal id "+subject[iq][jq].internal_id);
                    intt_id=0;
                    ddd.app("no of specific period"+subject[iq][jq].no_of_specific_period);
                    ddd.app("internal id "+subject[iq][jq].internal_id);
                    for(int k1=0;k1< subject[iq][jq].no_of_specific_period;k1++)
                      {
                          if(  subject[iq][jq].periodSetted[k1]==0)
                             {
                                entered=1;
                                no_continous_period= subject[iq][jq].period[k1];
                                intt_id=k1;
                                ddd.app("I HAVE FOUND THE NO OF CONTINOUS PERIOD FOR NOT SETTED "+no_continous_period);
                                break;
                             }
                      }
                    if(entered==1)
                         {

                          ddd.app("RIGHT PROCEED NO PROBLEM");

                                /*           }
                              else
                                  {
                                ddd.app("THERE IS NO SPECIFIC PERIOD EVERTHING IS SETTED");
                               //subject[iq][jq].setted=1;
                                return -1;
                                }
                                 */
                            int iii=   specific_periodPositions(iq,jq,no_continous_period,intt_id,parallel);
                           /*    for(int hh=0;hh<iii;hh++)
                               {
                                ddd.app("   D"+temp[hh]+" P"+temp[++hh]+" R"+temp[++hh]);

                               }
                           */
                    if(iii<=0)
                             {
                               ddd.app("THERE IS NO PERIOD POSITIONS SO PLEASE BACKTRACK");
                               current_backtrack_no--;
                               back_set=1;
                               //calc_specialPriority_lab();
                               calc_specificPriority();

                               ddd.app("IAM RETURNING FROM CONDITION III<0 ");
                               return -1;
                             }
                             int result=0;
                     if(subject[iq][jq].lab==0)
                    {
                       result=   checkStaffFree_period(iq,jq,iii,no_continous_period,1,back_set,0,intt_id);
                    }
                    else
                    {
                        result=   checkStaffFree_lab(iq,jq,iii,no_continous_period,back_set,1,intt_id);
                    }
                     /* for(int qr=0;qr<iii;qr++)
                              {

                               ddd.ap(temp[qr]+" ");
					                     ddd.ap(temp[++qr]+" ");
                               ddd.app(temp[++qr]+" ");
                              }

                              */
                      if(result== -1)
                           {
                              ddd.app("NOT SETTED SO BACKTRACKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
                              current_backtrack_no--;
                              back_set=1;
                              calc_specialPriority();
                              ddd.app("IAM RETURNING FROM RESULT=-1");
                              return -1;
                           }
                       else
                           {
                              back_set=0;
                              ddd.app("I HAVE SETTED FOR PERIOD WHOSE INT ID "+intt_id);
                              subject[iq][jq].periodSetted[intt_id]=1;
                              subject[iq][jq].periodSettedDetail[intt_id][0]=current_day;
                              subject[iq][jq].periodSettedDetail[intt_id][1]=current_period;
                              ddd.app("the selected day "+subject[iq][jq].periodSettedDetail[intt_id][0]);
                              ddd.app("the selected period "+subject[iq][jq].periodSettedDetail[intt_id][1]);

                              for(int uu=0;uu<subject[iq][jq].internal_id;uu++)
                                  {
                                     if(  subject[iq][jq].periodSetted[uu]==0)
                                           {
                                              set=1;
                                            }

                                   }
                              if(set==0)
                                   {
                                      subject[iq][jq].setted=1;

                                    }
                               else
                                    {
                                        set=0;
                                        subject[iq][jq].setted=0;

                                    }
                                ddd.app("IAM RETURNING FROM RESULT=1");
                                return -1;

                             }
                     }
                  }
              }
        }
        return 1;
        }





//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	public void get()
	{

                                     int cc=0;
                                     int total_period=0,total_period_calc=0;
     		subject[counter_class][serial_no].class_name= info.name[serial_no];
     		subject[counter_class][serial_no].serialno=serial_no;
         subject[counter_class][serial_no].individual_id=serial_no+1;
         subject[counter_class][serial_no].group_id=counter_class+1;
                subject[counter_class][serial_no].class_name=tf16.getText();
                subject[counter_class][serial_no].subject_code=tf1.getText();

		/*if(c5.getState())
   		{
			subject[counter_class][serial_no].reserve_form=1;
                        System.out.println("the reserved form " +subject[counter_class][serial_no].reserve_form);
    		}*/
 		if(special_period_flag==1)
      		{
			subject[counter_class][serial_no].special_form=1;

       		}
special_period_flag=0;
if(c1.getState())
            	{
subject[counter_class][serial_no].lab=1;
subject[counter_class][serial_no].position_of_lab_in_group=++lab_counter;
ddd.app("lab counters********************"+lab_counter);
System.out.println("lab");
c2.setState(true);
// System.out.println(  subject[counter_class][serial_no].lab);
             	}
                if(c7.getState())
                {
		subject[counter_class][serial_no].generic_priority=1;

                }
                if(c8.getState())
                {
              		subject[counter_class][serial_no].specific_priority=1;
                }
                if(check1.getState())
                {
               		subject[counter_class][serial_no].general_day_selected_priority=1;
                }
                if(check2.getState())
                {
               		subject[counter_class][serial_no].general_session_selected_priority=1;
                }
                if(check3.getState())
                {
               		subject[counter_class][serial_no].general_period_selected_priority=1;
                }
                if(check4.getState())
                {
                	subject[counter_class][serial_no].specific_day_selected_priority=1;
                }
                if(check5.getState())
                {
                 	subject[counter_class][serial_no].specific_session_selected_priority=1;
                }
                if(check6.getState())
                {
                 	subject[counter_class][serial_no].specific_period_selected_priority=1;
                }
		if(check7.getState())
		{
			subject[counter_class][serial_no].general_day_selected_non_attendable=1;
		}
           	if(check8.getState())
		{
			subject[counter_class][serial_no].general_session_selected_non_attendable=1;
		}
		if(check9.getState())
		{
			subject[counter_class][serial_no].general_period_selected_non_attendable=1;
		}
		if(check10.getState())
		{
			subject[counter_class][serial_no].specific_day_selected_non_attendable=1;
		}
		if(check11.getState())
		{
			subject[counter_class][serial_no].specific_session_selected_non_attendable=1;
		}
		if(check12.getState())
		{
			subject[counter_class][serial_no].specific_period_selected_non_attendable=1;
		}
  		System.out.println("the specific day is" +subject[counter_class][serial_no].specific_day_selected_priority);
  		System.out.println("the specific session is "+subject[counter_class][serial_no].specific_session_selected_priority);
  		System.out.println("the specific period is "+subject[counter_class][serial_no].specific_period_selected_priority);
  		System.out.println("the generic day is "+subject[counter_class][serial_no].general_day_selected_priority);
  		System.out.println("the generic session is "+subject[counter_class][serial_no].general_session_selected_priority);
		System.out.println("the generic period is "+subject[counter_class][serial_no].general_period_selected_priority);
		System.out.println("the  specific day not attendanble is "+subject[counter_class][serial_no].specific_day_selected_non_attendable);
		System.out.println("the  specific session not attendanble is "+subject[counter_class][serial_no].specific_session_selected_non_attendable);
		System.out.println("the  specific period not attendanble is "+subject[counter_class][serial_no].specific_period_selected_non_attendable);
		System.out.println("the generic  day not attendanble is "+subject[counter_class][serial_no].general_day_selected_non_attendable);
		System.out.println("the generic  session not attendanble is "+subject[counter_class][serial_no].general_session_selected_non_attendable);
		System.out.println("the generic  period not attendanble is "+subject[counter_class][serial_no].general_period_selected_non_attendable);
               	if(c2.getState())
		{
    if( cont_enter==0)
 {
  qqq.add("CONTINOUS PERIOD NOT ALLOCATED");
 }

subject[counter_class][serial_no].continuous_period=1;
System.out.println("continuoussetted");
System.out.println(ch.getSelectedItem());
		}
		if(c3.getState())
		{
			subject[counter_class][serial_no].priority_set=1;
			System.out.println(" any priority setted");

		}
              ddd.app("gettttttttttttttttttttttttttttttttttttttttttttt");
              ddd.app("specific"+subject[counter_class][serial_no].no_of_specific_period);
            //    subject[counter_class][serial_no].specific_continuous[no_of_specific_period]=Integer.parseInt(ch50.getSelectedItem());
             for(int pp=0;pp<subject[counter_class][serial_no].no_of_specific_period;pp++)
             {
                 // subject[counter_class][serial_no].internal_id++;
                  subject[counter_class][serial_no].period[subject[counter_class][serial_no].internal_id]= subject[counter_class][serial_no].specific_continuous[pp];
                   subject[counter_class][serial_no].internal_id++;
                  //subject[counter_class][serial_no].specific_continuous[no_of_specific_period]
             }

                               ddd.app("continous"+subject[counter_class][serial_no].no_continuous_period);

               //ddd.app("continous"+cc);
               for(int tt=0;tt<subject[counter_class][serial_no].no_continuous_period;tt++)
            {

            subject[counter_class][serial_no].period[subject[counter_class][serial_no].internal_id]= subject[counter_class][serial_no]. continuous[tt];
            subject[counter_class][serial_no].internal_id++;
   //             subject[counter_class][serial_no].no_continuous_period=no_continuous_period;

             }

             for(int uu=0;uu<subject[counter_class][serial_no].internal_id;uu++)
          {
            ddd.app("no of period of each internal id "+ subject[counter_class][serial_no].period[uu]);
           total_period_calc=total_period_calc+subject[counter_class][serial_no].period[uu];
          }
          ddd.app("total period calculate "+total_period_calc);
          total_period=info.no_of_period[counter_class][serial_no];
          ddd.app("actual total period "+total_period);
         if(total_period_calc==total_period)
         {
          ddd.app("everyting was fine");

         }

         if(total_period_calc>total_period)
         {
            ddd.app("YOU MUST VERIFY THIS WHILE ENTERING BUT NOW NO SOLUTION");
         }

         if(total_period_calc<total_period)
         {
         for(int rr=total_period_calc;rr<total_period;rr++)
            {
               subject[counter_class][serial_no].period[subject[counter_class][serial_no].internal_id]= 1;
            subject[counter_class][serial_no].internal_id++;

            }

         }


             ddd.app("checking getttttttttttttttttttttt");
             ddd.app("internal id "+subject[counter_class][serial_no].internal_id);
                 no_of_round++;
               //  ee3.addItems();
        /*  for(int uu=0;uu<subject[counter_class][serial_no].internal_id;uu++)
          {
            ddd.app("no of period of each internal id "+ subject[counter_class][serial_no].period[uu]);
          }
          */

 cont_enter=0;
c1.setState(false);
c2.setState(false);
c3.setState(false);
c4.setState(false);
c5.setState(false);
c6.setState(false);
c7.setState(false);
c8.setState(false);
c9.setState(false);
c10.setState(false);
check1.setState(false);
check2.setState(false);
check3.setState(false);
check4.setState(false);
check5.setState(false);
check6.setState(false);
check7.setState(false);
check8.setState(false);
check9.setState(false);
check10.setState(false);
check11.setState(false);
check12.setState(false);
ch.disable();
ch1.disable();
ch2.disable();
ch3.disable();
ch4.disable();
ch5.disable();
ch6.disable();
ch7.disable();
ch8.disable();
ch9.disable();
ch10.disable();
ch11.disable();
ch12.disable();


c7.disable();
c8.disable();
c9.disable();
c10.disable();

l5.disable();
l6.disable();
l7.disable();
l8.disable();
l9.disable();
l10.disable();
l11.disable();
l12.disable();
l13.disable();
l14.disable();
l15.disable();
l16.disable();
l0.disable();

b5.disable();
b6.disable();
b7.disable();
b8.disable();
b9.disable();
b10.disable();
b11.disable();
b12.disable();
b13.disable();
b14.disable();

   www.appStar();
   www.app(" THE CLASS NO "+counter_class);
   www.app(" THE SUBJECT NO "+serial_no );
   www.app(" THE NO OF ROUND "+no_of_round);
   if(subject[counter_class][serial_no].lab==1)
   {
    www.app(" THIS SUBJECT IS LAB ");
   }
www.appLine();
//************************************************************8


   for(int ii=0;ii<subject[counter_class][serial_no]. no_of_staff;ii++)
		  		{
			    		www.app("THE STAFF ID "+subject[counter_class][serial_no].staff_id[ii]);
		  		}

www.appLine();
//************************************************************8

for(int ee=0;ee<  subject[counter_class][serial_no].no_continuous_period;ee++)
{
www.app("THE CONTINOUS PERIOD "+subject[counter_class][serial_no]. continuous[ee]);

 }
www.appLine();
//***************************************************************8
     for(int yy=0;yy<subject[counter_class][serial_no].no_of_general_non_attendable;yy++)
  {
  int day1,session1,period1;
   day1= calc_day(subject[counter_class][serial_no].h[yy][0]);
   session1=calc_session(subject[counter_class][serial_no].h[yy][1]);
   if(subject[counter_class][serial_no].h[yy][2].equals("NULL"))
   {
    period1=54;
   }
   else
   {
   period1=Integer.parseInt(subject[counter_class][serial_no].h[yy][2]);
   period1-=1;
   }
  www.app("GENERAL NONATTENDABLE DAY "+day1);
  www.app("GENERAL NONATTENDABLE SESSION "+session1);
  www.app("GENERAL NONATENDABLE PERIOD "+period1);
   }

   www.appLine();
//*************************************************************
//www.app(" no of specific non atednable "+subject[counter_class][serial_no].no_of_specific_non_attendable);
   for(int yy=0;yy<subject[counter_class][serial_no].no_of_specific_non_attendable;yy++)
  {
     int day1,session1,period1;
   day1= calc_day(subject[counter_class][serial_no].k[yy][0]);
   www.app("sesiion before passing "+subject[counter_class][serial_no].k[yy][1]);
   session1=calc_session(subject[counter_class][serial_no].k[yy][1]);
   if(subject[counter_class][serial_no].k[yy][2].equals("NULL"))
   {
    period1=54;
   }
   else
   {
   period1=Integer.parseInt(subject[counter_class][serial_no].k[yy][2]);
   period1-=1;
   }
   www.app("SPECIFIC NONATTENDABLE DAY "+day1);
   www.app("SPECIFIC NONATTENDABLE SESSION "+session1);
   www.app("SPECIFIC NONATTENDABLE PERIOD "+period1);
   }
//*************************************************************
  www.appLine();
           for( int dd=0;dd<subject[counter_class][serial_no].no_of_general_period;dd++)
                {
                        int day1,session1,period1;
                         day1=calc_day(subject[counter_class][serial_no].e[dd][0]);
                          session1=calc_session(subject[counter_class][serial_no]. e[dd][1]);
                          if(subject[counter_class][serial_no]. e[dd][2].equals("NULL"))
                          {
                           period1=54;
                          }
                          else
                          {
                          period1= Integer.parseInt( subject[counter_class][serial_no]. e[dd][2]);
                          period1-=1;
                          }
		    	www.app("GENERAL PRIORITY DAY "+ day1);
         	www.app("GENERAAL PRIORITY SESSION "+session1);
         	www.app("GENERAL PRIORITY PERIOD "+period1);


                   }


//*************************************************************
   www.appLine();


  for(int k1=0;k1< subject[counter_class][serial_no].no_of_specific_period;k1++)
        {
           int day1,session1,period1;
          day1=calc_day(subject[counter_class][serial_no].b[k1][0]);
 www.app("THE SPECIFIC DAY "+day1);

 session1 =      calc_session(subject[counter_class][serial_no].b[k1][1]);
www.app("THE SPECIFIC SESSION "+session1);
 if(subject[counter_class][serial_no].b[k1][2].equals("NULL"))
                          {
                           period1=54;
                          }
                          else
                          {
                          period1= Integer.parseInt( subject[counter_class][serial_no]. b[k1][2]);
                          period1-=1;
                          }

www.app("THE SPECIFIC PERIOD "+period1);
www.app("THE SPECIFIC CONTINOUS PERIOD "+subject[counter_class][serial_no].specific_continuous[k1]);

          }
www.appLine();
//*************************************************************8
 for(int uu=0;uu<subject[counter_class][serial_no].internal_id;uu++)
          {
            www.app("NO OF PERIOD FOR EACH INTERNAL ID "+ subject[counter_class][serial_no].period[uu]);
          }

//**************************************************************
www.appStar();
 total_intid+=subject[counter_class][serial_no].internal_id;
		serial_no++;
	}

	public void validation()
 	{

        	kk++;
                //   tf16.setText(info.name[k]);
                //System.out.println("no of sunject  "+info.no_of_subject[k]);
           www.appStar();
                www.app(" the value of kk "+kk);
                www.app("counter "+count);
                www.app(" info.total_no_of_suject "+info.total_no_of_subject);
         	if(count>=(info.total_no_of_subject))
          	{
b17.disable();
chhh.disable();
b1.enable();
b30.disable();
finished=1;
tf16.setText("");
           	}
		if(kk >=(( info.no_of_subject[k])))
       		{
k++;
kk=0;

                        counter_class++;
                          lab_counter=0;

                        serial_no=0;
                       www.app("the k is kk  "+k+" "+kk);
		        tf16.setText("");
                        tf16.setText(info.name[k]);

                }
                      tf1.setText(info.subject_id[k][kk]);
                      l50.setText("  "+info.no_of_period[k][kk]);
                      l51.setText("  "+info.no_of_period[k][kk]);
                      ddd.app("no of perid in validation "+info.no_of_period[k][kk]);
                       if(tf16.getText().equals("ALLS"))
                 {
c6.setState(true);
special_period_flag=1;

                 }

            //**    System.out.println("the k is "+k+" the kk is " +kk+" no of subject " +info.no_of_subject[k]);
      // www.app(" the counter class in validation "+counter_class);
      // www.app(" the value of serial in validation "+serial_no);
  		count++;
	}
     public void focusGained(FocusEvent fe)
   {
    //System.out.println("focus gained in third form");
   // www.app("focus gained in third form");
    if(detail.show==0)
    {
     www.setVisible(false);

    }
    if(detail.show==1)
    {
      if(!www.isVisible())
      {
        www.show();
       }
   }
    if(editt3.output1==1)
        {
       //  System.out.println("one");
       //  www.app("one");
         subject=new time_table[50][100];
         counter_class=0;
         serial_no=0;
         count=1;
         kk=0;
         lab_counter=0;
         k=0;
         info.total_no_of_subject=0;
         no_of_round=0;
         b1.disable();
         b17.disable();
         b18.enable();
         editt3.output1=0;
         }
                if(editt3.output1==2)
        {
         System.out.println("two");
         www.app("two");
         System.out.println(" no of backsteps "+editt3.back);
         www.app(" no of round before sub back "+no_of_round);
         www.app("counter before beginging "+counter_class);
         www.app("subject before begingig "+serial_no);
         if( (no_of_round - editt3.back) == 0)
         {
          www.app("continue from begiging");
          l50.setText("BEGIN");
          l51.setText("BEGIN");
          subject=new time_table[50][100];
         counter_class=0;
         serial_no=0;
         count=1;
         kk=0;
         lab_counter=0;
         k=0;
         info.total_no_of_subject=0;
         no_of_round=0;
         b1.disable();
         b17.disable();
         b18.enable();
         editt3.output1=0;


         }
         else
         {
         //back=editt3.back;
         counter_class=0;
         serial_no=0;
         count=1;
         kk=0;
         //lab_counter=0;
         k=0;
         //info.total_no_of_subject=0;
         no_of_round-=editt3.back;
         www.app("back "+editt3.back);
         www.app("no of round "+no_of_round);
         editt3.back=0;
         editt3.output1=0;
         www.app("counter before back "+counter_class);
         www.app("subject before back "+serial_no);

         for(int rr=0;rr<no_of_round;rr++)
         {
          www.app("validation");
          serial_no++;
          validation();
         }

       }
       ch30.enable(true);
         www.app("counter after back "+counter_class);
         www.app("subject after back "+serial_no);

     }
                if(editt3.output1==0)
        {
        // System.out.println("cancel third form");
        // www.app("cancel third form");
        }
   }
      public void focusLost(FocusEvent fe)
   {
    // System.out.println("focus lost in third form");
     can1.repaint();
    // www.app("focus lost in third form");
   }



	public void itemStateChanged(ItemEvent ee)
	{
	
		if(c6.getState())
		{
c4.disable();
c4.setState(false);
		}
    if(c1.getState())
    {
     c2.setState(true);
    }
   
		if(c2.getState())
		{

			l5.enable();
ch.enable();
b5.enable();
b6.enable();
		}
		if(c3.getState())
		{
c7.enable();
c8.enable();

		}
if(c3.getState()==false)
		{

c7.disable();
c7.setState(false);
c8.disable();
c8.setState(false);
b8.disable();
b7.disable();
check1.disable();
check2.disable();
check3.disable();

		}

		if(c4.getState())
		{
c9.enable();
c10.enable();
		}
				if(c4.getState()==false)
		{
c9.disable();
c9.setState(false);
c10.disable();
c10.setState(false);
		}
	
		if(c7.isEnabled()==true )
		{
                ddd.app("c7 is clicked*********************");
check1.enable();
check2.enable();
check3.enable();
if(check1.getState())
			{
l6.enable();
ch1.enable();
			}
			if(check2.getState())
			{
l7.enable();
ch5.enable();
			}
			if(check3.getState())
			{
l8.enable();
ch9.enable();
			}
b7.enable();
b8.enable();
		}
		if(c8.isEnabled()==true)
		{
                   ddd.app("c8 is clicked*********************");
check4.enable();

check5.enable();
check6.enable();
if(check4.getState())
			{
l0.enable();
ch2.enable();
			}
			if(check5.getState())
			{
l9.enable();
ch6.enable();
			}
			if(check6.getState())
			{
l10.enable();
ch10.enable();
			}
b9.enable();
b10.enable();



		}
		if(c9.isEnabled()==true)
		{
                ddd.app("c9 is clicked*********************");
check7.enable();

check8.enable();
check9.enable();
if(check7.getState())
			{
l11.enable();
ch3.enable();
			}
			if(check8.getState())
			{
l12.enable();
ch7.enable();
			}
			if(check9.getState())
			{
                        ddd.app("c9 is clicked*********************");
l13.enable();
ch11.enable();
			}
b11.enable();
b12.enable();
		}
		if(c10.isEnabled()==true)
		{
check10.enable();
check11.enable();
check12.enable();
if(check10.getState())
			{
l14.enable();
ch4.enable();
			}
			if(check11.getState())
			{
l15.enable();
ch8.enable();
			}
			if(check12.getState())
			{
l16.enable();
ch12.enable();
			}
b13.enable();
b14.enable();
		}
		if(c2.getState()==false)
		{
l5.disable();
ch.disable();
        	        b5.disable();
                	b6.disable();
		}
		if((c7.isEnabled()==false) || (c7.getState()==false))
		{
check1.disable();
check2.disable();
check3.disable();
l6.disable();
ch1.disable();
l7.disable();
ch5.disable();
l8.disable();
ch9.disable();
b7.disable();
b8.disable();
check1.setState(false);
check2.setState(false);
check3.setState(false);
		}
		if((c8.isEnabled()==false) ||(c8.getState()==false))
		{
l0.disable();
ch2.disable();
l9.disable();
ch6.disable();
l10.disable();
ch10.disable();
b9.disable();
b10.disable();
check4.disable();
check5.disable();
check6.disable();
check4.setState(false);
check5.setState(false);
check6.setState(false);
		}
		if((c9.isEnabled()==false) ||(c9.getState()==false))
		{
l11.disable();
ch3.disable();
l12.disable();
ch7.disable();
l13.disable();
ch11.disable();
b11.disable();
b12.disable();
check7.disable();
check8.disable();
check9.disable();
check7.setState(false);
check8.setState(false);
check9.setState(false);
		}
		if((c10.isEnabled()==false)||(c10.getState()==false))
		{
l14.disable();
ch4.disable();
l15.disable();
ch8.disable();
l16.disable();
ch12.disable();
b13.disable();
b14.disable();
check10.disable();
check11.disable();
check12.disable();
check10.setState(false);
check11.setState(false);
check12.setState(false);
		}

		if(check1.getState()==false)
		{
l6.disable();
ch1.disable();
		}
		if(check2.getState()==false)
		{
l7.disable();
ch5.disable();
		}
		if(check3.getState()==false)
		{
l8.disable();
ch9.disable();
		}
		if(check4.getState()==false)
		{
l0.disable();
ch2.disable();
		}
		if(check5.getState()==false)
		{
l9.disable();
ch6.disable();
		}
		if(check6.getState()==false)
		{
l10.disable();
ch10.disable();
		}
		if(check7.getState()==false)
		{
l11.disable();
ch3.disable();
		}
		if(check8.getState()==false)
		{
l12.disable();
ch7.disable();
		}
		if(check9.getState()==false)
		{
l13.disable();
ch11.disable();
		}
		if(check10.getState()==false)
		{
l14.disable();
ch4.disable();
		}
		if(check11.getState()==false)
		{
l15.disable();
ch8.disable();
		}
		if(check12.getState()==false)
		{
l16.disable();
ch12.disable();
		}

	}

}
        /* form 1 */
/**********************************************************************/


class pan2 extends Panel implements ActionListener,TextListener
{

                   scheduler par;
            error qqq;//=new error();
            int enter=0;
private int workdays,form2;
private int sessPeriod1;
private int sessPeriod2;
private Button ok;
Checkbox c1,c2;
CheckboxGroup cg;
	private TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tt,tf9;
	private Label l1,l2,l3,l4,l5,l6,l7,l8,l9,lab;
	private Panel np,sp,wp,ep,cp,emp1,emp2,emp3,emp4,p1,p2,p3,p4,p5,p6,p7,p8;
	private BorderLayout br;
	public String s1,s2,s3,s4,s5,s6;
  static String name_of_college,name_of_dept;
    static	int years,no_of_days,no_of_periods,no_of_periods_session1;
	static int no_of_periods_session2,no_of_classes,no_of_special_period;


   	pan2(scheduler parent)
	{

  par=parent;
setSize(700,550);
qqq=new error(parent,"ERROR");
setLayout(new BorderLayout());
       setBackground(new Color(157,248,140));
	        setForeground(new Color(1,2,63));
          lab=new Label(" SECOND FORM INPUT ");
          cg=new CheckboxGroup();
          c1=new Checkbox("MANUAL",cg,false);
          c2=new Checkbox("DATABASE",cg,true);
		np=new Panel();

               l9=new Label("NO OF SPECIAL PERIOD");
tf9=new TextField(10);
add(np,BorderLayout.NORTH);
sp=new Panel();
ok=new Button("       OK       ");
//ok.setSize(100,50);
ok.addActionListener( this);
sp.add(ok);
add(sp,BorderLayout.SOUTH);
ep=new Panel();
add(ep,BorderLayout.EAST);
wp=new Panel();
add(wp,BorderLayout.WEST);
cp=new Panel(new GridLayout(11,2));
emp3=new Panel();  //empty panel at the starting
cp.add(emp3);
emp4=new Panel();
cp.add(emp4);

p1=new Panel(new GridLayout(1,1));
l1=new Label("NAME");
cp.add(l1);
//setBackground(Color.yellow);
tf1=new TextField(25);
//tf1.setText(null);
p1.add(tf1);
cp.add(p1);

l2=new Label("YEAR");
cp.add(l2);
p2=new Panel(new GridLayout(1,1));
tf2=new TextField(25);
p2.add(tf2);
cp.add(p2);

l3=new Label("NameOfTheDEPT");
cp.add(l3);
p3=new Panel(new GridLayout(1,1));
tf3=new TextField(25);
//tf3.setBackground(Color.red);
p3.add(tf3);
cp.add(p3);

l4=new Label("NO.Of WorkingDays");
cp.add(l4);
p4=new Panel(new GridLayout(1,1));
tf4=new TextField(25);
p4.add(tf4);
cp.add(p4);

l5=new Label("No.Of periods/Day");
cp.add(l5);
p5=new Panel(new GridLayout(1,1));
tf5=new TextField(25);
p5.add(tf5);
cp.add(p5);

l6=new Label("No.Of Periods/Session1");
cp.add(l6);
p6=new Panel(new GridLayout(1,1));
tf6=new TextField(25);
p6.add(tf6);
cp.add(p6);

l7=new Label("No.Of Periods/Session2");
cp.add(l7);
p7=new Panel(new GridLayout(1,1));
tf7=new TextField(25);
p7.add(tf7);
cp.add(p7);

l8=new Label("No.Of Classes");
cp.add(l8);

p8=new Panel(new GridLayout(1,1));
tf8=new TextField(25);

	p8.add(tf8);
        // p8.add(l9);

	cp.add(p8);
         // cp.add(l9);
         emp2=new Panel(new GridLayout(1,1));
         emp2.add(lab);
cp.add(emp2);

	emp1=new Panel(new GridLayout(1,2));   //empty panel at the ending
          emp1.add(c1);
          emp1.add(c2);
	cp.add(emp1);


Panel emp5= new Panel();
emp5.add(cp);
add(cp,BorderLayout.CENTER);
setVisible(true);
tf1.setText("KARUNYA INSTITUTE OF TECH");
tf2.setText("2002");
tf3.setText("CSE DEPARTMENT");
tf4.setText("5");
tf5.setText("7");
tf6.setText("3");
tf7.setText("4");
tf8.setText("1");
         tf9.setText("0");
tf4.addTextListener(this);
tf5.addTextListener(this);
tf6.addTextListener(this);
tf7.addTextListener(this);
	}
public void textValueChanged(TextEvent te)
{
ok.enable();

}
public void actionPerformed(ActionEvent ae){

Button b=(Button)ae.getSource();
enter=0;


	name_of_college=tf1.getText();

s1=tf2.getText();//years
name_of_dept=tf3.getText();
s2=tf4.getText();
s3=tf5.getText();
s4=tf6.getText();
s5=tf7.getText();
s6=tf8.getText();
try {
years=Integer.parseInt(s1);
no_of_days=Integer.parseInt(s2);
no_of_periods=Integer.parseInt(s3);
no_of_periods_session1=Integer.parseInt(s4);
no_of_periods_session2=Integer.parseInt(s5);
no_of_classes=Integer.parseInt(s6);
        no_of_special_period=Integer.parseInt(tf9.getText());
        if(no_of_periods !=(no_of_periods_session1+no_of_periods_session2))
        {
         qqq.add("TOTAL PERIOD NOT EQUAL TO SUM OF SESSION PERIOD ");
         enter=1;
        }
        if(years<1)
        {
         qqq.add("INVALID YEAR");
         enter=1;
        }
    }
    catch(Exception e)
    {
         qqq.add(" "+e);
         enter=1;
    }
     if(enter==0)
       {
         ok.enable();
          
        }
        if(b==ok)
{
  System.out.println("okk");
  if(c1.getState()==true)
   {
    form2=1;
   }
   else
   {
    form2=2;
   }
    if(enter==0)
    {
    pan1.error=0;
    par.notice(form2);
    ok.disable();
    }

//  data d1=new data();
}
 	}

}
               /* form 2 */
/************************************************************************/

class pan5 extends Panel implements ActionListener,FocusListener
{

          static int x,bb10=0,bb11=0,bb12=0,bb13=0;
          scheduler parent;
       int   validate_no_period=0;
          Mycanvas ccc;
          log2 www=new log2();
          error qqq;
          static int round=0,round2=0;
          int class_counter,subject_counter,re_counter=0,special_counter=0;
	int class_counter1,subject_counter1,re_counter1=0;
Button b10= new Button("B10 CONTINUE");
Button b11= new Button("B11 CONTINUE");
	    Button b12= new Button("B12 END");
		    Button b13= new Button(" B13CONTINUE");

 Button b14= new Button(" B14END");
String a[];
Label l,m,l1,l2,l3,l4,l5,l6,l7;
        Label n=new Label("STAFF NAME");
Label o=new Label("STAFF ID");
	Label empty=new Label("       ");
	Label empty1=new Label("       ");
	Label empty2=new Label("       ");
	Label empty3=new Label("       ");
Label p=new Label("SUB_NAME");
Label q=new Label("SUB_CODE");
Label r=new Label("NO_PERIOD");
TextField tf31=new TextField(10);
TextField tf32=new TextField(10);
TextField tf33=new TextField(10);
TextField tf34=new TextField(10);
TextField tf35=new TextField(10);

 TextField tf=new TextField(10);
	TextField	tff=new TextField(10);
     TextField tfff=new TextField(10);
TextField tffff=new TextField(10);
public String name_class[]=new String[200];
          public  String middle;
        public int no_subject[]=new int[200];
public static int mid;
int i;
private Panel cp,sp,ep,wp,np,gl1,gl2;
private Button b1;
public static int count=0;
static int sub_counter=0;
static int total_loop;

          static int no_of_staff=0;
         boolean special_flag=false;

//subject sub[]=new subject[100];
pan5(scheduler parent){
this.parent=parent;
qqq = new error( parent,"ERROR");
   b13.disable();
setSize(700,550);
setLayout(new BorderLayout());
           l1=new Label("         ");
          l2=new Label("         ");
	  l3=new Label("         ");
 	  l4=new Label("         ");
          l5=new Label("          ");
          l6=new Label("          ");
          l7=new Label("          ");
                 setBackground(new Color(157,248,140));
	        setForeground(new Color(1,2,63));

Panel gl=new Panel(new GridLayout(1,1));
Panel gl0=new Panel(new GridLayout(1,1));
gl1=new Panel(new GridLayout(1,5));
gl2=new Panel(new GridLayout(1,9));
Panel gl3=new Panel(new GridLayout(1,6));
Panel gl4=new Panel(new GridLayout(1,1));
Panel gl5=new Panel(new GridLayout(1,1));

//np=new Panel(new GridLayout(1,5));

cp=new Panel(new GridLayout(3,1,0,110));
np=new Panel(new GridLayout(2,1,10,50));
wp=new Panel(new GridLayout(1,1));
wp.add(new Label("    "));

add(cp,BorderLayout.CENTER);
add(np,BorderLayout.NORTH);
add(wp,BorderLayout.WEST);


np.add(new Label("       "));
np.add(new Label("       "));

//cp.add(gl);
//cp.add(gl0);
cp.add(gl1);
cp.add(gl2);
cp.add(gl3);
//cp.add(gl4);
//cp.add(gl5);

//cp.add(gl2,BorderLayout.NORTH);
//add(cp,BorderLayout.CENTER);
		l=new Label("CLASS NAME");

	    m=new Label("NO OF SUBJECT");
/*gl2.add(l1);
gl2.add(l2);
                 gl2.add(l3);
gl2.add(l4);
gl2.add(l5);
*/
gl.add(empty);

gl0.add(empty2);



gl1.add(l);
gl1.add(tf);
gl1.add(m);
gl1.add(tff);
gl1.add(b10);


gl2.add(tf34);
gl2.add(tf35);
     gl2.add(p);
		gl2.add(tf31);
gl2.add(q);
gl2.add(tf32);
gl2.add(r);
gl2.add(tf33);
         gl2.add(b13);

gl3.add(n);
gl3.add(tfff);
gl3.add(o);
gl3.add(tffff);
gl3.add(b11);
	     gl3.add(b12);

gl4.add(empty1);
gl5.add(empty3);

ep=new Panel(new GridLayout(2,1));
ep.add(l6);
ep.add(l7);
            add(ep,BorderLayout.EAST);

	b1=new Button("  OK   ");
b1.disable();
b1.addActionListener(this);
b10.addActionListener(this);
	 b11.addActionListener(this);
         b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
tf.addFocusListener(this);
//tff.addFocusListener(this);
//addWindowListener(this);
        sp=new Panel(new GridLayout(2,1,10,50));


  Panel ppp=new Panel();

   ccc=new Mycanvas(www);
       sp.add(ccc);
// Graphics g= ccc.getGraphics();
// for(int i=0;i<200;i++)

// ccc.drawstring("*******",0,5,20,5);

	sp.add(ppp);
  ppp.add(b1);

	add(sp,BorderLayout.SOUTH);


	setVisible(true);

	}
   public void focusGained(FocusEvent fe)
   {
  // ccc.drawstring("*******",0,5,20,5);

    System.out.println("focus gained in secongd form");
  try
  {
    if(editt2.output==6)
    {
      b13.enable();
      sub_counter=0;
      class_counter=0;
      subject_counter=0;
      re_counter=0;
      special_counter=0;
    	class_counter1=0;
      subject_counter1=0;
      re_counter1=0;
      tf34.setText("");
      tf35.setText("");
      tf33.setText("");
      tf31.setText("");
      tf32.setText("");
      www.app("before deduction round "+round);
      www.app("the back3 "+editt2.back3);
       round-=editt2.back3;
      www.app("after debuction round "+round);
      if(round < 0)
      {
       round+=editt2.back3;
       qqq.add("THERE IS NO SUBJECT TO BACK");
      }
      else
      {
        reset();
        for(int i=0;i<round;i++)
        {
       accept();
       reset();
        }

      }
      editt2.output=0;


    }
    if(editt2.output==7)
    {
         www.app("seven");
         www.app(" the value of back2 "+editt2.back4);
         www.app("the value of round2 "+round2);
         no_of_staff-=editt2.back4;
         round2-=editt2.back4;
         if( (no_of_staff) < 0)
         {
           no_of_staff+=editt2.back4;
         round2+=editt2.back4;
           qqq.add("THERE IS NO STAFF TO BACK");
         }
         www.app("  no of staff  "+no_of_staff);
         editt2.back4=0;
         tfff.setText("");
         tffff.setText("");
         editt2.output=0;
         b11.enable();
         b12.enable();



    }
    if(editt2.output==5)
     {
      System.out.println("five");
      System.out.println("count before decution"+count);
      System.out.println("editt2.back2 "+editt2.back2);
      count-=editt2.back2;
      if(count<0)
      {
       qqq.add("THERE IS NO SUBJECT TO BACK");
       count+=editt2.back2;
      }
      editt2.back2=0;
      System.out.println("count after decution"+count);
      sub_counter=0;
      class_counter=0;
      subject_counter=0;
      re_counter=0;
      special_counter=0;
	    class_counter1=0;
      subject_counter1=0;
      re_counter1=0;

        b10.enable();
        b13.enable();
        tf.setText("");
        tff.setText("");
        tf34.setText("");
        tf35.setText("");
        tf33.setText("");
        tf31.setText("");
        tf32.setText("");
        editt2.output=0;
     }
    if(editt2.output==1)
        {
         System.out.println("one");
         count=0;
         sub_counter=0;
       class_counter=0;
       subject_counter=0;
       re_counter=0;
       special_counter=0;
	 class_counter1=0;
   subject_counter1=0;
   re_counter1=0;

         b10.enable();
         b13.enable();
         //b11.enable();
         //b12.enable();
          tf.setText("");
          tff.setText("");
         tf34.setText("");
        tf35.setText("");
         tf33.setText("");
         tf31.setText("");
        tf32.setText("");
        // b13.disable();
       editt2.output=0;
        }
                if(editt2.output==2)
        {
         System.out.println("two");
       b13.enable();
       sub_counter=0;
       class_counter=0;
       subject_counter=0;
       re_counter=0;
       special_counter=0;
	 class_counter1=0;
   subject_counter1=0;
   re_counter1=0;
   round=0;
       tf34.setText("");
        tf35.setText("");
         tf33.setText("");
         tf31.setText("");
        tf32.setText("");
        reset();
     editt2.output=0;
        }
                if(editt2.output==3)
        {
         System.out.println("three");
         no_of_staff=0;
         round2=0;
         tfff.setText("");
         tffff.setText("");
         editt2.output=0;
         b11.enable();
         b12.enable();
         editt2.output=0;
        }
                if(editt2.output==4)
        {
         System.out.println("four");
        //  System.out.println("one");
        round2=0;
         count=0;
         round=0;
         sub_counter=0;
       class_counter=0;
       subject_counter=0;
       re_counter=0;
       special_counter=0;
	 class_counter1=0;
   subject_counter1=0;
   re_counter1=0;
         System.out.println("two");
       b13.enable();
       sub_counter=0;
       class_counter=0;
       subject_counter=0;
       re_counter=0;
       special_counter=0;
	 class_counter1=0;
   subject_counter1=0;
   re_counter1=0;
       System.out.println("three");
         no_of_staff=0;
     b10.enable();
         b13.enable();
         b11.enable();
         b12.enable();
          tf.setText("");
          tff.setText("");
                    tfff.setText("");
         tffff.setText("");

         tf34.setText("");
        tf35.setText("");
         tf33.setText("");
         tf31.setText("");
        tf32.setText("");
        // b13.disable();
       editt2.output=0;
        }
                if(editt2.output==0)
        {
         System.out.println("cancel");
        }

       focuss();
   }
   catch(Exception eeep)
    {
     qqq.add(eeep+"");
    }

   }
   public void focuss()
   {
      if(b10.isEnabled())
     {
      bb10=1;

     }
     else
     {
      bb10=0;
     }
     if(b11.isEnabled())
     {
      bb11=1;

     }
     else
     {
      bb11=0;
     }

     if(b12.isEnabled())
     {
      bb12=1;

     }
     else
     {
      bb12=0;
     }
     if(b13.isEnabled())
     {
      bb13=1;

     }
     else
     {
      bb13=0;
     }
            if(detail.show==0)
    {
     www.hide();

    }
    if(detail.show==1)
    {
    if(!www.isVisible())
    {
     www.show();
    }


    }
   }
   public void focusLost(FocusEvent fe)
   {
     System.out.println("focus lost in secongd form");
   }
 public void database()
 {
  int a[]=new int[50],check=0,tot=0,tot_sub=0,tot_staff=0;
  int sub=0,total_subject=0;
    String ss[]=new String[50];
         System.out.println("data");
         String url="jdbc:odbc:sched";
         try
            {
             Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
             Connection mycon=DriverManager.getConnection(url);
                                    System.out.println("data1");
             Statement st=mycon.createStatement();
              int count=0;
              String classname1="NULL",c2="dai";
              ResultSet rs=st.executeQuery("select * from class_detail");
             //  classname1=rs.getString(1);
               System.out.println("data2");
              while(rs.next())
             {
                            classname1=rs.getString(1);
                            sub=rs.getInt(4);
                            System.out.println("data3");
                           // System.out.println(" class name "+classname1);
                            if(classname1.equals(c2))
                            {
				
                                count++;
				System.out.println(" individual sub "+sub);
                                total_subject=total_subject+sub;
                              System.out.println("if");   
                            }
                          else
                          {   
                              
                              System.out.println("else"); 
			 //System.out.println(" individual sub "+sub);
                          System.out.println("tot_sub "+total_subject);      
                              if(total_subject >(pan2.no_of_periods*pan2.no_of_days) )
                            {
				System.out.println(" overflow ");
                                pan1.error=1;
                                qqq.add(" database period overflow error at class"+(tot+1)); 
                                
                            }
                                 total_subject=0;   
                                total_subject=total_subject+sub;  
                             
                             
                            if(check==0)
                            {
                             check=1;
                            }
                            else
                            {
                             System.out.println(" count "+(count+1));
                             ss[tot]=c2;
                             a[tot]=(count+1);
                             tot++;

                             count=0;
                            }
                           
                          }
                          c2=classname1;
             }
                           System.out.println(" count "+(count+1));
			 //  total_subject=total_subject+sub;  
				System.out.println(" individual end sub "+sub);
                           System.out.println("tot_sub end "+total_subject);
                           if(total_subject >(pan2.no_of_periods*pan2.no_of_days) )
                            {
				System.out.println(" overflow ");
                                pan1.error=1;  
                                qqq.add(" database period overflow error at class "+(tot+1)); 
                                
                            }

                        
                             ss[tot]=c2;
                             a[tot]=(count+1);
                             tot++;
                               pan2.no_of_classes=tot;
                               pan2.no_of_special_period=0;
             ResultSet rss=st.executeQuery("select * from class_detail");

             // first row*********************************

            System.out.println(" no of classes "+pan2.no_of_classes);
     for(int i=0;i<pan2.no_of_classes;i++)
     {
		info.no_of_subject[i]=a[i];
    info.name[i]=ss[i];
     }

      for(int i=0;i<tot;i++)
     {
          System.out.println(" checking1 "+info.no_of_subject[i]);
             //  System.out.println(" checking2 "+info.name[i]);
     }





             //end of first row****************************************





              while(rss.next())
             {
             //int count=0;
              //           System.out.println("database");
              String classname=rss.getString(1);
              String subname=rss.getString(2);
              String subcode=rss.getString(3);
              int no_period=rss.getInt(4);
                  subjects.subject_name[tot_sub]=subname;
subjects.subject_id[tot_sub]=subcode;
subjects.no_of_period[tot_sub]=no_period;
subjects.total_subject=++tot_sub;
                         }
//info.total_no_of_subject=tot_sub;
System.out.println(" the total subject "+tot_sub);
for(int i=0;i<tot_sub;i++)
{
System.out.println(" subject name "+ subjects.subject_name[i]);
System.out.println(" subject id "+subjects.subject_id[i]);
System.out.println(" no of subject "+subjects.no_of_period[i]);



}
             tot_sub=0;
  for(int i=0;i<tot;i++)
  {
    for(int k=0;k<a[i];k++)
      {

				info.subject_name[i][k]=subjects.subject_id[tot_sub];
info.subject_id[i][k]=subjects.subject_id[tot_sub];
info.no_of_period[i][k]=subjects.no_of_period[tot_sub];
tot_sub++;
      }
        }
      System.out.println(" the total subject "+tot_sub);
        System.out.println(" the  subject  id of 1,1"+info.subject_id[1][1]);

             ResultSet rsss=st.executeQuery("select * from staff_detail");

       while(rsss.next())
       {

        info.staffid[tot_staff]=rsss.getString(2);
 info.staff_name[tot_staff]=rsss.getString(1);
 tot_staff++;

    }
    info.total_no_of_staff=(tot_staff-1);
    System.out.println(" tot_staff "+tot_staff);
    for(int i=0;i<tot_staff;i++)
    {
     System.out.println(" staff name "+info.staff_name[i]);
     System.out.println(" staff id  "+info.staffid[i]);
    }

             st.close();
               mycon.close();
                              }
            catch(Exception ex)
            {
              // System.out.println("exceptionn "+ex);
            }


 }
public void reset()
{   www.app("IN BEGINING OF FUNTION RESET");
 try
  {
    www.app("class_counter "+class_counter);
    www.app("subject counter "+subject_counter);
 if(class_counter<(pan2.no_of_classes+pan2.no_of_special_period))
    {

	if(subject_counter<(info.no_of_subject[class_counter]))
	{
		tf34.setText(info.name[class_counter]);
	         if(re_counter<info.no_of_subject[class_counter])
        	 {

		tf35.setText((re_counter+1)+"");
	           re_counter++;
        	 if(re_counter==info.no_of_subject[class_counter])
        	  	{
             	re_counter=0;
	        	}

         	}
          		subject_counter++;
                      
	         if(subject_counter==(info.no_of_subject[class_counter]))
        	       {
                	 class_counter++;
		         subject_counter=0;
                         
                            
                	}
         }}

       else
        {

              b13.disable();
tf34.setText("");
tf35.setText("");




        }



 www.app("IN END OF FUNTION RESET");
    www.app("class_counter "+class_counter);
    www.app("subject counter "+subject_counter);
    www.appLine();
   }
   catch(Exception er)
   {
    qqq.add(er+"");
   }

}
public void accept()
{


    www.app("IN BEGINING OF FUNTION ACCEPT");
   try
   {
    www.app("class_counter1 "+class_counter1);
    www.app("subject counter1 "+subject_counter1);

 if(class_counter1<(pan2.no_of_classes+pan2.no_of_special_period))
    {

	if(subject_counter1<(info.no_of_subject[class_counter1]))
	{

		tf34.setText(info.name[class_counter1]);
	         if(re_counter1<info.no_of_subject[class_counter1])
        	 {

				info.subject_name[class_counter1][subject_counter1]=tf31.getText();
info.subject_id[class_counter1][subject_counter1]=tf32.getText();
info.no_of_period[class_counter1][subject_counter1]=Integer.parseInt(tf33.getText());
www.app("class_count,subject_counter,subject name"+class_counter1+subject_counter1+info.subject_name[class_counter1][subject_counter1]);

tf31.setText("");
tf32.setText("");
tf33.setText("");

	           re_counter1++;
        	 if(re_counter1==info.no_of_subject[class_counter1])
        	  	{
             	re_counter1=0;
	        	}

         	}
          		subject_counter1++;
	         if(subject_counter1==(info.no_of_subject[class_counter1]))
        	       {
                	 class_counter1++;
		         subject_counter1=0;
                	}
         }

     }


            else
                  {
                       System.out.println("i disabled");
                    b13.disable();


                    }


    www.app("IN END OF FUNTION RESET");
    www.app("class_counter1 "+class_counter1);
    www.app("subject counter1 "+subject_counter1);
    www.appLine();
    }
    catch(Exception ex)
    {
     qqq.add(ex+"");
    }
}
public void special_input()
{

 try
 {
if(special_counter<pan2.no_of_special_period)
     {
       tf.setText("ALL");
        System.out.println("special counter "+special_counter);
       special_counter++;
     if(special_counter==pan2.no_of_special_period)
             {
           System.out.println(" else special counter "+special_counter);
             b10.disable();
              special_counter=0;
             }

       }

  }
  catch(Exception ec)
  {
   qqq.add(ec+"");
  }
}

public void actionPerformed(ActionEvent ae)
{
 x=pan2.no_of_classes;

 int total=0;

String s = ae.getActionCommand();
Button ref=(Button)ae.getSource();
if(ref==b1)
{

b1.disable();
parent.notice(3);

}
if(ref==b12)
{
try
{
 info.staffid[no_of_staff]=tffff.getText();
 info.staff_name[no_of_staff]=tfff.getText();
 no_of_staff++;
// info.total_no_of_staff=no_of_staff;
 tfff.setText("");
tffff.setText("");
   www.app("NO OF STAFF =  "+no_of_staff);

        www.app("STAFF NAME  =  "+info.staff_name[no_of_staff-1]);
        www.app("STAFF ID    =  "+info.staffid[no_of_staff-1]);
           www.app(" info.total_no_of_staff "+info.total_no_of_staff);
        www.appLine();
        www.appStar();
        round2++;
 b11.disable();
b12.disable();
  b1.enable();
  }
  catch(Exception ep)
  {
   qqq.add(ep+"");
  }
}

if(ref==b10)
{

 // System.out.println("count no of classes special class"+count+pan2.no_of_classes+pan2.no_of_special_period);
 try
 {

       if(count<(pan2.no_of_classes+pan2.no_of_special_period))
 {
middle=tff.getText();

		info.no_of_subject[count]=Integer.parseInt(middle);
		info.name[count]=tf.getText();

           System.out.println(info.no_of_subject[count]);

	   }
    				tf.setText("");
tff.setText("");
count++;
www.app("COUNT        = "+count);
www.app("NAME         = "+info.name[count-1]);
www.app("NO OF SUBJECT = "+info.no_of_subject[count-1]);
www.appLine();


        if((count>=pan2.no_of_classes) && (count<(pan2.no_of_classes+pan2.no_of_special_period)))
        {
           tf.setText("ALLS");

         }

        if(count==(pan2.no_of_classes+pan2.no_of_special_period))
         {
           reset();
               b10.disable();
               b13.enable();


         }
    }
    catch(Exception ep)
  {
   qqq.add(ep+"");
  }
 }


if(ref==b11)
{
//static String staffid[]=new String[100];
//static int total_no_of_staff;

 try
 {
info.staffid[no_of_staff]=tffff.getText();
info.staff_name[no_of_staff]=tfff.getText();
tfff.setText("");
tffff.setText("");
        no_of_staff++;
        round2++;
        www.app("NO OF STAFF =  "+no_of_staff);
        www.app("STAFF NAME  =  "+info.staff_name[no_of_staff-1]);
        www.app("STAFF ID    =  "+info.staffid[no_of_staff-1]);
        info.total_no_of_staff=no_of_staff;

     www.app(" info.total_no_of_staff "+info.total_no_of_staff);
        www.appLine();
  }
  catch(Exception ep)
  {
   qqq.add(ep+"");
  }
}
if(ref==b13)
{
//sub[sub_counter]=new subject();
try
{
System.out.println(" subject counter "+subject_counter);
if(subject_counter==1)
{
 validate_no_period=0;
}
www.app("BEGINGIN OF B13");
round++;
int tt=0;
tt=(Integer.parseInt(tf33.getText()));

www.app(" NO OF ROUNDS "+round);
validate_no_period=validate_no_period+tt;
System.out.println(" no of validated period "+validate_no_period);
if(tt<=0)
{
 qqq.add(" no of period cannot be less than or zero ");

}
else
{
if(validate_no_period>(pan2.no_of_periods*pan2.no_of_days ))
{

qqq.add(" PERIOD LIMIT EXCEEDED ");
validate_no_period-=tt;
}
else
{

subjects.subject_name[sub_counter]=tf31.getText();
subjects.subject_id[sub_counter]=(tf32.getText());

subjects.no_of_period[sub_counter]=Integer.parseInt(tf33.getText());
//sub_counter++;
//subjects.total_period=subjects.no_of_period[sub_counter];
subjects.total_subject=++sub_counter;
www.app("subjects.subject_name[sub_counter] "+subjects.subject_name[sub_counter]);
www.app("subjects.subject_id[sub_counter] "+subjects.subject_id[sub_counter]);
//www.app(subjects.no_of_period[sub_counter]=Integer.parseInt(tf33.getText());
//sub_counter++;
www.app("subjects.total_subject "+subjects.total_subject);
//www.app("subjects.total_period "+subjects.total_period);
www.appLine();
accept();
reset();
www.app("END OF B13");
www.appStar();
}
}
 }
 catch(Exception ep)
  {
   qqq.add(ep+"");
  }

}
 focuss();
}


 }

class disp extends Frame implements KeyListener
{

TextArea ta=new TextArea();

disp()
{
super("for displaying");
setVisible(false);
setSize(500,500);
this.add(ta);
ta.addKeyListener(this);
}
public void keyPressed(KeyEvent ke)
     {
     System.out.println("keypreessed even");
     //ddd.app("key pressed");
      int key=ke.getKeyCode();
       if(key==KeyEvent.VK_F1)
       {
        pan1.esc_key=1;
       }

     }
     public void keyReleased(KeyEvent ke)
     { }
     public void keyTyped(KeyEvent ke)
     { }

public void settext(String ss)
{
 ta.setText(ss);
}
public void app(String  data)
{
ta.append(data);
ta.append("\n");
}
public void ap(String data1)
 {
ta.append(data1);

}
public void appLine()
{
ta.append("\n");
}

}

class error extends Dialog implements  WindowListener,ActionListener
{
Panel p1=new Panel(new BorderLayout());
Panel p2=new Panel();
Label taa=new Label("ERROR");
Button b1=new Button(" OK  ");
error(Frame parent,String str)
{
super( parent,"ERROR FILE");
setVisible(false);
setSize(350,100);
setLocation(200,200);
setLayout(new GridLayout(2,1));

//setResizable(false);
//setBounds(200,200,450,260);
//taa.setBounds(10,30,220,60);
//b1.setBounds(100,150,150,170);
add(p1);
add(p2);

p1.add(taa,BorderLayout.CENTER);
p2.add(b1);
b1.addActionListener(this);
// addWindowListener(this);
}
public void actionPerformed(ActionEvent ae)
{
 setVisible(false);
}
public void windowActivated(WindowEvent we)
{  }
public void windowDeactivated(WindowEvent we)
{
 setVisible(false);
}
public void windowClosed(WindowEvent we){ }
public void windowClosing(WindowEvent we){ }
public void windowDeiconified(WindowEvent we){ }
public void windowIconified(WindowEvent we){ }
public void windowOpened(WindowEvent we){ }
public void add(String  data)
{
//setFocus();
//taa.setText("");
setVisible(true);
taa.setText("    "+data+"  ");
//taa.append("\n");
}
public void ad(String data1)
 {
//setFocus();
taa.setText("data1");
setVisible(true);
//taa.append(data1);

}


}
class editt2 extends Dialog implements ActionListener,FocusListener
{
  Checkbox cc1,cc2,cc3,cc4,cc5,cc6,cc7;
  Choice ch1,ch2,ch3;
  Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
  Panel p1,p2;
  Button bb1,bb2;
  static int output=0,back2=0,back3=0,back4=0;
  static int max1=0,max2=0,max3=0;

  CheckboxGroup cc=new CheckboxGroup();
 editt2(Frame parent)
  {
    super(parent,"EDIT FILE ");
    System.out.println("editt2 is activated");
    setVisible(false);
    setLayout(new BorderLayout());
    setSize(400,400);
    ch1=new Choice();
    this.setBackground(new Color(120,130,140));

    cc1=new Checkbox(" ",cc,true);
    cc2=new Checkbox(" ",cc,false);
    cc3=new Checkbox(" ",cc,false);
    cc4=new Checkbox(" ",cc,false);
    cc5=new Checkbox(" ",cc,false);
    cc6=new Checkbox(" ",cc,false);
    cc7=new Checkbox(" ",cc,false);
    bb1=new Button("   OK    ");
    bb2=new Button("CANCEL ");
    l1=new Label("CLEAR FIRST ROW");
    l2=new Label("CLEAR SECOND ROW");
    l3=new Label("CLEAR THIRD ROW");
    l4=new Label("CLEAR ALL s");
    l5=new Label("MOVE N BACK IN FIRST ROW");
    l6=new Label("MOVE N BACK IN SECOND ROW");
    l7=new Label("MOVE N BACK IN THIRD ROW");
    l8=new Label(" ");
    l9=new Label(" ");
    l10=new Label(" ");
    ch1=new Choice();
    ch2=new Choice();
    ch3=new Choice();
    p1=new Panel();
    p2=new Panel();
    this.add(p1,BorderLayout.CENTER);
    this.add(p2,BorderLayout.SOUTH);
    p1.setLayout(new GridLayout(4,5));
    p1.add(cc1);
    p1.add(l1);
    p1.add(cc5);
    p1.add(l5);
    p1.add(ch1);

    p1.add(cc2);
    p1.add(l2);
    p1.add(cc6);
    p1.add(l6);
    p1.add(ch2);

    p1.add(cc3);
    p1.add(l3);
    p1.add(cc7);
    p1.add(l7);
    p1.add(ch3);

    p1.add(l8);
    p1.add(cc4);
    p1.add(l4);
    p1.add(l9);
    p1.add(l10);

    p2.add(bb1);
    p2.add(bb2);
    bb1.addActionListener(this);
    bb2.addActionListener(this);
    cc1.addFocusListener(this);


  }
  public void focusGained(FocusEvent fe)
  {
   System.out.println("foccused");
   setSize(400,400);
   System.out.println(" THE COUNT AND MAX "+pan5.count +" "+max1);
   if(pan5.count > max1)
   {
    for(int uu=max1;uu<(pan5.count);uu++)
      {
     ch1.addItem(""+(uu+1));

      }

    max1=pan5.count;
    //ch1.removeItem(1);
   }
      System.out.println(" THE ROUND AND MAX2 "+pan5.round +" "+max2);
   if(pan5.round > max2)
   {
    for(int uu=max2;uu<(pan5.round);uu++)
      {
     ch2.addItem(""+(uu+1));

      }

    max2=pan5.round;

    //ch1.removeItem(1);
   }
      System.out.println(" THE ROUND2 AND MAX3 "+pan5.round2 +" "+max3);
   if(pan5.round2 > max3)
   {
    for(int uu=max3;uu<(pan5.round2);uu++)
      {
     ch3.addItem(""+(uu+1));

      }

    max3=pan5.round2;
    //ch1.removeItem(1);
   }

   //ch1=new Choice();
   System.out.println("count in focus gainged "+pan5.count);
      cc5.disable();
      cc6.disable();
      cc7.disable();
   if(pan5.bb10==1)
    {
       cc5.enable();
    }

    if(pan5.bb13==1)
    {
       cc6.enable();
    }
    if(pan5.bb12==1)
    {
       cc7.enable();
    }
  }
  public void focusLost(FocusEvent fe)
  {
   System.out.println("focus lost");
      //     setVisible(false);
  // this.dispose();
  }
   public void actionPerformed(ActionEvent ae)
   {
     Button b1=(Button)ae.getSource();
     if(b1==bb1)
      {
       System.out.println("bb1 is pressed");
       if(cc1.getState())
       {
       output=1;
       }
       if(cc2.getState())
       {
       output=2;
       }
       if(cc3.getState())
       {
       output=3;
       }
       if(cc4.getState())
       {
       output=4;
       }
       if(cc5.getState())
       {
        output=5;
        if(ch1.isValid())
        {
         System.out.println("invalid selection");
         output=0;
        }
        else
        {
        back2=Integer.parseInt(ch1.getSelectedItem());
        System.out.println(" the value of back2 "+back2);
        }
       }
       if(cc6.getState())
       {
        output=6;
        if(ch2.isValid())
        {
         System.out.println("invalid selection");
         output=0;
        }
        else
        {
        back3=Integer.parseInt(ch2.getSelectedItem());
        System.out.println(" the value of back3 "+back3);
        }
       }
       if(cc7.getState())
       {
        output=7;
        if(ch3.isValid())
        {
         System.out.println("invalid selection");
         output=0;
        }
        else
        {
        back4=Integer.parseInt(ch3.getSelectedItem());
        }
        System.out.println(" the value of back4 "+back4);
       }
        System.out.println(" output "+output);

        setVisible(false);

      }
     if(b1==bb2)
      {
       System.out.println("bb2 is pressed");
       output=0;
      System.out.println(" output "+output);
              setVisible(false);
//       this.dispose();
      }
   }


}
class log2 extends Frame implements FocusListener
{

 TextArea tta=new TextArea();
log2()
{
super("FORM2 LOG FILE");
setVisible(false);
setSize(500,500);
this.add(tta);
tta.addFocusListener(this);
addFocusListener(this);

}
public void focusGained(FocusEvent fe)
  {
   System.out.println("foccused logfile");
   }
  public void focusLost(FocusEvent fe)
  {
   System.out.println("foccus lost logfile");
  }
public void settext(String ss)
{
 tta.setText(ss);
}
public  void appStar()
{
  tta.append("\n");
  tta.append("**************************************************************************************");
  tta.append("\n");
}
public  void appLine()
{
  //tta.append("\n");
  tta.append("--------------------------------------------------------------------------------------");
  tta.append("\n");
}
public  void app(String  data)
{
tta.append(data);
tta.append("\n");
}
public  void ap(String data1)
 {
tta.append(data1);

}
public  void appEline()
{
tta.append("\n");
}

}

class editt3 extends Dialog implements ActionListener,FocusListener
{
  Checkbox cc1,cc2;
  Label l1,l2,l3;
  Panel p1,p2;
  Button bb1,bb2;
  Choice ccc=new Choice();
  static int output1=0;
  static int back=0;
 editt3(Frame parent)
  {
    super(parent,"EDIT FILE ");
    setVisible(false);
    setLayout(new BorderLayout());
    setSize(500,400);
    this.setBackground(new Color(120,130,140));

    CheckboxGroup cc=new CheckboxGroup();
    cc1=new Checkbox(" ",cc,true);
    cc2=new Checkbox(" ",cc,false);
    //cc3=new Checkbox(" ",cc,false);
    //cc4=new Checkbox(" ",cc,false);
    bb1=new Button("OK     ");
    bb2=new Button("CANCEL ");
    l1=new Label("BACK TO PREVIOUS FORM");
    l2=new Label("BACK N STEP IN SAME FORM");
    l3=new Label("      ");

    //l3=new Label("CLEAR THIRD ROW");
    //l4=new Label("CLEAR ALL ROW");
    p1=new Panel();
    p2=new Panel();
    this.add(p1,BorderLayout.CENTER);
    this.add(p2,BorderLayout.SOUTH);
    p1.setLayout(new GridLayout(2,3));
    p1.add(cc1);
    p1.add(l1);
    p1.add(l3);
    p1.add(cc2);
    p1.add(l2);
    p1.add(ccc);
    /*p1.add(cc3);
    p1.add(l3);
    p1.add(cc4);
    p1.add(l4);
      */
    p2.add(bb1);
    p2.add(bb2);
    bb1.addActionListener(this);
    bb2.addActionListener(this);
    cc1.addFocusListener(this);

  }
 /* public void addItems()
  {
   for(int i=0;i<pan1.no_of_round;i++)
   {
    ccc.addItem(""+(i+1));
   }
  }
  */
  public void focusGained(FocusEvent fe)
  {
   System.out.println("foccused editt3");
    for(int i=0;i<pan1.no_of_round;i++)
   {
    ccc.addItem(""+(i+1));
   }
  }
  public void focusLost(FocusEvent fe)
  {
   System.out.println("focus lost editt3");
       //    setVisible(false);
  // this.dispose();
  }
   public void actionPerformed(ActionEvent ae)
   {
     Button b1=(Button)ae.getSource();
     if(b1==bb1)
      {
       System.out.println("bb1 is pressed");
       if(cc1.getState())
       {
       output1=1;
       }
       if(cc2.getState())
       {
       output1=2;
       back=Integer.parseInt(ccc.getSelectedItem());

       }
        System.out.println(" output1 "+output1);

        setVisible(false);

      }
     if(b1==bb2)
      {
       System.out.println("bb2 is pressed");
       output1=0;
       System.out.println(" output1 "+output1);
              setVisible(false);
//       this.dispose();
      }
   }


}
class options extends Dialog implements ActionListener
{
 Panel p1,p2,p3,p4,p5,p6;
 Checkbox c0,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;
 CheckboxGroup cg1,cg2,cg3,cg4,cg5,cg6,cg7;
 Label l1,l2,l3,l4,l5,l6;
 Label el1,el2,el3,el4,el5,el6,el7,el8,el9,el10,el11,el12,el13,el14,el15;
 Button b1,b2;
 Choice cc;
options(Frame parent)
{
super(parent,"OPTIONS");
setVisible(false);
setSize(600,550);
setLayout(new GridLayout(6,1,10,10));
setBackground(new Color(80,100,20));
setForeground(new Color(50,250,10));
p1=new Panel();
p2=new Panel();
p3=new Panel();
p4=new Panel();
p5=new Panel();
p6=new Panel();

add(p1);
add(p2);
add(p3);
add(p6);
add(p4);
add(p5);

cg1=new CheckboxGroup();
cg2=new CheckboxGroup();
cg3=new CheckboxGroup();
cg4=new CheckboxGroup();
cg5=new CheckboxGroup();
cg6=new CheckboxGroup();
cg7=new CheckboxGroup();

c1=new Checkbox("END OF SESSION",cg1,true);
c2=new Checkbox("START OF SESSION",cg1,false);
c0=new Checkbox("ANY PERIOD",cg1,false);
c3=new Checkbox("NOT IN SAME DAY",cg2,true);
c4=new Checkbox("FOR ANY DAY",cg2,false);
c5=new Checkbox("ALTERNATIVE",cg3,true);
c6=new Checkbox("CONSECUTIVE",cg3,false);
c7=new Checkbox("ANY WAY",cg3,false);

c8=new Checkbox("SHOW",cg4,true);
c9=new Checkbox("DONT SHOW",cg4,false);

c10=new Checkbox("NORMAL",cg5,true);
c11=new Checkbox("DEBUGGING",cg5,false);

c12=new Checkbox("SUBJECT NAME",cg6,true);
c13=new Checkbox("SUBJECT CODE",cg6,false);

c14=new Checkbox("RANDOM",cg7,true);
c15=new Checkbox("SEQUENCIAL",cg7,false);

l1=new Label("LAB");
l1.setForeground(new Color(250,50,0));
l2=new Label("NO OF PARALLEL PERIOD POSSIBLE");
l2.setForeground(new Color(250,50,0));
l3=new Label("ALLOCATION");
l3.setForeground(new Color(250,50,0));
l4=new Label("LOG FILE");
l4.setForeground(new Color(250,50,0));
l5=new Label("MODE");
l5.setForeground(new Color(250,50,0));
l6=new Label("OUTPUT");
l6.setForeground(new Color(250,50,0));

el1=new Label("      ");
el2=new Label("      ");
el3=new Label("      ");
el4=new Label("      ");
el5=new Label("      ");
el6=new Label("      ");
el7=new Label("      ");
el8=new Label("      ");
el9=new Label("      ");
el10=new Label("      ");
el11=new Label("      ");
el12=new Label("      ");
el13=new Label("      ");
el14=new Label("      ");
el15=new Label("      ");


cc=new Choice();
cc.setForeground(new Color(0,40,10));
cc.addItem("1");
cc.addItem("2");
cc.addItem("3");
cc.addItem("4");
cc.addItem("5");

p1.setLayout(new GridLayout(5,3,5,5));
p1.add(l1);
p1.add(el1);
p1.add(el2);
p1.add(c1);
p1.add(c2);
p1.add(c0);
p1.add(c3);
p1.add(c4);
p1.add(el4);
p1.add(c5);
p1.add(c6);
p1.add(c7);
p1.add(l2);
p1.add(cc);
p1.add(el8);

p2.setLayout(new GridLayout(2,2,5,5));
p2.add(l4);
p2.add(el5);
p2.add(c8);
p2.add(c9);

p3.setLayout(new GridLayout(2,2,5,5));
p3.add(l5);
p3.add(el6);
p3.add(c10);
p3.add(c11);

p4.setLayout(new GridLayout(2,2,5,5));
p4.add(l6);
p4.add(el9);
p4.add(c12);
p4.add(c13);

p6.setLayout(new GridLayout(2,2,5,5));
p6.add(l3);
p6.add(el7);
p6.add(c14);
p6.add(c15);


p5.setLayout(new GridLayout(2,4,5,5));
//p5.setLayout(null);
b1=new Button("ACCEPT");
b2=new Button("CANCEL");
b1.setForeground(new Color(20,20,0));
b2.setForeground(new Color(20,20,0));

//Point p=new Point();
Dimension d=new Dimension();
d.height=10;
d.width=10;

p5.add(el12);
p5.add(el15);
p5.add(el13);
p5.add(el14);

p5.add(el10);
p5.add(b1);
p5.add(b2);
p5.add(el11);


b1.addActionListener(this);
b2.addActionListener(this);

  }

   public void actionPerformed(ActionEvent ae)
   {
    Button bb=new Button();
    bb=(Button)ae.getSource();
    if(bb==b1)
    {

     System.out.println(" accept button is presed");
     lab_info.no_parallel_possible=Integer.parseInt(cc.getSelectedItem());

     if(c1.getState())
     {
     lab_info.session=2;
     System.out.println(" end "+c1.getLabel());
     }
     if(c2.getState())
     {
     lab_info.session=1;
     System.out.println(" start "+c2.getLabel());
     }
     if(c0.getState())
     {
     lab_info.session=0;
     System.out.println(" any "+c0.getLabel());
     }

     if(c3.getState())
     {
     lab_info.labDays=1;
     System.out.println(" not insame day "+c3.getLabel());
     }
     if(c4.getState())
     {
     lab_info.labDays=0;
     System.out.println(" any "+c4.getLabel());
     }


     if(c5.getState())
     {
     lab_info.labSessions=1;
     System.out.println(" alternate "+c5.getLabel());
     }
     if(c6.getState())
     {
     lab_info.labSessions=2;
     System.out.println(" concevutie "+c6.getLabel());
     }
     if(c7.getState())
     {
     lab_info.labSessions=0;
     System.out.println(" anyyy "+c7.getLabel());
     }

     System.out.println(" no of parallel possibel "+lab_info.no_parallel_possible);

     if(c8.getState())
     {
     detail.show=1;
     System.out.println(" show "+c8.getLabel());
     }
     if(c9.getState())
     {
     detail.show=0;
     System.out.println(" dontshow "+c9.getLabel());
     }


     if(c10.getState())
     {
     detail.mode=0;
     System.out.println(" normal "+c10.getLabel());
     }
     if(c11.getState())
     {
     detail.mode=1;
     System.out.println(" dontshow "+c11.getLabel());
     }

     if(c12.getState())
     {
     detail.output=1;
     System.out.println(" subjectname "+c12.getLabel());
     }
     if(c13.getState())
     {
     detail.output=2;
     System.out.println(" subject code "+c13.getLabel());
     }


          if(c14.getState())
     {
     detail.random=1;
     System.out.println(" randome "+c14.getLabel());
     }
          if(c15.getState())
     {
     detail.random=0;
     System.out.println(" sequenceial "+c15.getLabel());
     }
    /*  if(detail.show==0)
    {
     www.setVisible(false);

    }
    if(detail.show==1)
    {
     www.setVisible(true);
    }

     */
     setVisible(false);
    }
    else
    {
     System.out.println(" cancel button is presed");
     setVisible(false);
    }

   }

}

class result  extends Frame
{

//TextArea ta=new TextArea();
Mycan can;
int x=0,y=0;
String str="RESULT";
result()
{
super("RESULT");
setVisible(true);
can=new Mycan();
setSize(800,600);

//this.add(ta);

}
 public void drawstring( int x,int  y,String str)
{
 this.x=x;
 this.y=y;
 this.str=str;
 can.drawstring(x,y,str);
}

}

class Mycan extends Canvas
{
int x,y;
String str;
 public void drawstring( int x,int  y,String str)
{
 this.x=x;
 this.y=y;
 this.str=str;
 repaint();
}
public void paint(Graphics g)
{
g.drawString(str,x,y);

}


}
       //********************************************************8
 class tabledemo extends JFrame
{

//  final String staff_header[];
 int period,day;
 int num,staff_num;
JPanel jp=new JPanel();

//info.name[count-1]);
//info.no_of_subject[count-1]);
log2 lg=new log2();

	public tabledemo(schedule sch[][][],staff_structure ss[])
	{
	super("       "+ pan2.name_of_college +" ("+pan2.name_of_dept+")");
	setSize(400,400);
lg.setVisible(false);
int enter=0;
   period=pan2.no_of_periods;
day=pan2.no_of_days;
 num=(pan2.no_of_classes);
 staff_num=info.total_no_of_staff+1;

 final String header[];


	Container cpane=getContentPane();
  jp.setLayout(new GridLayout((num+staff_num+2),1));
// jp.setLayout(new FlowLayout());

//jp.add( new Label("                  CLASS SCHEDULE "));

 Object[][] staff_data;

header=new String[period+1];
// JTable table=new JTable(data,header);
 for(int ii=0;ii<(period+1);ii++)
  {
     header[ii]=(ii+" ");
  }

  Object[][] data;
// Object[][] data=new Object[day][period+1];
for(int k=0;k<pan2.no_of_classes;k++)
{
  data=new Object[day][period+1];
  for(int i=0;i<day;i++)
  {
   for(int j=0;j<period;j++)
    {
//   data[k][i][j]=(i+" "+j);

   if(detail.output==2)
                 {

                   data[i][j+1]=sch[k][i][j].subject_id;
                   //data[i][j+1]=k;
                   System.out.println("the value of k is"+k);
                   System.out.println("the value of sch[k] is "+sch[k][i][j].subject_id);

                 }
             else
                 {
                   	for(int is=0;is<info.total_no_of_subject;is++)
                  			 {

                             //ddd.app("the subject id "+subjects.subject_id[is]);


                    			   if(sch[k][i][j].subject_id.equals(subjects.subject_id[is]))
                                 {
                                    data[i][j+1]=subjects.subject_name[is];
                                     break;

                                 }

                         }


                  }
  }
  }

  String[] dayy={"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};

  for(int i=0;i<day;i++)
  {
  int j=0;
     data[i][j]=dayy[i];
  }
  header[0]=info.name[k];
  JTable table=new JTable(data,header);
  int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
	int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
  //sp.setViewportView(table);
  JScrollPane jsp=new JScrollPane(table,v,h);
  jp.add(jsp);

 //Dimension s= getPreferredScrollableViewportSize();
// System.out.println(" size "+s.width + "height "+s.height);
  //jp.setViewportView(table);
	setVisible(true);
}
jp.add( new JLabel("              STAFF SCHEDULE "));
// beginigng of staff *********************************
  for(int ii=0;ii<(period+1);ii++)
  {
     header[ii]=(ii+" ");
  }

for(int kk=0;kk<staff_num;kk++)
{
  staff_data=new Object[day][period+1];
  for(int i=0;i<day;i++)
  {
   for(int j=0;j<period;j++)
    {
   //****************
                    if(detail.output==2)
     {

        staff_data[i][j+1]=ss[kk].a[i][j];
      }

      else
      {

              for(int is=0;is<info.total_no_of_subject;is++)
                  			 {

                            if(ss[kk].a[i][j] != null)
                            {
                      			   if((ss[kk].a[i][j]).equals(subjects.subject_id[is]))
                                 {

                                    staff_data[i][j+1]=subjects.subject_name[is];
                                    enter=1;

                                    break;

                                }
                             }
                          }
                          if(enter==0)
                         {
                          staff_data[i][j+1]="NULL";
                         }
                         enter=0;
      }
	// ss[q].a[day][period]=subject[i][j].subject_code;

   //*******************

   }
  }
      String[] dayy={"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
  for(int i=0;i<day;i++)
  {
  int j=0;
     staff_data[i][j]=dayy[i];
  }
    header[0]=info.staff_name[kk];
  	JTable staff_table=new JTable(staff_data,header);
    int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
	int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
   JPanel pan =new JPanel();

	JScrollPane jsp=new JScrollPane(staff_table,v,h);
 // pan.add(jsp);
 jsp.setSize(100,100);
    jsp.resize(100,100);
  jp.add(jsp);

}
    int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
	int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
 jp.setSize(600,600);
    jp.resize(600,600);

cpane.add(new JScrollPane(jp,v,h));
// end of staff************************************************8

}
}


      