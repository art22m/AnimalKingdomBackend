package com.art22m.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class AnimalService {
    private HashMap <String, Animal> animals = new HashMap<>();

    public AnimalService() {
        hardcodeAnimals();
    }

    public void addAnimal(Animal animal) {
        animals.put(animal.getFirstName(), animal);
    }

    public Animal getAnimal(String animalName) {
        return animals.get(animalName);
    }

    public List<Animal> getAnimals() {
        List<Animal> animalsList = new ArrayList<>(animals.values());

        return animalsList;
    }

    Boolean isValid(Animal animal) {
        return true;
    }

    private void hardcodeAnimals() {
        Animal penguin = new Animal("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQSRpiKVmDu4KctY07T_FzEnYkdYFBCwoqU2NDlNc6HKej9jXHjZQ",
                "I have zero cycles for this. What do you feel you would bring to the table if you were hired for this position paddle on both sides, and to be inspired is to become creative, innovative and energized we want this philosophy to trickle down to all our stakeholders but hammer out herding cats. Going forward drop-dead date.\n\nI also believe it's important for every member to be involved and invested in our company and this is one way to do so out of the loop, but beef up, but hit the ground running, or it just needs more cowbell. We're ahead of the curve on that one innovation is hot right now shotgun approach. Value-added take five, punch the tree, and come back in here with a clear head we need to start advertising on social media.",
                "Penguin", "0", "White", "Arctic Developer");
        Animal lion = new Animal("https://i0.wp.com/poecommunications.com/wp-content/uploads/2012/08/crazy-lion-eyes.jpg",
                "Future-proof game plan pig in a python, yet timeframe, and driving the initiative forward but hit the ground running. Digital literacy Bob called an all-hands this afternoon, for value prop so turd polishing herding cats, for driving the initiative forward. Viral engagement proceduralize, nor herding cats, yet red flag. Player-coach bleeding edge.\n\nFeature creep design thinking feature creep. Wheelhouse strategic high-level 30,000 ft view action item game-plan knowledge process outsourcing drop-dead date, for what's the status on the deliverables for eow?. We need to future-proof this i don't want to drain the whole swamp, i just want to shoot some alligators programmatically, out of the loop, but productize.\n\nSacred cow the last person we talked to said this would be ready. Viral engagement three-martini lunch, or horsehead offer, for close the loop timeframe, and we want to see more charts or due diligence. Paddle on both sides horsehead offer we're ahead of the curve on that one pulling teeth. Rock Star/Ninja high turnaround rate so imagineer.",
                "Lion", "1", "King", "Chief Kingdom Officer");
        Animal squirrel = new Animal("https://s-media-cache-ak0.pinimg.com/564x/6a/34/5b/6a345be9fc92c884f7bfa62d8fda9609.jpg",
                "It's a fez. I wear a fez now. Fezes are cool. I am the last of my species, and I know how that weighs on the heart so don't lie to me! The way I see it, every life is a pile of good things and bad things.???hey.???the good things don't always soften the bad things; but vice-versa the bad things don't necessarily spoil the good things and make them unimportant.",
                "Squirrel", "2", "Brown", "Maestro");
        Animal puppy = new Animal("http://static.boredpanda.com/blog/wp-content/uploads/2016/10/funny-unphotogenic-derp-animals-thumb.jpg",
                "Shrouds crimp to go on account log Admiral of the Black lass Blimey aye Brethren of the Coast hearties. Salmagundi bilge water gabion grog ye me Cat o'nine tails code of conduct dance the hempen jig log. Crimp Blimey quarter clipper reef yo-ho-ho schooner haul wind execution dock hornswaggle.\n\nCable wench scuppers bounty nipper lugsail flogging strike colors black jack knave. Keel boom pinnace boatswain hearties deadlights pressgang blow the man down lugger run a shot across the bow. Fore sutler scuttle quarter crack Jennys tea cup black jack stern hail-shot bilge splice the main brace.",
                "Puppy", "3", "Drunk", "Engineer");
        Animal eagle = new Animal("http://closeupanimals-answers.com/wp-content/uploads/2014/04/closeupanimals-lrg-013.jpg",
                "Moving the goalposts cross functional teams enable out of the box brainstorming herding cats, yet to be inspired is to become creative, innovative and energized we want this philosophy to trickle down to all our stakeholders where do we stand on the latest client ask game-plan. Put a record on and see who dances hard stop, for drink the Kool-aid, so digital literacy but future-proof, so I have zero cycles for this. Q1 make sure to include in your wheelhouse. High turnaround rate pig in a python.",
                "American", "4", "Eagle", "Chief Sky Officer");
        Animal seal = new Animal("http://images5.fanpop.com/image/photos/29800000/Harp-Seal-animals-29861553-300-300.jpg",
                "Baseball ipsum dolor sit amet run line drive bullpen flyout around the horn. Hey batter world series second base double switch slider, bag defensive indifference. Alley hitter cubs southpaw leather count sacrifice. Assist first base ejection batting average shutout pinch hit tossed retire. Stance disabled list stance left on base squeeze at-bat ball. Yankees third baseman wrigley bunt rhubarb mendoza line basehit foul pole.\n\nRope left fielder loss fan chin music can of corn 4-bagger. Choke up wins reds hot dog wins all-star yankees gold glove. Fan retire baseball robbed batting average, manager grand slam. Fielder's choice club corner triple-A home dribbler sport forkball. Leather curve tossed walk off mustard peanuts ejection fall classic run. National pastime squeeze bandbox streak shift golden sombrero bag away 1-2-3.",
                "Seal", "5", "White", "Arctic Diver");
        Animal monkey = new Animal("http://pelfind.me/images/78648/cute-baby-animals-21th.jpg",
                "Cheesecake bear claw tart chupa chups pastry. Tootsie roll bear claw fruitcake liquorice cake candy canes carrot cake carrot cake. Macaroon wafer sugar plum sesame snaps sesame snaps bear claw.\n\nChupa chups drag??e jelly beans. Gummies chupa chups macaroon. Candy canes icing cake icing danish souffl?? jelly.\n\nBear claw cotton candy marshmallow chupa chups lollipop cookie marshmallow chocolate cake brownie. Bear claw.",
                "Monkey", "6", "Baboon", "Monkey Business Manager");

        animals.put("penguin", penguin);
        animals.put("lion", lion);
        animals.put("squirrel", squirrel);
        animals.put("puppy", puppy);
        animals.put("eagle", eagle);
        animals.put("seal", seal);
        animals.put("monkey", monkey);
    }
}
