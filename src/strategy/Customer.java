package strategy;
class Advisor {
    public Firework recommend() {
        return new Firework();
    }

    public boolean hasItem() {
        return true;
    }
}

class Firework {

}

class PromotionAdvisor {
    public static Advisor singleton;
}

class GroupAdvisor {
    public static Advisor singleton;
}

class RandomAdvisor {
    public static Advisor singleton;
}

class ItemAdvisor {
    public static Advisor singleton;
}

public class Customer {
    Advisor advisor;

    public boolean isRegistered() {
        return true;
    }

    public boolean isBigSpender() {
        return true;
    }

    public Advisor getAdvisor() {

        if(advisor==null)
        {
            if(PromotionAdvisor.singleton.hasItem())
            {
                advisor = PromotionAdvisor.singleton;
            }else if(isRegistered()){
                advisor = GroupAdvisor.singleton;
            }else if(isBigSpender()){
                advisor = ItemAdvisor.singleton;
            }else{
                advisor = RandomAdvisor.singleton;
            }
        }

        return advisor;
    }

    public Firework getRecommended() {
        return getAdvisor().recommend();
    }
}