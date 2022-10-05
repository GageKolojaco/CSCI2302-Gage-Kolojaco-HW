package Chapter09;

//UML Class Diagram                     
/**************************************************
*               Rectangle                         *  
* ------------------------------------------------*  
* width: double                                   *
* height: double                                  * 
* Rectangle()                                     *  
* Rectangle(newWidth: double, newHeight: double)  *
* getArea(): double                               *
* getPerimeter(): double                          *
***************************************************/
public class Rectangle {
	double width;	// Width of rectangle
	double height;	// Height of rectangle

	Rectangle() {
		width = 1;
		height = 1;
	} 
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	double getArea() {
		return width * height; 
	}
	double getPerimeter() {
		return 2 * (width + height);
	}
}

