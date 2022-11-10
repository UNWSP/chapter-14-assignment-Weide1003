
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class JVacationRental
extends JFrame implements ItemListener{

final int ROOM_BASE_PRICE=200;
final int PARK_SIDE=600;
final int POOL_SIDE=750;
final int LAKE_SIDE=825;

final int MEALS_CHARGE=200;
final int EXTRA_RENTAL=75;
int totalPrice=ROOM_BASE_PRICE;
JCheckBox parkSideBox=new JCheckBox("PARK SIDE $"+PARK_SIDE);
JCheckBox poolSideBox=new JCheckBox("POOL SIDE $"+POOL_SIDE);
JCheckBox lakeSideBox=new JCheckBox("LAKE SIDE $"+LAKE_SIDE);

JCheckBox oneRoomBox=new JCheckBox("ONE ROOM");
JCheckBox twoRoomBox=new JCheckBox("TWO ROOM");
JCheckBox threeRoomBox=new JCheckBox("THREE ROOM");
JCheckBox mealsBox=new JCheckBox("MEAL S$"+MEALS_CHARGE);
JLabel priceLabel=new JLabel("Total price is ");JTextField totalField=new JTextField(4);
public JVacationRental()
{
	setTitle("Lambert's Vacation Calculator");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new FlowLayout());
	
	add(new JLabel("Lambert's Vacation Rentals"));add(new
	JLabel("Room's Base Price "+ROOM_BASE_PRICE));
	ButtonGroup locationGrp=new ButtonGroup();
	locationGrp.add(parkSideBox);
	locationGrp.add(poolSideBox);
	locationGrp.add(lakeSideBox);
	add(new JLabel("Select view"));
	add(parkSideBox);
	add(poolSideBox);
	add(lakeSideBox);
	parkSideBox.addItemListener(this);
	poolSideBox.addItemListener(this);
	lakeSideBox.addItemListener(this);
	ButtonGroup roomGrp=new ButtonGroup();
	add(new JLabel("Select Rooms"));
	roomGrp.add(oneRoomBox);roomGrp.add(twoRoomBox);roomGrp.add(threeRoomBox);
	add(oneRoomBox);
	add(twoRoomBox);
	add(threeRoomBox);
	oneRoomBox.addItemListener(this);
	twoRoomBox.addItemListener(this);
	threeRoomBox.addItemListener(this);
	add(mealsBox);
	mealsBox.addItemListener(this);add(priceLabel);
	add(totalField);
	totalField.setText("$"+totalPrice);}
public void itemStateChanged(ItemEvent e){

Object source=e.getSource();int select=e.getStateChange();if(source==parkSideBox)
{
if(select==ItemEvent.SELECTED)totalPrice+=PARK_SIDE;
else
totalPrice-=PARK_SIDE;}
else if(source==poolSideBox) {
	if(select==ItemEvent.SELECTED)totalPrice+=POOL_SIDE;
	else
	totalPrice-=POOL_SIDE;}
	else if(source==lakeSideBox){
	if(select==ItemEvent.SELECTED)totalPrice+=LAKE_SIDE;
	else
	totalPrice-=LAKE_SIDE;}
	else if(source==oneRoomBox)
	{
	if(select==ItemEvent.SELECTED)
		totalPrice+=EXTRA_RENTAL;else
			totalPrice-=EXTRA_RENTAL;}
			else if(source==twoRoomBox)
			{
			if(select==ItemEvent.SELECTED)totalPrice+=2*EXTRA_RENTAL;else
			totalPrice-=2*EXTRA_RENTAL;}
			else if(source==threeRoomBox)
			{
			if(select==ItemEvent.SELECTED)totalPrice+=3*EXTRA_RENTAL;
			else
				totalPrice-=3*EXTRA_RENTAL;
				}

				else if(source==mealsBox)
				{
				if(select==ItemEvent.SELECTED)totalPrice+=MEALS_CHARGE;
				else
				totalPrice-=MEALS_CHARGE;
				}
				totalField.setText("$"+totalPrice);
				}

				public static void main(String[]args)
				{
					final int WIDTH=250;final int HEIGHT=400;
					JVacationRental vacationFrame
					=new JVacationRental();

					vacationFrame.setSize(WIDTH,HEIGHT);
					vacationFrame.setVisible(true);}
					}

				


			



