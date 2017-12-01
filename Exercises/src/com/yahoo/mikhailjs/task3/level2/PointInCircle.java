package com.yahoo.mikhailjs.task3.level2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PointInCircle {
	int xCo;
	int yCo;
	int xSk = 300;
	int ySk = 200;

	double crX;
	double crY;
	double crR;
	private JPanel panel;

	public static void main(String[] args) {

		PointInCircle cr = new PointInCircle(30.0, 60.0, 40.0);
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Set Radius (1-150):");
			cr.setRadius(getDouble(sc));
			System.out.println("Set centre X(±300):");
			cr.setCentreX(getDouble(sc));
			System.out.println("Set centre Y(±200):");
			cr.setCentreY(getDouble(sc));
		} while (true);
	}
  
  // pX,pY курсор
  // cX,cY центр круга
  // cR    радиус круга
	private boolean isInCircle(int pX, int pY, int cX, int cY, int cR) {
		return (Math.sqrt(Math.pow((pX - cX), 2) + Math.pow((pY - cY), 2)) <= (double) cR);
	}

	private static double getDouble(Scanner sc) {
		while (true) {
			if (!sc.hasNextDouble()) {
				sc.next(".++");
				System.out.println("Enter value:");
				continue;
			}
			return sc.nextDouble();
		}
	}

	private PointInCircle(double x, double y, double r) {
		crR = r;
		crX = x;
		crY = y;
		JFrame frame = new JFrame("Point in circle.");
		panel = new JPanel() {

			private static final long serialVersionUID = 16753L;

			@Override
			public void paint(Graphics g) {

				int circleR = (int) crR;
				int circleX = (int) crX;
				int circleY = (int) crY;
				int drawX = circleX + xSk - circleR;
				int drawY = circleY + ySk - circleR;
				int cursorX = xCo - xSk;
				int cursorY = yCo - ySk;
				Graphics2D g2 = (Graphics2D) g;

				g2.clearRect(0, 0, getWidth(), getHeight());
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				g2.setColor(Color.WHITE);
				g2.drawString(String.format("X:%d Y:%d", cursorX, cursorY), 520, 20);
				
				if (isInCircle(cursorX, cursorY, circleX, circleY, circleR)) {
					g2.setColor(Color.ORANGE);
				} else {
					g2.setColor(Color.GRAY);
				}
				g2.fillOval(drawX, drawY, 2 * circleR, 2 * circleR);
				g2.setColor(Color.GREEN);
				g2.fillOval(-1 + xSk, -1 + ySk, 2, 2);
			}

		};
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		panel.setPreferredSize(new Dimension(600, 400));
		panel.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				Point p = e.getPoint();
				xCo = p.x;
				yCo = p.y;
				panel.repaint();
			}

			@Override
			public void mouseDragged(MouseEvent e) {
			}
		});
		frame.setBackground(Color.BLACK);
		frame.add(panel);
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}

	private void setRadius(double r) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				crR = r;
				panel.repaint();
			}

		});
	}

	private void setCentreX(double x) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				crX = x;
				panel.repaint();
			}

		});
	}

	private void setCentreY(double y) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				crY = y;
				panel.repaint();
			}

		});
	}

}
