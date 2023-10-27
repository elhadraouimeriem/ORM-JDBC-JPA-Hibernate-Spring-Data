package ma.meriem.jpaap;

import ma.meriem.jpaap.entities.Patient;
import ma.meriem.jpaap.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.awt.print.Pageable;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class JpaApApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;
    int i=0;
    public static void main(String[] args) {
        SpringApplication.run(JpaApApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for(int j=0;j<100;j++){
            patientRepository.save(new Patient(null, "meriem", new Date(), Math.random()>0.5?true:false,(int)(Math.random()*100)));

        }
        //patientRepository.save(new Patient(null, "fatima-ezzahra", new Date(), false, 78));
       // patientRepository.save(new Patient(null, "abdelali", new Date(), false, 100));
        System.out.println("***********liste des patients***********");
        Page<Patient> patients = patientRepository.findAll(PageRequest.of(1,5));
        System.out.println("================== infos de la page ========================");

        System.out.println("Total pages:"+patients.getTotalPages());
        System.out.println("Total élements:"+patients.getTotalElements());
        System.out.println("Num page:"+patients.getNumber());
        List<Patient> content=patients.getContent();
        System.out.println("================== les patients malades ========================");

        Page<Patient>byMalade= patientRepository.findByMalade(true,PageRequest.of(0,4));
        List<Patient>patientList=patientRepository.chercherPatients("%m%",40);
        patientList.forEach(p -> {
            i += 1;
            System.out.println("================== le patient " + i + " ========================");
            System.out.println(p.getId());
            System.out.println("Nom:" + p.getNom());
            System.out.println("La date de naissance:" + p.getDateNaissance());
            System.out.println("Le score:" + p.getScore());
            System.out.println("Malade:" + p.isMalade());
        });
        System.out.println("***********chercher Patient ***********");
        Patient patient = patientRepository.findById(1L).orElse(null);//1L est équivalent a new Long(1)
        if (patient != null) {
            System.out.println("Nom:" + patient.getNom());
            System.out.println("La date de naissance:" + patient.getDateNaissance());
            System.out.println("Le score:" + patient.getScore());
            System.out.println("Malade:" + patient.isMalade());
        }else{
            System.out.println("patient not found");
        }
        patient.setScore(870);
        patientRepository.save(patient);
        patientRepository.deleteById(1L);
    }
}
