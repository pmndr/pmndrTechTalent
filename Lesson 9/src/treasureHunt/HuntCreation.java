package treasureHunt;

public class HuntCreation {
	private String name;
	private String classes;
	private String weapon;
	
		public HuntCreation(String name, String classes, String weapon) {
			this.name = name;
			this.classes = classes;
			this.weapon = weapon;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getClasses() {
			return classes;
		}

		public void setClasses(String classes) {
			this.classes = classes;
		}

		public String getWeapon() {
			return weapon;
		}

		public void setWeapon(String weapon) {
			this.weapon = weapon;
		}
}
