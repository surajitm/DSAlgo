package ds.algo.matrix;

import java.util.LinkedList;

public class DesignSnakeGame {

	public static class Position{
		int x;
		int y;
		public Position(int x,int y){
			this.x=x;
			this.y=y;
		}
	
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Position other = (Position) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}
		
	}
	private int[][] food;
	int score;
	int row,col;
	LinkedList<Position> snake;
	
	public DesignSnakeGame(int width,int height,int[][] food) {
		row=width;
		col=height;
		
		snake=new LinkedList<>();
		snake.add(new Position(0,0));
		this.food=food;
		score=0;
	}
	
	
	public int move(String dir){
		
		switch(dir){
		case "U": row++;break;
		case "D": row--;break;
		case "R": col++;break;
		case "L": col--;break;
		}
		
		if(!isValid(row,col)){
			
		}
		
		return process(new Position(row,col));
	}

	//Checking the validity
	private boolean isValid(int x, int y) {
		if(x>=row ||x<0 ||y>=col ||y<0){
			return false;
		}
		return true;
	}


	private int process(Position cur) {
		snake.addFirst(cur);
		Position p=new Position(food[score][0],food[score][1]);
		
		if(score==food.length){
			//When snake eat all the food
			snake.removeLast();
		}else if(cur.equals(p)){
			//If it eat the food the score will increase
			score++;
		}else{
			snake.removeLast();
		}
		
		//If snake came to previous position or snake bites it's own body.
		for(Position pos:snake){
			if(cur.equals(pos)){
				return -1;
			}
		}
		
		
		return score;
	}
	
}
