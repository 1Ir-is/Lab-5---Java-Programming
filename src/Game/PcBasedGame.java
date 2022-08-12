package Game;

public class PcBasedGame extends Game{
        public int minRam;
        public int minHdd;
        public double minCPU;
        public PcBasedGame(String description){super(description);}
        public PcBasedGame(String description, int minRam, int minHdd, int minCPU){
            super(description);
            this.minRam = minRam;
            this.minHdd = minHdd;
            this.minCPU = minCPU;
        }
        public int getMinRam() {return minRam;}
        public void setMinRam(int minRam) {this.minRam = minRam;}
        public int getMinHdd() {return minHdd;}
        public void setMinHdd(int minHdd) {this.minHdd = minHdd;}
        public double getMinCPU() {return minCPU;}
        public void setMinCPU(double minCPU) {this.minCPU = minCPU;}
    @Override
    public String toString() {return super.toString()
            + " minRam=" + minRam + ", minHdd=" + minHdd + ", minCPU=" + minCPU;
        }
}
