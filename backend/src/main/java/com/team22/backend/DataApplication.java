package com.Team22.backend;

import com.Team22.backend.Entity.*;
import com.Team22.backend.Repository.*;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.stream.Stream;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@SpringBootApplication
public class DataApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DataApplication.class, args);
	}


	@Bean
	CharacterEncodingFilter characterEncodingFilter() {
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding("UTF-8");
		filter.setForceEncoding(true);
		return filter;
	}

	@Bean
	ApplicationRunner init(PositionRepository positionRepository,
						   StaffRepository staffRepository,
						   EducationRepository educationRepository,
						   ExperienceRepository experienceRepository
	) {
		return args -> {

			Stream.of("0 Year","1-3 Year","4-6 Year","7-9 Year","10 to Up").forEach(ExName -> {
				Experience experiencedb = new Experience();
				experiencedb.setExperienceName(ExName);
				experienceRepository.save(experiencedb);

				if (ExName == "0 Year") {
					experiencedb.setExperienceIds("Ex"+experiencedb.getExperienceId());
					experiencedb.setExperienceName(ExName);
					experienceRepository.save(experiencedb);
				}
				else if(ExName == "1-3 Year") {
					experiencedb.setExperienceIds("Ex"+experiencedb.getExperienceId());
					experiencedb.setExperienceName(ExName);
					experienceRepository.save(experiencedb);
				}if (ExName == "4-6 Year") {
					experiencedb.setExperienceIds("Ex"+experiencedb.getExperienceId());
					experiencedb.setExperienceName(ExName);
					experienceRepository.save(experiencedb);
				}
				else if(ExName == "7-9 Year") {
					experiencedb.setExperienceIds("Ex"+experiencedb.getExperienceId());
					experiencedb.setExperienceName(ExName);
					experienceRepository.save(experiencedb);
				}else if (ExName == "10 to Up") {
					experiencedb.setExperienceIds("Ex"+experiencedb.getExperienceId());
					experiencedb.setExperienceName(ExName);
					experienceRepository.save(experiencedb);
				}
			});
			Experience ex1 = experienceRepository.findByExperienceId(1L);
			Experience ex2 = experienceRepository.findByExperienceId(2L);
			Experience ex3 = experienceRepository.findByExperienceId(3L);
			Experience ex4 = experienceRepository.findByExperienceId(4L);
			Experience ex5 = experienceRepository.findByExperienceId(5L);

			Stream.of("M.3","M.6","Polytechnical College","Technical College","Bachelor Degrees","Master Degrees").forEach(EduName -> {
				Education educationdb = new Education();
				educationdb.setEducationName(EduName);
				educationRepository.save(educationdb);

				if (EduName == "M.3") {
					educationdb.setEducationIds("E"+educationdb.getEducationId());
					educationdb.setEducationName(EduName);
					educationRepository.save(educationdb);
				}
				else if(EduName == "M.6") {
					educationdb.setEducationIds("E"+educationdb.getEducationId());
					educationdb.setEducationName(EduName);
					educationRepository.save(educationdb);
				}
				else if (EduName == "Polytechnical College") {
					educationdb.setEducationIds("E"+educationdb.getEducationId());
					educationdb.setEducationName(EduName);
					educationRepository.save(educationdb);
				}
				else if(EduName == "Technical College") {
					educationdb.setEducationIds("E"+educationdb.getEducationId());
					educationdb.setEducationName(EduName);
					educationRepository.save(educationdb);
				}
				else if (EduName == "Bachelor Degrees") {
					educationdb.setEducationIds("E"+educationdb.getEducationId());
					educationdb.setEducationName(EduName);
					educationRepository.save(educationdb);
				}
				else if(EduName == "Master Degrees") {
					educationdb.setEducationIds("E"+educationdb.getEducationId());
					educationdb.setEducationName(EduName);
					educationRepository.save(educationdb);
				}
			});

			Education ed1 = educationRepository.findByEducationId(1L);
			Education ed2 = educationRepository.findByEducationId(2L);
			Education ed3 = educationRepository.findByEducationId(3L);
			Education ed4 = educationRepository.findByEducationId(4L);
			Education ed5 = educationRepository.findByEducationId(5L);
			Education ed6 = educationRepository.findByEducationId(6L);

			Stream.of("Stylist","Service","HairStylist", "MakeupArtist","Renter","Seller","Accountant").forEach(posName -> {
				Position positiondb = new Position();
				positiondb.setPositionName(posName);
				positionRepository.save(positiondb);

				if (posName == "Stylist") {
					positiondb.setPositionIds("P"+positiondb.getPositionId());
					positiondb.setPositionName(posName);
					positionRepository.save(positiondb);
				}

				else if(posName == "Service") {
					positiondb.setPositionIds("P"+positiondb.getPositionId());
					positiondb.setPositionName(posName);
					positionRepository.save(positiondb);
				}

				else if (posName == "HairStylist") {
					positiondb.setPositionIds("P"+positiondb.getPositionId());
					positiondb.setPositionName(posName);
					positionRepository.save(positiondb);
				}

				else if(posName == "MakeupArtist") {
					positiondb.setPositionIds("P"+positiondb.getPositionId());
					positiondb.setPositionName(posName);
					positionRepository.save(positiondb);
				}

				else if(posName == "Renter") {
					positiondb.setPositionIds("P"+positiondb.getPositionId());
					positiondb.setPositionName(posName);
					positionRepository.save(positiondb);
				}

				else if(posName == "Seller") {
					positiondb.setPositionIds("P"+positiondb.getPositionId());
					positiondb.setPositionName(posName);
					positionRepository.save(positiondb);
				}

				else if(posName == "Accountant") {
					positiondb.setPositionIds("P"+positiondb.getPositionId());
					positiondb.setPositionName(posName);
					positionRepository.save(positiondb);
				}
			});

			Position po1 = positionRepository.findByPositionId(1L);
			Position po2 = positionRepository.findByPositionId(2L);
			Position po3 = positionRepository.findByPositionId(3L);
			Position po4 = positionRepository.findByPositionId(4L);
			Position po5 = positionRepository.findByPositionId(5L);
			Position po6 = positionRepository.findByPositionId(6L);
			Position po7 = positionRepository.findByPositionId(7L);


			Stream.of("Admin", "Ploy").forEach(staffName -> {
				Staff staffdb = new Staff();
				staffdb.setStaffName(staffName);
				staffRepository.save(staffdb);

				if (staffName == "Admin") {
					staffdb.setStaffIds("St"+staffdb.getStaffId());
					staffdb.setStaffName(staffName);
					staffdb.setStaffGender("Man");
					staffdb.setEducation(ed1);
					staffdb.setExperience(ex1);
					staffdb.setStaffPhone("086-141-9833");
					staffdb.setStaffJobtype("Full Time");
					staffdb.setStaffSalary(15000);
					staffdb.setPosition(po6);
					staffdb.setStaffStatus("Un Paid");
					staffRepository.save(staffdb);
				}
				else    if (staffName == "Ploy") {
					staffdb.setStaffIds("St"+staffdb.getStaffId());
					staffdb.setStaffName(staffName);
					staffdb.setStaffGender("Woman");
					staffdb.setEducation(ed2);
					staffdb.setExperience(ex2);
					staffdb.setStaffPhone("081-108-6559");
					staffdb.setStaffJobtype("Path Time");
					staffdb.setStaffSalary(25000);
					staffdb.setPosition(po5);
					staffdb.setStaffStatus("Un Paid");
					staffRepository.save(staffdb);
				}
			});
			Staff st1 = staffRepository.findByStaffId(1L);
			Staff st2 = staffRepository.findByStaffId(2L);


			System.out.println("\n Spring-Boot Complete");
		};
	}
}