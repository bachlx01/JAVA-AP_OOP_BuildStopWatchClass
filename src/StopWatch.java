import java.util.Date;

public class StopWatch {

        long startTime;
        long endTime;

        public long getStart () {
            return this.startTime;
        }
        public long getEnd () {
            return this.endTime;
        }

        public void start(){
            this.startTime = System.currentTimeMillis();
        }
        public void stop () {
            this.endTime = System.currentTimeMillis();
        }
        public long getElapsedTime (){
            return this.endTime - this.startTime;
        }

}
