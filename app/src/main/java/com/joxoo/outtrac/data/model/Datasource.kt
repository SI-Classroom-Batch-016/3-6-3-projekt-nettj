package com.joxoo.outtrac.data.model

class Datasource {

    private val employees: MutableList<Employee> = mutableListOf(
        Employee(
            "urn:employee:1",
            Person(
                "urn:person:1",
                "John",
                "Wick",
                "",
                Address(
                    "Waldemare-Streit-Str. 1",
                    "123 Main St",
                    "Anytown",
                    "NY",
                    "12345",
                )
            ),
            "Doe",
            "",
            EmployeeCategoryEnum.WORKER,
            EmployeeStatusEnum.ACTIVE,
            WorkLogSummary(
                "urn:worklog:1",
                8.0f,
                16.0f,
                16.0f,
                8.0f,
                40.0f,
                160.0f
            ),
        ),
        Employee(
            "urn:employee:2",
            Person(
                "urn:person:2",
                "Jane",
                "Tarzan",
                "",
                Address(
                    "Casper-Platz 1",
                    "456 Elm St",
                    "Othertown",
                    "NY",
                    "12345",
                )
            ),
            "Doe",
            "",
            EmployeeCategoryEnum.DISPATCHER,
            EmployeeStatusEnum.ACTIVE,
            WorkLogSummary(
                "urn:worklog:2",
                7.0f,
                35.0f,
                35.0f,
                8.0f,
                40.0f,
                160.0f
            ),
        ),
        Employee(
            "urn:employee:3",
            Person(
                "urn:person:3",
                "Jim",
                "Myers",
                "",
                Address(
                    "Manfred-strauss-str. 1",
                    "789 Oak St",
                    "Thistown",
                    "NY",
                    "12345",
                )
            ),
            "Doe",
            "",
            EmployeeCategoryEnum.MANAGER,
            EmployeeStatusEnum.HIRED,
            WorkLogSummary(
                "urn:worklog:3",
                8.0f,
                40.0f,
                160.0f,
                8.0f,
                40.0f,
                160.0f
            ),
        ),
        Employee(
            "urn:employee:4",
            Person(
                "urn:person:4",
                "Jill",
                "Dill",
                "",
                Address(
                    "Forststr. 1",
                    "101 Pine St",
                    "Thatplace",
                    "NY",
                    "12345",
                )
            ),
            "Doe",
            "",
            EmployeeCategoryEnum.DIRECTOR,
            EmployeeStatusEnum.ACTIVE,
            WorkLogSummary(
                "urn:worklog:4",
                8.0f,
                40.0f,
                40.0f,
                8.0f,
                40.0f,
                160.0f
            )
        ),
        Employee(
            "urn:employee:5",
            Person(
                "urn:person:5",
                "Jack",
                "Daniels",
                "",
                Address(
                    "Karl-heinz-str. 10",
                    "111 Maple St",
                    "Thistown",
                    "NY",
                    "12345",
                )
            ),
            "Doe",
            "",
            EmployeeCategoryEnum.MANAGER,
            EmployeeStatusEnum.SICK,
            WorkLogSummary(
                "urn:worklog:5",
                8.0f,
                40.0f,
                160.0f,
                8.0f,
                40.0f,
                160.0f
            )
        ),
        Employee(
            "urn:employee:6",
            Person(
                "urn:person:6",
                "Bill",
                "Kill",
                "",
                Address(
                    "Schulstr. 9",
                    "101 Pine St",
                    "Thatplace",
                    "NY",
                    "12345",
                )
            ),
            "Doe",
            "",
            EmployeeCategoryEnum.WORKER,
            EmployeeStatusEnum.SUSPENDED,
            WorkLogSummary(
                "urn:worklog:6",
                2.0f,
                8.0f,
                8.0f,
                8.0f,
                40.0f,
                160.0f
            )
        ),
        Employee(
            "urn:employee:7",
            Person(
                "urn:person:7",
                "Jack",
                "Doe",
                "",
                Address(
                    "Robert-koch-str. 21b",
                    "111 Maple St",
                    "Thistown",
                    "NY",
                    "12345",
                )
            ),
            "Doe",
            "",
            EmployeeCategoryEnum.WORKER,
            EmployeeStatusEnum.VACATION,
            WorkLogSummary(
                "urn:worklog:7",
                8.0f,
                40.0f,
                160.0f,
                8.0f,
                40.0f,
                160.0f
            )
        ),
        Employee(
            "urn:employee:8",
            Person(
                "urn:person:8",
                "Megan",
                "Princess",
                "",
                Address(
                    "Lindenstr. 11c",
                    "101 Pine St",
                    "Thatplace",
                    "NY",
                    "12345",
                )
            ),
            "Doe",
            "",
            EmployeeCategoryEnum.WORKER,
            EmployeeStatusEnum.ACTIVE,
            WorkLogSummary(
                "urn:worklog:8",
                5.0f,
                10.0f,
                10.0f,
                8.0f,
                40.0f,
                160.0f
            )
        ),

        Employee(
            "urn:employee:9",
            Person(
                "urn:person:9",
                "Frank",
                "Castle",
                "",
                Address(
                    "Karl-Marx-Str. 13",
                    "101 Pine St",
                    "Thatplace",
                    "NY",
                    "12345",
                )
            ),
            "Doe",
            "",
            EmployeeCategoryEnum.WORKER,
            EmployeeStatusEnum.ACTIVE,
            WorkLogSummary(
                "urn:worklog:9",
                8.0f,
                40.0f,
                160.0f,
                8.0f,
                40.0f,
                160.0f
            )
        ),

        Employee(
            "urn:employee:10",
            Person(
                "urn:person:10",
                "Bruce",
                "Wayne",
                "",
                Address(
                    "Hauptstr. 1",
                    "101 Pine St",
                    "Thatplace",
                    "NY",
                    "12345",
                )
            ),
            "Doe",
            "",
            EmployeeCategoryEnum.WORKER,
            EmployeeStatusEnum.ACTIVE,
            WorkLogSummary(
                "urn:worklog:10",
                8.0f,
                40.0f,
                160.0f,
                8.0f,
                40.0f,
                160.0f
            )
        ),

        Employee(
            "urn:employee:11",
            Person(
                "urn:person:11",
                "Clark",
                "Kent",
                "",
                Address(
                    "Heinrich-Heine-Str. 30",
                    "101 Pine St",
                    "Thatplace",
                    "NY",
                    "12345",
                )
            ),
            "Doe",
            "",
            EmployeeCategoryEnum.WORKER,
            EmployeeStatusEnum.ACTIVE,
            WorkLogSummary(
                "urn:worklog:11",
                8.0f,
                40.0f,
                160.0f,
                8.0f,
                40.0f,
                160.0f
            )
        ),

    )

    fun getEmployee(urn: String): Employee? {
        return employees.find { it.urn == urn }
    }

    fun getEmployees(): MutableList<Employee> {
        return employees
    }

}