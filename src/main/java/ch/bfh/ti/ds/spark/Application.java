package ch.bfh.ti.ds.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class Application {
	private SparkConf sparkConf;
	private JavaSparkContext sparkContext;
	
	public Application() {
		sparkConf = new SparkConf().setAppName("ch.bfh.ti.ds.task01");
		sparkContext = new JavaSparkContext(sparkConf);
	}

	public JavaSparkContext getSparkContext() {
		return sparkContext;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
