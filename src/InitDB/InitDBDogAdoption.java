package InitDB;

import org.junit.Test;
import crud.Adoptions;
import entities.Adoption;
import entities.Dog;
import entities.DogAdopter;
import enums.Animals;
import enums.Area;
import enums.Availability;
import enums.CommunityType;
import enums.DogBreeds;
import enums.DogCare;
import enums.FamilyStatus;
import enums.FamilyType;
import enums.Features;
import enums.Gender;
import enums.HealthStatus;
import enums.Hobbies;
import enums.HouseType;
import enums.Location;
import enums.Relation;

public class InitDBDogAdoption {
	
	@Test
	public void addDogs() {		
		DogAdopter dogAdapter = (new DogAdopter(Gender.MALE, 23, FamilyStatus.SINGLE, CommunityType.CITY, Area.SOUTH,
				HouseType.GARDEN, DogCare.EVERYBODY, new Animals[]{Animals.NON}, Location.OUTSIDE, 
				new Availability[]{Availability.EVENING,Availability.NOON}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY,FamilyType.BIG_CHILDREN}, new Relation[]{Relation.CARING_TO_PROPERTY},
				new Hobbies[]{Hobbies.SPORT,Hobbies.SLEEPING}, new Features[]{Features.FRIENDLY, Features.TOLERANT, Features.STUBBORN}));
		Adoptions.save(new Adoption(dogAdapter, DogBreeds.CaneCorso));
		
		
		DogAdopter dogAdapter2 = (new DogAdopter(Gender.MALE, 25, FamilyStatus.SINGLE, CommunityType.CITY, Area.SOUTH,
				HouseType.GARDEN, DogCare.EVERYBODY, new Animals[]{Animals.NON}, Location.OUTSIDE, 
				new Availability[]{Availability.EVENING,Availability.NOON}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY,FamilyType.BIG_CHILDREN}, new Relation[]{Relation.CARING_TO_PROPERTY},
				new Hobbies[]{Hobbies.SLEEPING}, new Features[]{Features.FRIENDLY, Features.TOLERANT, Features.STUBBORN}));
		Adoptions.save(new Adoption(dogAdapter2, DogBreeds.CaneCorso));
		
		
		DogAdopter dogAdapter3 = (new DogAdopter(Gender.FEMALE, 16, FamilyStatus.SINGLE, CommunityType.CITY, Area.CENTER,
				HouseType.SMALL_APARTMENT, DogCare.EVERYBODY, new Animals[]{Animals.NON}, Location.INSIDE, 
				new Availability[]{Availability.EVENING,Availability.NOON}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY,FamilyType.SMALL_CHILDREN}, new Relation[]{Relation.CLEANING},
				new Hobbies[]{Hobbies.STAYING_HOME}, new Features[]{Features.FRIENDLY, Features.ATTENTION, Features.SENSITIVE}));
		Adoptions.save(new Adoption(dogAdapter3, DogBreeds.Pomeranian));
	
		DogAdopter dogAdapter4 = (new DogAdopter(Gender.FEMALE, 30, FamilyStatus.MARRIED, CommunityType.KIBBUTZ, Area.NORTH,
				HouseType.GARDEN, DogCare.EVERYBODY, new Animals[]{Animals.DOG}, Location.BOTH, 
				new Availability[]{Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY,FamilyType.QUIET}, new Relation[]{},
				new Hobbies[]{Hobbies.SPORT, Hobbies.SWIMMING}, new Features[]{Features.FRIENDLY, Features.NEED_PROTECTION}));
		Adoptions.save(new Adoption(dogAdapter4, DogBreeds.LabradorRetriever));
		
		DogAdopter dogAdapter5 = (new DogAdopter(Gender.FEMALE, 24, FamilyStatus.SINGLE, CommunityType.CITY, Area.NORTH,
				HouseType.GARDEN, DogCare.EVERYBODY, new Animals[]{Animals.DOG}, Location.BOTH, 
				new Availability[]{Availability.MORNING, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY,FamilyType.LOAD, FamilyType.BIG_CHILDREN}, new Relation[]{},
				new Hobbies[]{Hobbies.WATCHING_TV, Hobbies.STAYING_HOME}, new Features[]{Features.FRIENDLY, Features.NEED_PROTECTION, Features.ANGRY, Features.IGNORE}));
		Adoptions.save(new Adoption(dogAdapter5, DogBreeds.AmericanPitBullTerrier));
		
		DogAdopter dogAdapter20 = (new DogAdopter(Gender.FEMALE, 24, FamilyStatus.SINGLE, CommunityType.CITY, Area.NORTH,
				HouseType.GARDEN, DogCare.EVERYBODY, new Animals[]{Animals.DOG}, Location.BOTH, 
				new Availability[]{Availability.MORNING, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY,FamilyType.LOAD, FamilyType.BIG_CHILDREN}, new Relation[]{},
				new Hobbies[]{Hobbies.WATCHING_TV, Hobbies.STAYING_HOME}, new Features[]{Features.FRIENDLY, Features.NEED_PROTECTION, Features.ANGRY, Features.IGNORE}));
		Adoptions.save(new Adoption(dogAdapter20, DogBreeds.FrenchBulldog));
		
		DogAdopter dogAdapter6 = (new DogAdopter(Gender.FEMALE, 25, FamilyStatus.MARRIED_WITH_CHILDREN, CommunityType.CITY, Area.SOUTH,
				HouseType.SMALL_APARTMENT, DogCare.EVERYBODY, new Animals[]{Animals.DOG}, Location.INSIDE, 
				new Availability[]{Availability.MORNING, Availability.NOON, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY}, new Relation[]{Relation.LANDSCAPED_GARDEN},
				new Hobbies[]{Hobbies.TRAVELING}, new Features[]{Features.FRIENDLY}));
		Adoptions.save(new Adoption(dogAdapter6, DogBreeds.Chihuahua));
		
		DogAdopter dogAdapter7 = (new DogAdopter(Gender.FEMALE, 35, FamilyStatus.MARRIED_WITH_CHILDREN, CommunityType.KIBBUTZ, Area.SOUTH,
				HouseType.GARDEN, DogCare.ME, new Animals[]{Animals.DOG}, Location.INSIDE, 
				new Availability[]{Availability.MORNING, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.SMALL_CHILDREN}, new Relation[]{Relation.CARING_TO_PROPERTY,Relation.CLEANING, Relation.LANDSCAPED_GARDEN},
				new Hobbies[]{Hobbies.SLEEPING, Hobbies.TRAVELING}, new Features[]{Features.SENSITIVE, Features.IMPULSIVE, Features.IGNORE}));
		Adoptions.save(new Adoption(dogAdapter7, DogBreeds.BelgianShepherdMalinois));
		
		DogAdopter dogAdapter8 = (new DogAdopter(Gender.FEMALE, 35, FamilyStatus.MARRIED_WITH_CHILDREN, CommunityType.KIBBUTZ, Area.SOUTH,
				HouseType.GARDEN, DogCare.ME, new Animals[]{Animals.DOG}, Location.INSIDE, 
				new Availability[]{Availability.MORNING, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.SMALL_CHILDREN}, new Relation[]{Relation.CARING_TO_PROPERTY,Relation.CLEANING, Relation.LANDSCAPED_GARDEN},
				new Hobbies[]{Hobbies.SLEEPING, Hobbies.TRAVELING}, new Features[]{Features.SENSITIVE, Features.IMPULSIVE, Features.IGNORE}));
		Adoptions.save(new Adoption(dogAdapter8, DogBreeds.JackRussellTerrier));
		
		DogAdopter dogAdapter9 = (new DogAdopter(Gender.FEMALE, 24, FamilyStatus.SINGLE, CommunityType.CITY, Area.CENTER,
				HouseType.GARDEN, DogCare.EVERYBODY, new Animals[]{Animals.DOG, Animals.CAT}, Location.BOTH, 
				new Availability[]{Availability.MORNING, Availability.NOON, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY}, new Relation[]{Relation.CARING_TO_PROPERTY},
				new Hobbies[]{Hobbies.SLEEPING}, new Features[]{Features.SENSITIVE}));
		Adoptions.save(new Adoption(dogAdapter9, DogBreeds.BelgianShepherdMalinois));
		
		DogAdopter dogAdapter10 = (new DogAdopter(Gender.MALE, 42, FamilyStatus.MARRIED_WITH_CHILDREN, CommunityType.CITY, Area.SOUTH,
				HouseType.BIG_APARTMENT, DogCare.EVERYBODY, new Animals[]{}, Location.BOTH, 
				new Availability[]{Availability.MORNING, Availability.NOON, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY}, new Relation[]{Relation.CARING_TO_PROPERTY},
				new Hobbies[]{Hobbies.SPORT, Hobbies.TRAVELING, Hobbies.STAYING_HOME,Hobbies.SWIMMING}, new Features[]{Features.FRIENDLY, Features.TOLERANT, Features.STUBBORN}));
		Adoptions.save(new Adoption(dogAdapter10, DogBreeds.SiberianHusky));
		
		DogAdopter dogAdapter11 = (new DogAdopter(Gender.MALE, 19, FamilyStatus.SINGLE, CommunityType.CITY, Area.CENTER,
				HouseType.SMALL_APARTMENT, DogCare.EVERYBODY, new Animals[]{}, Location.INSIDE, 
				new Availability[]{Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY, FamilyType.BIG_CHILDREN}, new Relation[]{},
				new Hobbies[]{Hobbies.SPORT, Hobbies.WATCHING_TV}, new Features[]{Features.FRIENDLY, Features.TOLERANT, Features.SENSITIVE, Features.ATTENTION}));
		Adoptions.save(new Adoption(dogAdapter11, DogBreeds.GoldenRetriever));
		
		DogAdopter dogAdapter12 = (new DogAdopter(Gender.FEMALE, 29, FamilyStatus.MARRIED_WITH_CHILDREN, CommunityType.CITY, Area.SOUTH,
				HouseType.SMALL_APARTMENT, DogCare.EVERYBODY, new Animals[]{Animals.DOG}, Location.INSIDE, 
				new Availability[]{Availability.MORNING, Availability.NOON, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY, FamilyType.QUIET}, new Relation[]{Relation.CARING_TO_PROPERTY},
				new Hobbies[]{Hobbies.SPORT}, new Features[]{Features.FRIENDLY, Features.TOLERANT}));
		Adoptions.save(new Adoption(dogAdapter12, DogBreeds.GoldenRetriever));
		
		DogAdopter dogAdapter13 = (new DogAdopter(Gender.MALE, 20, FamilyStatus.SINGLE, CommunityType.CITY, Area.SOUTH,
				HouseType.BIG_APARTMENT, DogCare.ME, new Animals[]{Animals.DOG, Animals.CAT}, Location.INSIDE, 
				new Availability[]{Availability.MORNING, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.BIG_CHILDREN, FamilyType.QUIET}, new Relation[]{Relation.CARING_TO_PROPERTY},
				new Hobbies[]{Hobbies.WATCHING_TV, Hobbies.TRAVELING}, new Features[]{Features.ATTENTION, Features.SENSITIVE, Features.ANGRY}));
		Adoptions.save(new Adoption(dogAdapter13, DogBreeds.Maltese));
		
		DogAdopter dogAdapter14 = (new DogAdopter(Gender.FEMALE, 55, FamilyStatus.SINGLE, CommunityType.CITY, Area.CENTER,
				HouseType.BIG_APARTMENT, DogCare.EVERYBODY, new Animals[]{Animals.OTHER, Animals.CAT}, Location.INSIDE, 
				new Availability[]{Availability.MORNING, Availability.NOON, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY}, new Relation[]{Relation.LANDSCAPED_GARDEN},
				new Hobbies[]{Hobbies.TRAVELING}, new Features[]{Features.FRIENDLY, Features.SENSITIVE, Features.TOLERANT, Features.STUBBORN}));
		Adoptions.save(new Adoption(dogAdapter14, DogBreeds.MiniaturePinscher));
		
		DogAdopter dogAdapter15 = (new DogAdopter(Gender.FEMALE, 31, FamilyStatus.SINGLE, CommunityType.CITY, Area.JERUSALEM,
				HouseType.GARDEN, DogCare.EVERYBODY, new Animals[]{Animals.CAT}, Location.INSIDE, 
				new Availability[]{Availability.MORNING, Availability.NOON, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.BIG_CHILDREN}, new Relation[]{Relation.CLEANING},
				new Hobbies[]{Hobbies.WATCHING_TV}, new Features[]{Features.FRIENDLY, Features.SENSITIVE}));
		Adoptions.save(new Adoption(dogAdapter15, DogBreeds.Canaan));
		
		DogAdopter dogAdapter16 = (new DogAdopter(Gender.MALE, 24, FamilyStatus.SINGLE, CommunityType.CITY, Area.CENTER,
				HouseType.GARDEN, DogCare.ME, new Animals[]{Animals.DOG}, Location.INSIDE, 
				new Availability[]{Availability.MORNING, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.BIG_CHILDREN, FamilyType.QUIET}, new Relation[]{},
				new Hobbies[]{Hobbies.TRAVELING, Hobbies.STAYING_HOME}, new Features[]{Features.FRIENDLY, Features.SENSITIVE, Features.TOLERANT}));
		Adoptions.save(new Adoption(dogAdapter16, DogBreeds.MiniaturePinscher));
		
		DogAdopter dogAdapter17 = (new DogAdopter(Gender.MALE, 24, FamilyStatus.SINGLE, CommunityType.CITY, Area.CENTER,
				HouseType.GARDEN, DogCare.ME, new Animals[]{Animals.DOG}, Location.INSIDE, 
				new Availability[]{Availability.MORNING, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.BIG_CHILDREN, FamilyType.QUIET}, new Relation[]{},
				new Hobbies[]{Hobbies.TRAVELING, Hobbies.STAYING_HOME}, new Features[]{Features.FRIENDLY, Features.SENSITIVE, Features.TOLERANT}));
		Adoptions.save(new Adoption(dogAdapter17, DogBreeds.Poodle));
		
		DogAdopter dogAdapter18 = (new DogAdopter(Gender.FEMALE, 25, FamilyStatus.SINGLE, CommunityType.CITY, Area.CENTER,
				HouseType.SMALL_APARTMENT, DogCare.ME, new Animals[]{Animals.DOG}, Location.INSIDE, 
				new Availability[]{Availability.MORNING, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY}, new Relation[]{Relation.CARING_TO_PROPERTY},
				new Hobbies[]{Hobbies.SLEEPING}, new Features[]{Features.FRIENDLY, Features.SENSITIVE, Features.TOLERANT}));
		Adoptions.save(new Adoption(dogAdapter18, DogBreeds.LabradorRetriever));
		
		DogAdopter dogAdapter19 = (new DogAdopter(Gender.FEMALE, 25, FamilyStatus.SINGLE, CommunityType.CITY, Area.CENTER,
				HouseType.SMALL_APARTMENT, DogCare.ME, new Animals[]{Animals.DOG}, Location.INSIDE, 
				new Availability[]{Availability.MORNING, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY}, new Relation[]{Relation.CARING_TO_PROPERTY},
				new Hobbies[]{Hobbies.SLEEPING}, new Features[]{Features.FRIENDLY, Features.SENSITIVE, Features.TOLERANT}));
		Adoptions.save(new Adoption(dogAdapter19, DogBreeds.ChineseCrestedDog));
		
		DogAdopter dogAdapter21 = (new DogAdopter(Gender.MALE, 35, FamilyStatus.MARRIED_WITH_CHILDREN, CommunityType.CITY, Area.CENTER,
				HouseType.SMALL_APARTMENT, DogCare.EVERYBODY, new Animals[]{Animals.NON}, Location.INSIDE, 
				new Availability[]{Availability.MORNING, Availability.NOON, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.SMALL_CHILDREN}, new Relation[]{Relation.CARING_TO_PROPERTY},
				new Hobbies[]{Hobbies.SLEEPING, Hobbies.SPORT, Hobbies.STAYING_HOME, Hobbies.TRAVELING, Hobbies.WATCHING_TV}, 
				new Features[]{Features.FRIENDLY, Features.SENSITIVE, Features.TOLERANT}));
		Adoptions.save(new Adoption(dogAdapter21, DogBreeds.Canaan));
		
		DogAdopter dogAdapter22 = (new DogAdopter(Gender.MALE, 35, FamilyStatus.MARRIED_WITH_CHILDREN, CommunityType.CITY, Area.CENTER,
				HouseType.SMALL_APARTMENT, DogCare.EVERYBODY, new Animals[]{Animals.NON}, Location.INSIDE, 
				new Availability[]{Availability.MORNING, Availability.NOON, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.SMALL_CHILDREN}, new Relation[]{Relation.CARING_TO_PROPERTY},
				new Hobbies[]{Hobbies.SLEEPING, Hobbies.SPORT, Hobbies.STAYING_HOME, Hobbies.TRAVELING, Hobbies.WATCHING_TV}, 
				new Features[]{Features.FRIENDLY, Features.SENSITIVE, Features.TOLERANT}));
		Adoptions.save(new Adoption(dogAdapter22, DogBreeds.JackRussellTerrier));
		
		DogAdopter dogAdapter23 = (new DogAdopter(Gender.FEMALE, 22, FamilyStatus.SINGLE, CommunityType.CITY, Area.SOUTH,
				HouseType.GARDEN, DogCare.EVERYBODY, new Animals[]{Animals.NON}, Location.BOTH, 
				new Availability[]{Availability.MORNING, Availability.NOON, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY, FamilyType.BIG_CHILDREN, FamilyType.MULTIPLE_FAMILY}, new Relation[]{},
				new Hobbies[]{Hobbies.SLEEPING, Hobbies.TRAVELING, Hobbies.WATCHING_TV}, 
				new Features[]{Features.FRIENDLY, Features.SENSITIVE, Features.TOLERANT, Features.ANGRY}));
		Adoptions.save(new Adoption(dogAdapter23, DogBreeds.LabradorRetriever));
		
		DogAdopter dogAdapter24 = (new DogAdopter(Gender.FEMALE, 22, FamilyStatus.SINGLE, CommunityType.CITY, Area.SOUTH,
				HouseType.GARDEN, DogCare.EVERYBODY, new Animals[]{Animals.NON}, Location.BOTH, 
				new Availability[]{Availability.MORNING, Availability.NOON, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY, FamilyType.BIG_CHILDREN, FamilyType.MULTIPLE_FAMILY}, new Relation[]{},
				new Hobbies[]{Hobbies.SLEEPING, Hobbies.TRAVELING, Hobbies.WATCHING_TV}, 
				new Features[]{Features.FRIENDLY, Features.SENSITIVE, Features.TOLERANT, Features.ANGRY}));
		Adoptions.save(new Adoption(dogAdapter24, DogBreeds.GoldenRetriever));
		
		
		DogAdopter dogAdapter25 = (new DogAdopter(Gender.FEMALE, 21, FamilyStatus.SINGLE, CommunityType.MOSHAV, Area.SOUTH,
				HouseType.GARDEN, DogCare.EVERYBODY, new Animals[]{Animals.CAT}, Location.BOTH, 
				new Availability[]{Availability.MORNING, Availability.NOON, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY, FamilyType.BIG_CHILDREN, FamilyType.MULTIPLE_FAMILY}, new Relation[]{Relation.CARING_TO_PROPERTY},
				new Hobbies[]{Hobbies.WATCHING_TV}, new Features[]{Features.FRIENDLY, Features.SENSITIVE, Features.ANGRY}));
		Adoptions.save(new Adoption(dogAdapter25, DogBreeds.Pekingese));
		
		DogAdopter dogAdapter26 = (new DogAdopter(Gender.FEMALE, 12, FamilyStatus.SINGLE, CommunityType.CITY, Area.CENTER,
				HouseType.SMALL_APARTMENT, DogCare.EVERYBODY, new Animals[]{Animals.NON}, Location.INSIDE, 
				new Availability[]{Availability.NOON, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.QUIET}, new Relation[]{},
				new Hobbies[]{Hobbies.SLEEPING, Hobbies.SPORT, Hobbies.STAYING_HOME, Hobbies.WATCHING_TV}, 
				new Features[]{Features.AFRAID, Features.IGNORE, Features.ATTENTION}));
		Adoptions.save(new Adoption(dogAdapter26, DogBreeds.Maltese));
		
		DogAdopter dogAdapter27 = (new DogAdopter(Gender.FEMALE, 26, FamilyStatus.MARRIED, CommunityType.CITY, Area.CENTER,
				HouseType.SMALL_APARTMENT, DogCare.EVERYBODY, new Animals[]{Animals.DOG}, Location.INSIDE, 
				new Availability[]{Availability.MORNING, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY, FamilyType.QUIET}, new Relation[]{},
				new Hobbies[]{Hobbies.SLEEPING, Hobbies.TRAVELING, Hobbies.STAYING_HOME, Hobbies.WATCHING_TV}, 
				new Features[]{Features.FRIENDLY, Features.SENSITIVE, Features.TOLERANT}));
		Adoptions.save(new Adoption(dogAdapter27, DogBreeds.MiniaturePinscher));
		
		DogAdopter dogAdapter28 = (new DogAdopter(Gender.FEMALE, 20, FamilyStatus.MARRIED_WITH_CHILDREN, CommunityType.CITY, Area.SOUTH,
				HouseType.SMALL_APARTMENT, DogCare.EVERYBODY, new Animals[]{Animals.NON}, Location.INSIDE, 
				new Availability[]{Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.QUIET}, new Relation[]{Relation.CARING_TO_PROPERTY},
				new Hobbies[]{Hobbies.WATCHING_TV}, new Features[]{Features.FRIENDLY, Features.SENSITIVE, Features.SURRENDER}));
		Adoptions.save(new Adoption(dogAdapter28, DogBreeds.MiniaturePinscher));
		
		DogAdopter dogAdapter29 = (new DogAdopter(Gender.FEMALE, 21, FamilyStatus.SINGLE, CommunityType.MOSHAV, Area.NORTH,
				HouseType.GARDEN, DogCare.EVERYBODY, new Animals[]{Animals.NON}, Location.BOTH, 
				new Availability[]{Availability.NOON, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY, FamilyType.BIG_CHILDREN}, new Relation[]{Relation.CARING_TO_PROPERTY, Relation.LANDSCAPED_GARDEN},
				new Hobbies[]{Hobbies.SPORT,Hobbies.TRAVELING, Hobbies.STAYING_HOME}, new Features[]{Features.FRIENDLY, Features.TOLERANT}));
		Adoptions.save(new Adoption(dogAdapter29, DogBreeds.AmericanCockerSpaniel));
		
		DogAdopter dogAdapter30 = (new DogAdopter(Gender.FEMALE, 20, FamilyStatus.SINGLE, CommunityType.MOSHAV, Area.NORTH,
				HouseType.GARDEN, DogCare.EVERYBODY, new Animals[]{Animals.DOG}, Location.BOTH, 
				new Availability[]{Availability.MORNING, Availability.NOON, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY}, new Relation[]{Relation.LANDSCAPED_GARDEN},
				new Hobbies[]{Hobbies.WATCHING_TV,Hobbies.SLEEPING}, new Features[]{Features.FRIENDLY, Features.ANGRY}));
		Adoptions.save(new Adoption(dogAdapter30, DogBreeds.MiniaturePinscher));
		
		DogAdopter dogAdapter31 = (new DogAdopter(Gender.FEMALE, 20, FamilyStatus.SINGLE, CommunityType.MOSHAV, Area.NORTH,
				HouseType.GARDEN, DogCare.EVERYBODY, new Animals[]{Animals.DOG}, Location.BOTH, 
				new Availability[]{Availability.MORNING, Availability.NOON, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY}, new Relation[]{Relation.LANDSCAPED_GARDEN},
				new Hobbies[]{Hobbies.WATCHING_TV,Hobbies.SLEEPING}, new Features[]{Features.FRIENDLY, Features.ANGRY}));
		Adoptions.save(new Adoption(dogAdapter31, DogBreeds.LabradorRetriever));
		
		DogAdopter dogAdapter32 = (new DogAdopter(Gender.FEMALE, 48, FamilyStatus.SINGLE, CommunityType.CITY, Area.NORTH,
				HouseType.GARDEN, DogCare.EVERYBODY, new Animals[]{Animals.CAT}, Location.BOTH, 
				new Availability[]{Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{}, new Relation[]{},
				new Hobbies[]{Hobbies.STAYING_HOME}, new Features[]{Features.SENSITIVE}));
		Adoptions.save(new Adoption(dogAdapter32, DogBreeds.MiniaturePinscher));
		
		DogAdopter dogAdapter33 = (new DogAdopter(Gender.FEMALE, 21, FamilyStatus.SINGLE, CommunityType.MOSHAV, Area.NORTH,
				HouseType.GARDEN, DogCare.EVERYBODY, new Animals[]{Animals.NON}, Location.BOTH, 
				new Availability[]{Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.BIG_CHILDREN, FamilyType.LOAD}, new Relation[]{},
				new Hobbies[]{Hobbies.SPORT}, new Features[]{Features.SENSITIVE, Features.ANGRY, Features.IMPULSIVE}));
		Adoptions.save(new Adoption(dogAdapter33, DogBreeds.CavalierKingCharlesSpaniel));
		
		DogAdopter dogAdapter34 = (new DogAdopter(Gender.FEMALE, 74, FamilyStatus.SINGLE, CommunityType.CITY, Area.NORTH,
				HouseType.BIG_APARTMENT, DogCare.ME, new Animals[]{Animals.NON}, Location.INSIDE, 
				new Availability[]{Availability.MORNING, Availability.NOON, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.QUIET}, new Relation[]{Relation.CARING_TO_PROPERTY},
				new Hobbies[]{Hobbies.SPORT, Hobbies.TRAVELING, Hobbies.SLEEPING}, new Features[]{Features.FRIENDLY, Features.TOLERANT}));
		Adoptions.save(new Adoption(dogAdapter34, DogBreeds.LabradorRetriever));
		
		DogAdopter dogAdapter35 = (new DogAdopter(Gender.MALE, 22, FamilyStatus.SINGLE, CommunityType.CITY, Area.CENTER,
				HouseType.GARDEN, DogCare.EVERYBODY, new Animals[]{Animals.CAT}, Location.INSIDE, 
				new Availability[]{Availability.MORNING, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{}, new Relation[]{Relation.CARING_TO_PROPERTY},
				new Hobbies[]{Hobbies.WATCHING_TV}, new Features[]{Features.NEGLECT, Features.SURRENDER}));
		Adoptions.save(new Adoption(dogAdapter35, DogBreeds.LabradorRetriever));
		
		DogAdopter dogAdapter36 = (new DogAdopter(Gender.MALE, 23, FamilyStatus.MARRIED_WITH_CHILDREN, CommunityType.CITY, Area.CENTER,
				HouseType.SMALL_APARTMENT, DogCare.EVERYBODY, new Animals[]{Animals.NON}, Location.INSIDE, 
				new Availability[]{Availability.MORNING, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.QUIET, FamilyType.SMALL_CHILDREN}, new Relation[]{},
				new Hobbies[]{Hobbies.WATCHING_TV}, new Features[]{Features.NEGLECT, Features.FRIENDLY, Features.IMPULSIVE, Features.STUBBORN, Features.SENSITIVE}));
		Adoptions.save(new Adoption(dogAdapter36, DogBreeds.WhiteShepherd));
		
		DogAdopter dogAdapter37 = (new DogAdopter(Gender.FEMALE, 22, FamilyStatus.SINGLE, CommunityType.CITY, Area.CENTER,
				HouseType.GARDEN, DogCare.EVERYBODY, new Animals[]{Animals.NON}, Location.BOTH, 
				new Availability[]{Availability.MORNING, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.QUIET, FamilyType.BIG_CHILDREN}, new Relation[]{Relation.CARING_TO_PROPERTY},
				new Hobbies[]{Hobbies.WATCHING_TV, Hobbies.TRAVELING}, new Features[]{Features.IGNORE, Features.TOLERANT}));
		Adoptions.save(new Adoption(dogAdapter37, DogBreeds.BorderCollie));
		
		DogAdopter dogAdapter38 = (new DogAdopter(Gender.FEMALE, 51, FamilyStatus.MARRIED_WITH_CHILDREN, CommunityType.MOSHAV, Area.NORTH,
				HouseType.GARDEN, DogCare.EVERYBODY, new Animals[]{Animals.DOG}, Location.INSIDE, 
				new Availability[]{Availability.NOON, Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.BIG_CHILDREN}, new Relation[]{},
				new Hobbies[]{Hobbies.SPORT, Hobbies.STAYING_HOME, Hobbies.SWIMMING}, new Features[]{Features.ANGRY}));
		Adoptions.save(new Adoption(dogAdapter38, DogBreeds.AmericanCockerSpaniel));
		
		DogAdopter dogAdapter39 = (new DogAdopter(Gender.MALE, 24, FamilyStatus.SINGLE, CommunityType.CITY, Area.CENTER,
				HouseType.SMALL_APARTMENT, DogCare.EVERYBODY, new Animals[]{Animals.NON}, Location.INSIDE, 
				new Availability[]{Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY}, new Relation[]{},
				new Hobbies[]{Hobbies.SPORT}, new Features[]{Features.FRIENDLY, Features.SENSITIVE}));
		Adoptions.save(new Adoption(dogAdapter39, DogBreeds.MiniaturePinscher));
		
		DogAdopter dogAdapter40 = (new DogAdopter(Gender.FEMALE, 24, FamilyStatus.SINGLE, CommunityType.CITY, Area.CENTER,
				HouseType.BIG_APARTMENT, DogCare.EVERYBODY, new Animals[]{Animals.NON}, Location.INSIDE, 
				new Availability[]{Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.BIG_CHILDREN}, new Relation[]{Relation.CLEANING},
				new Hobbies[]{Hobbies.WATCHING_TV}, new Features[]{Features.FRIENDLY, Features.SENSITIVE, Features.TOLERANT}));
		Adoptions.save(new Adoption(dogAdapter40, DogBreeds.Poodle));
		
		DogAdopter dogAdapter41 = (new DogAdopter(Gender.FEMALE, 28, FamilyStatus.MARRIED_WITH_CHILDREN, CommunityType.MOSHAV, Area.CENTER,
				HouseType.GARDEN, DogCare.EVERYBODY, new Animals[]{Animals.NON}, Location.BOTH, 
				new Availability[]{Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.FRIENDLY}, new Relation[]{Relation.CARING_TO_PROPERTY, Relation.LANDSCAPED_GARDEN},
				new Hobbies[]{Hobbies.TRAVELING, Hobbies.SLEEPING}, new Features[]{Features.FRIENDLY, Features.IGNORE, Features.IMPULSIVE}));
		Adoptions.save(new Adoption(dogAdapter41, DogBreeds.BelgianShepherdMalinois));
		
		DogAdopter dogAdapter42 = (new DogAdopter(Gender.MALE, 28, FamilyStatus.MARRIED, CommunityType.KIBBUTZ, Area.CENTER,
				HouseType.GARDEN, DogCare.EVERYBODY, new Animals[]{Animals.NON}, Location.BOTH, 
				new Availability[]{Availability.EVENING}, new HealthStatus[]{HealthStatus.HEALTHY},
				new FamilyType[]{FamilyType.QUIET, FamilyType.FRIENDLY}, new Relation[]{Relation.CARING_TO_PROPERTY},
				new Hobbies[]{Hobbies.TRAVELING, Hobbies.SWIMMING, Hobbies.SPORT}, new Features[]{Features.FRIENDLY, Features.IGNORE, Features.IMPULSIVE}));
		Adoptions.save(new Adoption(dogAdapter42, DogBreeds.Greyhound));
	}
}






