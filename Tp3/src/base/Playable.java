package base;

import inventory.Inventory;

//implementar la subida de nivel por clase
public class Playable extends Character {
    
    private int xp;
    private int lvl;
    private int xpMax;//variable para saber a que punto de xp se sube de lvl
    private Inventory inventory;
    //implementar subida de nivel, e inventario y dinero
    private int hpBase;
    private int manaBase;
    private int dmgBase;
    private int dmgMaxBase;
    private int accBase;
    private int dodgeBase;
    
    
    private final double XP_MOD = 2.2;//indica cuanto mas va a costar de exp el siguiente nivel
    private final int MAX_LVL = 5;//nivel maximo

    public Playable() {
        super();
        xp = 0;
        lvl = 0;
        xpMax = 0;
    }
    
    public Playable(int hp, int mana, int dmg, int maxDmg, int acc, int dodge, int crit, int def, int xp, int lvl, int xpMax, String name, int id) {
        super(hp, mana, dmg, maxDmg, acc, dodge, crit, def, name, id);
        this.xp = xp;
        this.lvl = lvl;
        this.xpMax = xpMax;
    }
    
    public int getXp() {
        return xp;
    }
    
    public void setXp(int xp) {
        this.xp = xp;
    }
    
    public int getLvl() {
        return lvl;
    }
    
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    
    public int getXpMax() {
        return xpMax;
    }
    
    public void setXpMax(int xpMax) {
        this.xpMax = xpMax;
    }

    public int getHpBase() {
        return hpBase;
    }

    public void setHpBase(int hpBase) {
        this.hpBase = hpBase;
    }

    public int getManaBase() {
        return manaBase;
    }

    public void setManaBase(int manaBase) {
        this.manaBase = manaBase;
    }

    public int getDmgBase() {
        return dmgBase;
    }

    public void setDmgBase(int dmgBase) {
        this.dmgBase = dmgBase;
    }

    public int getDmgMaxBase() {
        return dmgMaxBase;
    }

    public void setDmgMaxBase(int dmgMaxBase) {
        this.dmgMaxBase = dmgMaxBase;
    }

    public int getAccBase() {
        return accBase;
    }

    public void setAccBase(int accBase) {
        this.accBase = accBase;
    }

    public int getDodgeBase() {
        return dodgeBase;
    }

    public void setDodgeBase(int dodgeBase) {
        this.dodgeBase = dodgeBase;
    }
    
    
    
    public void lvlUp() {//subir de lvl
        if (this.lvl < MAX_LVL) {
            double nextXp = (double) xpMax * XP_MOD;
            xp = xpMax;
            xpMax = (int) nextXp;
            this.statsUp();
        } else {
            //Poner un trycatch
        }
        
    }

    public void statsUp() { //sube las estadisticas(para cuando sube de nivel)
        setMaxHp(getMaxHp() + hpBase);
        setHp(getMaxHp());
        setMaxMana(getMaxMana() + manaBase);
        setMana(getMaxMana());
        setDmg(getDmg() + dmgBase);
        setMaxDmg(getMaxDmg() + dmgMaxBase);
        setAcc(getAcc() + accBase);
        setDodge(getDodge() + dodgeBase);
    }
    
}