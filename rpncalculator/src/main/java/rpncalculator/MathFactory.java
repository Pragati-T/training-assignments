package rpncalculator;

import java.util.HashMap;

public class MathFactory {
		@SuppressWarnings("deprecation")
		public static Operations getObject(String token) {
			Operations mathOperation = null;
			HashMap<String,String> classNames =new HashMap<String,String>();
			classNames.put("+","rpncalculator.Addition");
			classNames.put("-","rpncalculator.Subtraction");
			classNames.put("*","rpncalculator.Multiplication");
			classNames.put("/","rpncalculator.Division");


			String className = classNames.get(token);
			try
			{
				mathOperation = (Operations) Class.forName(className).newInstance();

			}
			catch(Exception e){
				e.printStackTrace();
				
			}
			return mathOperation;

		}
}
