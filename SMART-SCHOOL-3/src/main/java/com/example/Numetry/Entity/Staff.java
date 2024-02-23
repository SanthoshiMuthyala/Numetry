package com.example.Numetry.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StaffMembersDetails")
public class Staff {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		private String employmentStatus;
		private String designation;
		private String trainedAs;
		private String staffType;
		private String qualificationType;
		private boolean cTETQualified;
		private String staffdepartment;
		private String educationqualification;
		private String employementcategory;
		private String accesslevel;
		private String firstName;
		private String middlename;
		private String lastname;
		private String mobileno;
		private String emergencycontactno;
		private String DOB;
		private String gender;
		private String emailid;
		private String permanentaddress;
		private String corrspondingaddress;
		private String religion;
		private String adharno;
		private String pancardno;	
		private String DOJ;	
		private String staffrefencecode;
		private String salaryType;
		private String governmentid;
		private String citizenship;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getEmploymentStatus() {
			return employmentStatus;
		}
		public void setEmploymentStatus(String employmentStatus) {
			this.employmentStatus = employmentStatus;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getTrainedAs() {
			return trainedAs;
		}
		public void setTrainedAs(String trainedAs) {
			this.trainedAs = trainedAs;
		}
		public String getStaffType() {
			return staffType;
		}
		public void setStaffType(String staffType) {
			this.staffType = staffType;
		}
		public String getQualificationType() {
			return qualificationType;
		}
		public void setQualificationType(String qualificationType) {
			this.qualificationType = qualificationType;
		}
		public boolean iscTETQualified() {
			return cTETQualified;
		}
		public void setcTETQualified(boolean cTETQualified) {
			this.cTETQualified = cTETQualified;
		}
		public String getStaffdepartment() {
			return staffdepartment;
		}
		public void setStaffdepartment(String staffdepartment) {
			this.staffdepartment = staffdepartment;
		}
		public String getEducationqualification() {
			return educationqualification;
		}
		public void setEducationqualification(String educationqualification) {
			this.educationqualification = educationqualification;
		}
		public String getEmployementcategory() {
			return employementcategory;
		}
		public void setEmployementcategory(String employementcategory) {
			this.employementcategory = employementcategory;
		}
		public String getAccesslevel() {
			return accesslevel;
		}
		public void setAccesslevel(String accesslevel) {
			this.accesslevel = accesslevel;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getMiddlename() {
			return middlename;
		}
		public void setMiddlename(String middlename) {
			this.middlename = middlename;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getMobileno() {
			return mobileno;
		}
		public void setMobileno(String mobileno) {
			this.mobileno = mobileno;
		}
		public String getEmergencycontactno() {
			return emergencycontactno;
		}
		public void setEmergencycontactno(String emergencycontactno) {
			this.emergencycontactno = emergencycontactno;
		}
		public String getDOB() {
			return DOB;
		}
		public void setDOB(String dOB) {
			DOB = dOB;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getEmailid() {
			return emailid;
		}
		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}
		public String getPermanentaddress() {
			return permanentaddress;
		}
		public void setPermanentaddress(String permanentaddress) {
			this.permanentaddress = permanentaddress;
		}
		public String getCorrspondingaddress() {
			return corrspondingaddress;
		}
		public void setCorrspondingaddress(String corrspondingaddress) {
			this.corrspondingaddress = corrspondingaddress;
		}
		public String getReligion() {
			return religion;
		}
		public void setReligion(String religion) {
			this.religion = religion;
		}
		public String getAdharno() {
			return adharno;
		}
		public void setAdharno(String adharno) {
			this.adharno = adharno;
		}
		public String getPancardno() {
			return pancardno;
		}
		public void setPancardno(String pancardno) {
			this.pancardno = pancardno;
		}
		public String getDOJ() {
			return DOJ;
		}
		public void setDOJ(String dOJ) {
			DOJ = dOJ;
		}
		public String getStaffrefencecode() {
			return staffrefencecode;
		}
		public void setStaffrefencecode(String staffrefencecode) {
			this.staffrefencecode = staffrefencecode;
		}
		public String getSalaryType() {
			return salaryType;
		}
		public void setSalaryType(String salaryType) {
			this.salaryType = salaryType;
		}
		public String getGovernmentid() {
			return governmentid;
		}
		public void setGovernmentid(String governmentid) {
			this.governmentid = governmentid;
		}
		public String getCitizenship() {
			return citizenship;
		}
		public void setCitizenship(String citizenship) {
			this.citizenship = citizenship;
		}
		public Staff(String employmentStatus, String designation, String trainedAs, String staffType,
				String qualificationType, boolean cTETQualified, String staffdepartment, String educationqualification,
				String employementcategory, String accesslevel, String firstName, String middlename, String lastname,
				String mobileno, String emergencycontactno, String dOB, String gender, String emailid,
				String permanentaddress, String corrspondingaddress, String religion, String adharno, String pancardno,
				String dOJ, String staffrefencecode, String salaryType, String governmentid, String citizenship) {
			super();
			this.employmentStatus = employmentStatus;
			this.designation = designation;
			this.trainedAs = trainedAs;
			this.staffType = staffType;
			this.qualificationType = qualificationType;
			this.cTETQualified = cTETQualified;
			this.staffdepartment = staffdepartment;
			this.educationqualification = educationqualification;
			this.employementcategory = employementcategory;
			this.accesslevel = accesslevel;
			this.firstName = firstName;
			this.middlename = middlename;
			this.lastname = lastname;
			this.mobileno = mobileno;
			this.emergencycontactno = emergencycontactno;
			this.DOB = dOB;
			this.gender = gender;
			this.emailid = emailid;
			this.permanentaddress = permanentaddress;
			this.corrspondingaddress = corrspondingaddress;
			this.religion = religion;
			this.adharno = adharno;
			this.pancardno = pancardno;
			this.DOJ = dOJ;
			this.staffrefencecode = staffrefencecode;
			this.salaryType = salaryType;
			this.governmentid = governmentid;
			this.citizenship = citizenship;
		}
		@Override
		public String toString() {
			return "StaffDetails [id=" + id + ", employmentStatus=" + employmentStatus + ", designation=" + designation
					+ ", trainedAs=" + trainedAs + ", staffType=" + staffType + ", qualificationType=" + qualificationType
					+ ", cTETQualified=" + cTETQualified + ", staffdepartment=" + staffdepartment
					+ ", educationqualification=" + educationqualification + ", employementcategory=" + employementcategory
					+ ", accesslevel=" + accesslevel + ", firstName=" + firstName + ", middlename=" + middlename
					+ ", lastname=" + lastname + ", mobileno=" + mobileno + ", emergencycontactno=" + emergencycontactno
					+ ", DOB=" + DOB + ", gender=" + gender + ", emailid=" + emailid + ", permanentaddress="
					+ permanentaddress + ", corrspondingaddress=" + corrspondingaddress + ", religion=" + religion
					+ ", adharno=" + adharno + ", pancardno=" + pancardno + ", DOJ=" + DOJ + ", staffrefencecode="
					+ staffrefencecode + ", salaryType=" + salaryType + ", governmentid=" + governmentid + ", citizenship="
					+ citizenship + "]";
		}
		public Staff() {
			
		}
		
		
		
		
		
	


}
