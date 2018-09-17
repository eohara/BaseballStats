package pkgStats;

public class BaseballStats 
{

private int Hits;
private int AB;
private int BB;
private int dbl;
private int triple;
private int runs;
private int HBP;
private int SF;
private int HR;
public BaseballStats(int hits, int aB, int bB, int runs, int dbl, int triple, int hBP, int sF, int hR) 
{
super();

Hits = hits;
AB = aB;
BB = bB;
this.runs = runs;
this.dbl = dbl;
this.triple = triple;
HBP = hBP;
SF = sF;
HR = hR;
}
public int getHits() 
{
return Hits;
}
public void setHits(int hits)
{
Hits = hits;
}
public int getAB() 
{
return AB;
}
public void setAB(int aB) 
{
AB = aB;
}
public int getBB() 
{
return BB;
}
public void setBB(int bB)
{
BB = bB;
}
public int getHBP() {
return HBP;
}
public void setHBP(int hBP) {
HBP = hBP;
}
public int getSF() {
return SF;
}
public void setSF(int sF) {
SF = sF;
}
public int getRuns() 
{
return runs;
}
public void setRuns(int runs) {
this.runs = runs;
}
public int getDbl() 
{
return dbl;
}
public void setDbl(int dbl)
{
this.dbl = dbl;
}
public int getTriple() 
{
return triple;
}
public void setTriple(int triple)
{
this.triple = triple;
}
public int getHR()
{
return HR;
}
public void setHR(int hR) 
{
HR = hR;
}

public double SLG()
{
int singles = this.Hits - this.dbl - this.triple - this.HR;
double slg = (singles + (2 * this.dbl) + (3 * this.triple) + (4 * this.HR)) / this.AB;
return slg;
}
public double OBP(){
int num = (Hits + BB + HBP );
int denum = (AB + BB + HBP + SF);
return num/denum;
}

public double OBS(){
return SLG() + OBP();
}
public int TB(){
return (Hits + (2*dbl) + (3*triple) + (4*HR));
}

public double BA(){
return TB()/AB;
}


}


