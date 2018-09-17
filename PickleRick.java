/**
 * A simple up close portrait of Pickle Rick from
 * Rick and Morty season 3 episode 3.
 * 
 * 
 *
 * 
 * 
 * @author  Anthony Tiongson using code written by
 * @author  Michael Kšlling and David J. Barnes
 * @version 2018.09.07
 */
public class PickleRick
{
    private Square greenCanvas;
    private Circle eyeLeftBaggage1;
    private Circle eyeLeftBaggage2;
    private Circle eyeRightBaggage1;
    private Circle eyeRightBaggage2;
    private Circle mouthLeftTerryFold;
    private Circle mouthLeftTerryFlap;
    private Circle mouthRightTerryFold;
    private Circle mouthRightTerryFlap;
    private Square noseOutline1;
    private Circle noseOutline2;
    private Square nose1;
    private Circle nose2;
    private Circle mouth1;
    private Square mouth2;
    private Square mouth3;
    private Circle mouth4;
    private Triangle tongue1;
    private Circle tongue2;
    private Square tooth01;
    private Square tooth02;
    private Square tooth03;
    private Square tooth04;
    private Square tooth05;
    private Square tooth06;
    private Square tooth07;
    private Square tooth08;
    private Square tooth09;
    private Square tooth10;
    private Square tooth11;
    private Square tooth12;
    private Triangle brow;
    private Triangle browBottom;
    private Circle eyeLeftOutline;
    private Circle eyeRightOutline;
    private Circle eyeLeft;
    private Circle eyeRight;
    private Person pupilLeft;
    private Person pupilRight;
    private boolean drawn;

