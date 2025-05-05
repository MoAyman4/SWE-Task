//Software Engineering lab task to ENG/Abdelrahman
class PERSON {
    public void Wake_Up() {
        System.out.println("Waking up...");
    }

    public void FEED() {
        System.out.println("Feeding...");
    }

    public void SLEEP() {
        System.out.println("Sleeping...");
    }

    public void homeRoutine() {
        System.out.println("Doing home routine...");
    }

    public void childRearing() {
        System.out.println("Taking care of children...");
    }

    public void studying() {
        System.out.println("Studying...");
    }

    public void helpParents() {
        System.out.println("Helping parents...");
    }

    public void working() {
        System.out.println("Working...");
    }

    public void homeRepairs() {
        System.out.println("Doing home repairs...");
    }
}

class Workers extends PERSON {
    @Override
    public void working() {
        System.out.println("Worker is working...");
    }

    @Override
    public void homeRepairs() {
        System.out.println("Worker is doing home repairs...");
    }
}

class Students extends PERSON {
    @Override
    public void studying() {
        System.out.println("Student is studying...");
    }

    @Override
    public void helpParents() {
        System.out.println("Student is helping parents...");
    }
}

class Housewife extends PERSON {
    @Override
    public void homeRoutine() {
        System.out.println("HouseWife is doing home routine...");
    }

    @Override
    public void childRearing() {
        System.out.println("HouseWife is taking care of children...");
    }
}

class Main {
    public static void main(String[] args) {
        Workers worker = new Workers();
        Students student = new Students();
        Housewife housewife = new Housewife();

        System.out.println("== Worker ==");
        worker.Wake_Up();
        worker.working();
        worker.homeRepairs();
        worker.SLEEP();

        System.out.println("\n== Student ==");
        student.Wake_Up();
        student.studying();
        student.helpParents();
        student.SLEEP();

        System.out.println("\n== HouseWife ==");
        housewife.Wake_Up();
        housewife.homeRoutine();
        housewife.childRearing();
        housewife.SLEEP();
    }
}
