import java.util.*;
import java.lang.*;
import java.io.*;
public class FastInput {
	
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		FastReader(){
			br=new BufferedReader(new InputStreamReader(System.in));
			
		}
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(br.readLine());
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		float nextFloat() {
			return Float.parseFloat(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
		String nextLine() {
			String str="";
			try {
				str=br.readLine().trim();
			}
			catch(Exception x) {
				x.printStackTrace();
			}
			return str;
		}
		
	}
	
	static class FastWriter{
		BufferedWriter bw;
		public FastWriter() {
			bw=new BufferedWriter(new OutputStreamWriter(System.out));
		}
		public void print(Object object)throws IOException {
			
			bw.append(""+object);
			
		}
		public void println(Object object) throws IOException{
			print(object);
			bw.append("\n");
		}
		public void close() throws IOException{
			close();
		}
	}
	
	public static void main(String args[]) {
		FastReader in=new FastReader();
		FastWriter out=new FastWriter();
		int t=in.nextInt();
		System.out.println(t);
	}
	
	

}
