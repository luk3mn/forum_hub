<!--<a name="forum_hub">
    <img src="https://raw.githubusercontent.com/luk3mn/luk3mn/main/soft_cover.png" width="1480">
</a>-->

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
![personal][personal-shield]
[![Issues][issues-shield]][issues-url]
[![LinkedIn][linkedin-shield]][linkedin-url]
![Badge em Desenvolvimento](https://img.shields.io/static/v1?label=STATUS&message=Progressing&color=GREEN&style=for-the-badge)

<!-- ![image](soft%20(1).png) -->



<!-- PROJECT LOGO -->
<br />
<div align="center">

  <h3 align="center">Challenge ONE: Forum Hub</h3>

  <p align="center">
    Backend application developed in Java and Spring Boot to create a dynamic forum hub where users can exchange questions and solutions
    <br />
    <a href="https://github.com/luk3mn/forum_hub/README.md"><strong>Explore the docs »</strong></a>
    <br />
    <br />
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <!-- <li><a href="#deploy">Deploy</a></li> -->
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#authors">Authors</a></li>
    <li><a href="#feedback">Feedback</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project
<!-- IMAGE (OPCIONAL) -->

<p align="justify">
Backend application developed in Java and Spring Boot to create a dynamic forum hub where users can exchange questions and solutions. The system facilitates user registration, posting of queries, and sharing of answers, fostering an interactive community for problem-solving and knowledge exchange. The application ensures efficient data management and provides a seamless user experience for forum participants.
</p> 

<div align="center">
    <img width=1000 src="assets/diagram_db.png" alt="diagram"/>
</div>

<p align="right">(<a href="#forum_hub">back to top</a>)</p>

### Built With

* [![Java][Java]][Java-url]
* [![Spring][Spring]][Spring-url]
* [![MySQL][MySQL]][MySQL-url]

<p align="right">(<a href="#forum_hub">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

Here are some important topics about this project and how to replay it.

### Prerequisites

* Java 17
* Docker

### Installation

_Before starting this application in your local environment, it'll be necessary to proceed with some tasks to reproduce this project._

1. Clone the repo
   ```sh
   git clone https://github.com/luk3mn/forum_hub.git
   ```
2. To set up database by using Docker
   ```shell
   sudo docker-compose up -d
   ```

<p align="right">(<a href="#forum_hub">back to top</a>)</p>



<!-- USAGE EXAMPLES -->
<!-- ## Usage -->

<!-- Deploy -->
## Deploy
- Java Build Application
```shell

```


<!-- ROADMAP -->
## Roadmap
- [x] Initial project configuration
- [x] Database setup
- [ ] GET /topicos
- [ ] GET /topicos/{id}
- [ ] POST /topicos
- [ ] PUT /topicos/{id}
- [ ] DELETE /topicos/{id}
- [ ] POST /auth
- [ ] Spring Security -> Authentication method (JWT - Token)
- [ ] Validation

<p align="right">(<a href="#forum_hub">back to top</a>)</p>



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#forum_hub">back to top</a>)</p>



## Authors

- username: [@luk3mn](https://www.github.com/luk3mn)

## Feedback

If you have any feedback, please reach out to us at lucasnunes2030@gmail.com

> Project Link: [https://github.com/luk3mn/forum_hub](https://github.com/luk3mn/forum_hub)

<p align="right">(<a href="#forum_hub">back to top</a>)</p>


<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

* [java-jwt](https://github.com/auth0/java-jwt)

<p align="right">(<a href="#forum_hub">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/luk3mn/forum_hub.svg?style=for-the-badge
[contributors-url]: https://github.com/luk3mn/forum_hub/graphs/contributors
[issues-shield]: https://img.shields.io/github/issues/luk3mn/forum_hub.svg?style=for-the-badge
[issues-url]: https://github.com/luk3mn/forum_hub/issues
[forks-shield]: https://img.shields.io/github/forks/luk3mn/forum_hub.svg?style=for-the-badge
[forks-url]: https://github.com/luk3mn/forum_hub/network/members
[stars-shield]: https://img.shields.io/github/stars/luk3mn/forum_hub.svg?style=for-the-badge
[stars-url]: https://github.com/luk3mn/forum_hub/stargazers
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/luk3mn/forum_hub/blob/master/LICENSE
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/lucasmaues/
[personal-shield]: https://img.shields.io/static/v1?label=Oracle_one&message=Alura&color=2e3643&style=for-the-badge&colorB=555

<!-- Stack Shields -->
[Java]: https://img.shields.io/badge/Java-E02027?style=for-the-badge&logo=java&logoColor=ffffff
[Java-url]: https://www.java.com/en/
[Spring]: https://img.shields.io/badge/SrpingBoot-6DB33F?style=for-the-badge&logo=springboot&logoColor=ffffff
[Spring-url]: https://spring.io/projects/spring-boot
[MySQL]: https://img.shields.io/badge/MySQL-00758f?style=for-the-badge&logo=mysql&logoColor=ffffff
[MySQL-url]: https://dev.mysql.com/doc/