    /**
     * Constructor for objects of class PickleRick
     */
    public PickleRick()
    {
        greenCanvas = new Square();
        mouthLeftTerryFold = new Circle();
        mouthLeftTerryFlap = new Circle();
        mouthRightTerryFold = new Circle();
        mouthRightTerryFlap = new Circle();
        eyeLeftBaggage1 = new Circle();
        eyeLeftBaggage2 = new Circle();
        eyeRightBaggage1 = new Circle();
        eyeRightBaggage2 = new Circle();
        noseOutline1 = new Square();
        noseOutline2 = new Circle();
        nose1 = new Square();
        nose2 = new Circle();
        mouth1 = new Circle();
        mouth2 = new Square();
        mouth3 = new Square();
        mouth4 = new Circle();
        tongue1 = new Triangle();
        tongue2 = new Circle();
        tooth01 = new Square();
        tooth02 = new Square();
        tooth03 = new Square();
        tooth04 = new Square();
        tooth05 = new Square();
        tooth06 = new Square();
        tooth07 = new Square();
        tooth08 = new Square();
        tooth09 = new Square();
        tooth10 = new Square();
        tooth11 = new Square();
        tooth12 = new Square();
        brow = new Triangle();
        browBottom = new Triangle(); 
        eyeLeftOutline = new Circle();
        eyeRightOutline = new Circle();
        eyeLeft = new Circle();
        eyeRight = new Circle();
        pupilLeft = new Person();
        pupilRight = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            greenCanvas.changeColor("green");
            greenCanvas.moveHorizontal(-310);
            greenCanvas.moveVertical(-120);
            greenCanvas.changeSize(500);
            greenCanvas.makeVisible();
            
            mouthLeftTerryFold.changeColor("black");
            mouthLeftTerryFold.moveHorizontal(-80);
            mouthLeftTerryFold.moveVertical(128);
            mouthLeftTerryFold.changeSize(70);
            mouthLeftTerryFold.makeVisible();
            
            mouthLeftTerryFlap.changeColor("green");
            mouthLeftTerryFlap.moveHorizontal(-75);
            mouthLeftTerryFlap.moveVertical(123);
            mouthLeftTerryFlap.changeSize(80);
            mouthLeftTerryFlap.makeVisible();
            
            mouthRightTerryFold.changeColor("black");
            mouthRightTerryFold.moveHorizontal(45);
            mouthRightTerryFold.moveVertical(110);
            mouthRightTerryFold.changeSize(90);
            mouthRightTerryFold.makeVisible();
            
            mouthRightTerryFlap.changeColor("green");
            mouthRightTerryFlap.moveHorizontal(30);
            mouthRightTerryFlap.moveVertical(105);
            mouthRightTerryFlap.changeSize(100);
            mouthRightTerryFlap.makeVisible();
            
            eyeLeftBaggage1.changeColor("black");
            eyeLeftBaggage1.moveHorizontal(-135);
            eyeLeftBaggage1.moveVertical(-40);
            eyeLeftBaggage1.changeSize(150);
            eyeLeftBaggage1.makeVisible();
            
            eyeLeftBaggage2.changeColor("green");
            eyeLeftBaggage2.moveHorizontal(-140);
            eyeLeftBaggage2.moveVertical(-60);
            eyeLeftBaggage2.changeSize(165);
            eyeLeftBaggage2.makeVisible();
            
            eyeRightBaggage1.changeColor("black");
            eyeRightBaggage1.moveHorizontal(25);
            eyeRightBaggage1.moveVertical(-40);
            eyeRightBaggage1.changeSize(150);
            eyeRightBaggage1.makeVisible();
            
            eyeRightBaggage2.changeColor("green");
            eyeRightBaggage2.moveHorizontal(15);
            eyeRightBaggage2.moveVertical(-60);
            eyeRightBaggage2.changeSize(165);
            eyeRightBaggage2.makeVisible();
            
            noseOutline1.changeColor("black");
            noseOutline1.moveHorizontal(-75);
            noseOutline1.moveVertical(35);
            noseOutline1.changeSize(30);
            noseOutline1.makeVisible();
            
            nose1.changeColor("green");
            nose1.moveHorizontal(-73);
            nose1.moveVertical(33);
            nose1.changeSize(26);
            nose1.makeVisible();
            
            noseOutline2.changeColor("black");
            noseOutline2.moveHorizontal(5);
            noseOutline2.moveVertical(80);
            noseOutline2.changeSize(30);
            noseOutline2.makeVisible();
            
            nose2.changeColor("green");
            nose2.moveHorizontal(6);
            nose2.moveVertical(78);
            nose2.changeSize(28);
            nose2.makeVisible();
            
            mouth1.changeColor("black");
            mouth1.moveHorizontal(-60);
            mouth1.moveVertical(128);
            mouth1.changeSize(70);
            mouth1.makeVisible();
            
            mouth2.changeColor("black");
            mouth2.moveHorizontal(-100);
            mouth2.moveVertical(108);
            mouth2.changeSize(60);
            mouth2.makeVisible();
            
            mouth3.changeColor("black");
            mouth3.moveHorizontal(-85);
            mouth3.moveVertical(108);
            mouth3.changeSize(60);
            mouth3.makeVisible();
            
            mouth4.changeColor("black");
            mouth4.moveHorizontal(25);
            mouth4.moveVertical(110);
            mouth4.changeSize(90);
            mouth4.makeVisible();
            
            tongue1.changeColor("red");
            tongue1.changeSize(60, 45);
            tongue1.moveHorizontal(65);
            tongue1.moveVertical(85);
            tongue1.makeVisible();
            
            tongue2.changeColor("black");
            tongue2.changeSize(50);
            tongue2.moveHorizontal(0);
            tongue2.moveVertical(140);
            tongue2.makeVisible();
            
            tooth01.changeColor("white");
            tooth01.changeSize(10);
            tooth01.moveHorizontal(-100);
            tooth01.moveVertical(105);
            tooth01.makeVisible();

            tooth02.changeColor("white");
            tooth02.changeSize(10);
            tooth02.moveHorizontal(-85);
            tooth02.moveVertical(110);
            tooth02.makeVisible();

            tooth03.changeColor("white");
            tooth03.changeSize(10);
            tooth03.moveHorizontal(-70);
            tooth03.moveVertical(112);
            tooth03.makeVisible();

            tooth04.changeColor("white");
            tooth04.changeSize(10);
            tooth04.moveHorizontal(-55);
            tooth04.moveVertical(112);
            tooth04.makeVisible();

            tooth05.changeColor("white");
            tooth05.changeSize(10);
            tooth05.moveHorizontal(-40);
            tooth05.moveVertical(100);
            tooth05.makeVisible();

            tooth06.changeColor("white");
            tooth06.changeSize(10);
            tooth06.moveHorizontal(-25);
            tooth06.moveVertical(85);
            tooth06.makeVisible();

            tooth07.changeColor("white");
            tooth07.changeSize(10);
            tooth07.moveHorizontal(-100);
            tooth07.moveVertical(150);
            tooth07.makeVisible();

            tooth08.changeColor("white");
            tooth08.changeSize(10);
            tooth08.moveHorizontal(-85);
            tooth08.moveVertical(155);
            tooth08.makeVisible();

            tooth09.changeColor("white");
            tooth09.changeSize(10);
            tooth09.moveHorizontal(-70);
            tooth09.moveVertical(155);
            tooth09.makeVisible();

            tooth10.changeColor("white");
            tooth10.changeSize(10);
            tooth10.moveHorizontal(-55);
            tooth10.moveVertical(155);
            tooth10.makeVisible();

            tooth11.changeColor("white");
            tooth11.changeSize(10);
            tooth11.moveHorizontal(-40);
            tooth11.moveVertical(155);
            tooth11.makeVisible();

            tooth12.changeColor("white");
            tooth12.changeSize(10);
            tooth12.moveHorizontal(-25);
            tooth12.moveVertical(157);
            tooth12.makeVisible();

            brow.changeColor("blue");
            brow.changeSize(30, 240);
            brow.moveHorizontal(40);
            brow.moveVertical(-140);
            brow.makeVisible();
            
            browBottom.changeColor("green");
            browBottom.changeSize(30, 240);
            browBottom.moveHorizontal(40);
            browBottom.moveVertical(-135);
            browBottom.makeVisible();
    
            eyeLeftOutline.changeColor("black");
            eyeLeftOutline.moveHorizontal(-130);
            eyeLeftOutline.moveVertical(-60);
            eyeLeftOutline.changeSize(150);
            eyeLeftOutline.makeVisible();
            
            eyeLeft.changeColor("yellow");
            eyeLeft.moveHorizontal(-128);
            eyeLeft.moveVertical(-58);
            eyeLeft.changeSize(146);
            eyeLeft.makeVisible();
            
            eyeRightOutline.changeColor("black");
            eyeRightOutline.moveHorizontal(20);
            eyeRightOutline.moveVertical(-60);
            eyeRightOutline.changeSize(150);
            eyeRightOutline.makeVisible();
            
            eyeRight.changeColor("yellow");
            eyeRight.moveHorizontal(22);
            eyeRight.moveVertical(-58);
            eyeRight.changeSize(146);
            eyeRight.makeVisible();
            
            pupilLeft.changeSize(8, 10);
            pupilLeft.moveHorizontal(-105);
            pupilLeft.moveVertical(-80);
            pupilLeft.makeVisible();
            
            pupilRight.changeSize(8, 10);
            pupilRight.moveHorizontal(45);
            pupilRight.moveVertical(-80);
            pupilRight.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        greenCanvas.changeColor("white");
        mouthLeftTerryFold.changeColor("black");
        mouthLeftTerryFlap.changeColor("white");
        mouthRightTerryFold.changeColor("black");
        mouthRightTerryFlap.changeColor("white");
        eyeLeftBaggage1.changeColor("black");
        eyeLeftBaggage2.changeColor("white");
        eyeRightBaggage1.changeColor("black");
        eyeRightBaggage2.changeColor("white");
        noseOutline1.changeColor("black");
        nose1.changeColor("white");
        noseOutline2.changeColor("black");
        nose2.changeColor("white");
        mouth1.changeColor("black");
        mouth2.changeColor("black");
        mouth3.changeColor("black");
        mouth4.changeColor("black");
        tongue1.changeColor("white");
        tongue2.changeColor("black");
        tooth01.changeColor("white");
        tooth02.changeColor("white");
        tooth03.changeColor("white");
        tooth04.changeColor("white");
        tooth05.changeColor("white");
        tooth06.changeColor("white");
        tooth07.changeColor("white");
        tooth08.changeColor("white");
        tooth09.changeColor("white");
        tooth10.changeColor("white");
        tooth11.changeColor("black");
        tooth12.changeColor("black");
        brow.changeColor("black");
        browBottom.changeColor("white");
        eyeLeftOutline.changeColor("black");
        eyeRightOutline.changeColor("black");
        eyeLeft.changeColor("white");
        eyeRight.changeColor("white");
        pupilLeft.changeColor("black");
        pupilRight.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        greenCanvas.changeColor("green");
        mouthLeftTerryFold.changeColor("black");
        mouthLeftTerryFlap.changeColor("green");
        mouthRightTerryFold.changeColor("black");
        mouthRightTerryFlap.changeColor("green");
        eyeLeftBaggage1.changeColor("black");
        eyeLeftBaggage2.changeColor("green");
        eyeRightBaggage1.changeColor("black");
        eyeRightBaggage2.changeColor("green");
        noseOutline1.changeColor("black");
        nose1.changeColor("green");
        noseOutline2.changeColor("black");
        nose2.changeColor("green");
        mouth1.changeColor("black");
        mouth2.changeColor("black");
        mouth3.changeColor("black");
        mouth4.changeColor("black");
        tongue1.changeColor("red");
        tongue2.changeColor("black");
        tooth01.changeColor("white");
        tooth02.changeColor("white");
        tooth03.changeColor("white");
        tooth04.changeColor("white");
        tooth05.changeColor("white");
        tooth06.changeColor("white");
        tooth07.changeColor("white");
        tooth08.changeColor("white");
        tooth09.changeColor("white");
        tooth10.changeColor("white");
        tooth11.changeColor("white");
        tooth12.changeColor("white");
        brow.changeColor("blue");
        browBottom.changeColor("green");
        eyeLeftOutline.changeColor("black");
        eyeRightOutline.changeColor("black");
        eyeLeft.changeColor("yellow");
        eyeRight.changeColor("yellow");
        pupilLeft.changeColor("black");
        pupilRight.changeColor("black");
    }
}
