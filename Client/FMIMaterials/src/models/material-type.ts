import { Material } from "./material";

export class MaterialType {
    constructor(private _fullname:string, private _materials?:Material[]) {
    }

    get fullname(){
        return this._fullname;
    }

    set fullname(value) {
        this._fullname = value;
    }

    get materials(){
        return this._materials;
    }

    set materials(value) {
        this._materials = value;
    }
}