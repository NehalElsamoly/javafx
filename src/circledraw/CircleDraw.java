/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circledraw;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author nehal
 */
public class CircleDraw extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Group root =new Group();
        Scene scene=new Scene(root,600,600,Color.WHITE);
      Circle circle=new Circle(300,300,250);
     // circle.setFill();
    //  circle.setCenterX(100);
   //   circle.setCenterY(100);
     circle.setFill(Color.WHITE);
    circle.setStroke(Color.BLACK);
    circle.setStrokeWidth(10);
      root.getChildren().add(circle);
      //ellipse
         Ellipse elps=new Ellipse();
         elps.setCenterX(180);
         elps.setCenterY(200);
         elps.setRadiusX(100);
         elps.setRadiusY(40);
          elps.setFill(Color.BLACK);
          root.getChildren().add(elps);
          //
           Ellipse elps2=new Ellipse();
         elps2.setCenterX(420);
         elps2.setCenterY(200);
         elps2.setRadiusX(100);
         elps2.setRadiusY(40);
          elps2.setFill(Color.BLACK);
          root.getChildren().add(elps2);
      //
      Polygon polygon=new Polygon(300,250,
                                   190,330,
                                    410,330);
      
//
   
  //   Ellipse elps3=new Ellipse();
    //     elps3.setCenterX(520);
    //     elps3.setCenterY(400);
    //     elps3.setRadiusX(100);
     //    elps3.setRadiusY(40);
      //    elps3.setFill(Color.BLACK);
          
       //   root.getChildren().add(elps3);
      root.getChildren().add(polygon);
      Arc arc=new Arc();
      arc.setCenterX(200);
            arc.setCenterY(400);
      arc.setRadiusX(200);
            arc.setRadiusY(100);
            arc.setLength(40);
            arc.setFill(Color.BLACK);
            arc.setStartAngle(300);
            arc.setType(ArcType.ROUND);

    //  Rectangle rec=new Rectangle(100,100);
  //     root.getChildren().add(arc);
    Circle circle2=new Circle(300,430,100);
   
      root.getChildren().add(circle2);
      //
      Rectangle rec=new Rectangle();
      rec.setArcHeight(100);
      rec.setArcWidth(100);
      rec.setFill(Color.WHITE);
      rec.setArcHeight(20);
      rec.setArcWidth(20);
      rec.setX(200);
      rec.setY(330);
      rec.setWidth(200);
      rec.setHeight(150);
         root.getChildren().add(rec);
        primaryStage.setScene(scene);
       primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       launch(args);
    }
    
}
