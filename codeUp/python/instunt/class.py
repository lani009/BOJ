class Student:
    name = ""
    age = 0
    sex = 0 #0이면 남자. 1이면 여자
    def set(self, name, age, sex):
        self.name = name
        self.age = age
        self.sex = sex

    def getAge(self):
        return self.age

    def getName(self):
        return self.name

    def getSex(self):
        return self.sex

stu = [Student(), Student(), Student()]
stu[0].set("park", 6, 0)
stu[1].set("jung", 11, 1)
stu[2].set("kang", 15, 0)

print(stu[0].getAge())
