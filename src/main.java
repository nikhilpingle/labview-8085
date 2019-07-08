 class main 
{ 
	NEWO window;
    
    main()
	{ 
		window = new NEWO();
		window.win=window;
        window.setTitle("circuit");
        window.pack();
        window.show();
		window.con=new control(window.win);
	}
	public static void main(String[] args) 
	{
		main m=new main();
	}
}