/*DogAdopter dogAdapter = new DogAdopter();
dogAdapter.setGender(Gender.MALE);
dogAdapter.setAge(23);
dogAdapter.setFamilyStatus(FamilyStatus.SINGLE);
dogAdapter.setCommunityType(CommunityType.CITY);
dogAdapter.setArea(Area.SOUTH);
dogAdapter.setHouseType(HouseType.GARDEN);		
dogAdapter.setDogCare(DogCare.EVERYBODY);
dogAdapter.setOtherAnimals(new Animals[]{Animals.NON});
dogAdapter.setDogLocation(Location.OUTSIDE);
dogAdapter.setAvailability(new Availability[]{Availability.EVENING,Availability.NOON});
dogAdapter.setHealthStatus(new HealthStatus[]{HealthStatus.HEALTHY});
dogAdapter.setFamilyType(new FamilyType[]{FamilyType.FRIENDLY,FamilyType.BIG_CHILDREN});
dogAdapter.setRelationToProperty(new Relation[]{Relation.CARING_TO_PROPERTY});
dogAdapter.setFamilyHobbies(new Hobbies[]{Hobbies.SPORT,Hobbies.SLEEPING});
dogAdapter.setFamilyFeature(new Features[]{Features.FRIENDLY, Features.TOLERANT, Features.STUBBORN});
*/